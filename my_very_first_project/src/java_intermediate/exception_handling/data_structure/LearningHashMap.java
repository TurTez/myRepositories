package java_intermediate.exception_handling.data_structure;

import java.util.HashMap;

public class LearningHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> myHash = new HashMap<>();
        myHash.put(1, "Milk");
        myHash.put(2, "eggs");
        myHash.put(3,"Sugar");
        System.out.println(myHash.get(2));
        System.out.println(myHash.keySet());
        System.out.println(myHash.values());
        System.out.println(myHash.remove(1,"Milk"));
    }
}
