import java.util.*;

class Arraylist {
    public static void main(String args[]) {
        // initialise ArrayList
        ArrayList<String> language = new ArrayList<String>(Arrays.asList("java", "python", "c", "c++", "php"));
        // add data
        language.add("javascript");
        language.add("ruby");
        language.add("c#");
        for (String i : language) {
            // get data without index
            System.out.println(i);
        }
        for (int i = 0; i < language.size(); i++) {
            // get data from ArrayList through index
            System.out.println(language.get(i));
        }
        // print whole ArrayList
        System.out.println(language);
    }
}