package java_intermediate.exception_handling.java_Curser_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMap_Iterator {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "NY");
        hm.put(2, "TX");
        hm.put(3, "MN");

        Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
