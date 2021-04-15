import java.util.*;

class Arraylist {
    public static void main(String args[]) {
        ArrayList<String> language = new ArrayList<String>(Arrays.asList("java", "python", "c", "c++", "php"));
        for (String i : language) {
            System.out.println(i);
        }
        System.out.println(language);
    }
}