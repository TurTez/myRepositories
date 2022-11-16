package ObjectedOrientedProgramming.ControlFlowStatement;

import java.util.SortedMap;

public class IfElseIfElse {
    /**void ifElse(int x, int y) { // if else using methods
        if (x > y) {
            System.out.println("X is bigger");
        } else if (x < y) {
            System.out.println("Y is bigger");
        } else if (x == y) {
            System.out.println("X and Y are equal");
        } else {
            System.out.println("something Wrong");
        }
    }**/
        public static void main(String[] args){
        IfElseIfElse obj = new IfElseIfElse();
        //obj.ifElse(300,200);
            System.out.println(obj.ifElseTwo(400,200));

    }
    int ifElseTwo(int a, int b){
        if(a>b){
            return a;
        }else if(a<b){
            return b;
        }else if(a==b){
            return -1;//wrong value
        }
        return -1;
    }


    /** public static void main(String[] args) {

        int x = 200;
        int y = 200;

        if(x<y) {
            System.out.println("Y has bigger value");
        } else{
            System.out.println( "X has a bigger value");
        }

        if (x>y) {
            System.out.println("X has bigger value");
        }else if(y>x){
            System.out.println("Y is the bigger value");
        }else if(y==x){
            System.out.println("X and Y has same value");
        }else{
            System.out.println("something wrong");
        }

    }**/
}
