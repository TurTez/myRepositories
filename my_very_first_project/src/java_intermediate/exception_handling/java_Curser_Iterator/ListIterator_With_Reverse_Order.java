package java_intermediate.exception_handling.java_Curser_Iterator;

import java.util.*;

public class ListIterator_With_Reverse_Order {
    public static void main(String[] args) {
        //List Iterator we could iterate in both direction
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        Iterator abc = al.iterator();//iterator could be used to iterate in one direction
        ListIterator li = al.listIterator();//List iterator we could iterate both direction

        System.out.println("Print top to bottom");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Print bottom to top");
        while (li.hasPrevious()) {
            System.out.println(li.previous());

            HashMap<Integer, String> hm = new HashMap<>();
            hm.put(1, "NY");
            hm.put(2, "TX");
            hm.put(3, "MN");

            Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();

            while (itr.hasNext()){
                System.out.println(itr.next());
            }

        }
    }
}
