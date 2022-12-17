package java_intermediate.exception_handling.data_structure;

import java.util.Stack;

public class LearnStackTwo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        //myStack.pop();
       // myStack.pop();
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.pop();

        for (int a: myStack){
            System.out.println(a);
        }
        //System.out.println(myStack.peek());
        System.out.println(myStack.search(30));
    }
}
