import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Code {

    static int totalScore = 0;

    public static void main(String[] args) {

        // JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("question.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray questionList = (JSONArray) obj;
            // System.out.println(questionList);

            // Iterate over question array
            JSONArray shuffledQuestionList = shuffleJsonArray(questionList);
            // System.out.println(shuffledQuestionList);

            for (Object ob : shuffledQuestionList) {
                parseQuestionObject((JSONObject) ob);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // System.out.println(totalScore);
        if (totalScore > 20) {
            System.out.println("You have 'High Risk' of having Fever !!!");
        } else {
            System.out.println("You are Safe :)");
        }
    }

    private static void parseQuestionObject(JSONObject questionObj) {

        String question = (String) questionObj.get("question");
        System.out.println(question);

        String score = (String) questionObj.get("score");
        int _score = Integer.parseInt(score);
        // System.out.println(_score);

        String weight = (String) questionObj.get("weight");
        int _weight = Integer.parseInt(weight);
        // System.out.println(_weight);

        String keys = (String) questionObj.get("keys");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        boolean found = searchKeyword(keys, answer);
        if (found) {
            totalScore = totalScore + _score;
        }

    }

    public static boolean searchKeyword(String keys, String answer) {

        String strArray[] = answer.trim().split(" ");
        boolean found = false;

        for (String i : strArray) {

            if (keys.toLowerCase().indexOf(i.toLowerCase()) != -1) {

                // System.out.println("-------KEY FOUND-------");
                found = true;
                break;

            } else {

                // System.out.println("XXXXXXXXXX-NOT-FOUND-XXXXXXXXXXXXX");
                found = false;

            }
        }

        if (found) {
            return true;
        } else
            return false;

    }

    public static JSONArray shuffleJsonArray(JSONArray questionList) {
        // Implementing Fisher–Yates shuffle
        Random rnd = new Random();
        for (int i = questionList.size() - 1; i >= 0; i--) {
            int j = rnd.nextInt(i + 1);
            // Simple swap
            Object object = questionList.get(j);
            questionList.add(j, questionList.get(i));
            questionList.remove(j + 1);
            questionList.add(i, object);
            questionList.remove(i + 1);
        }
        return questionList;
    }
}