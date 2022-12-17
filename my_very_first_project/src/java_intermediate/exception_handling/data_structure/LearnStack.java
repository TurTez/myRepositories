package java_intermediate.exception_handling.data_structure;

import java.util.Stack;

public class LearnStack {

   //gets added on top
    //last in first out
    public static void main(String[] args) {
        Stack<String> myShoppingList = new Stack<>();
        myShoppingList.push("Milk");
        myShoppingList.push("Sugar");
        //myShoppingList.pop(); Remove last one

        for (String a: myShoppingList){
            System.out.println(a);
        }
    }
}
