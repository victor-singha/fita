import java.util.*;

public class Hashmap {
    public static void main(String args[]) {
        HashMap<String, String> tech = new HashMap<String, String>();
        tech.put("javascript", "node");
        tech.put("java", "android");
        tech.put("kotlin", "android");
        tech.put("php", "web-backend");
        tech.put("swift", "ios");
        tech.put("python", "django");
        System.out.println(tech);
        ArrayList<String> language = new ArrayList<String>(Arrays.asList("c", "c++", "c#"));
        ArrayList<String> technology = new ArrayList<String>(Arrays.asList("System App", "Game", "Unity Engine"));
        for (int i = 0; i < language.size(); i++) {
            tech.put(language.get(i), technology.get(i));
        }
        System.out.println(tech);
        // print all the keys in HashMap
        System.out.println(tech.keySet());
    }

}
