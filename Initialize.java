import java.util.*;

public class Initialize {
    public static void main(String args[]) {
        // String Initialize
        String constant_pool = "Victor"; // memory in String constant pool
        String heap_memory = new String("victor"); // memory in Heap Area

        // Array declare
        String names[] = new String[10];

        // Array Initialize
        String techs[] = new String[] { "nodejs", "react", "angular", "vuejs" };

        int toss[][] = new int[5][5];

        // ArrayList Initialize
        ArrayList<String> phones = new ArrayList<String>(Arrays.asList("Nokia", "iPhone", "Samsung"));
        phones.add("Mi");
        phones.add("POCO X3");

        // HashMap declare
        HashMap<String, Integer> age = new HashMap<String, Integer>();
        age.put("John", 34);
        age.put("Alice", 32);
    }

}
