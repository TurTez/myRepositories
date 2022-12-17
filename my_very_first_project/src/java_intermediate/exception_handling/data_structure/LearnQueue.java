package java_intermediate.exception_handling.data_structure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);

       // q.poll(); //remove from the list

        //System.out.println(q);

        System.out.println(q.peek()); //look at the first element
        System.out.println(q.size());//print the eamount of the element
        System.out.println(q.contains(20)); // if there is any 2o in it
        System.out.println(q.toArray()[2]);//index value
        System.out.println(q.poll());//remove first element

        Queue<String> qS = new ArrayDeque<>();

        qS.add("Hi");
        qS.add("Hello");

        System.out.println(qS);

        for (String b : qS){
            System.out.println(b);
        }
    }
}
