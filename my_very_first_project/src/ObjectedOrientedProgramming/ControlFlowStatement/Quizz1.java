package ObjectedOrientedProgramming.ControlFlowStatement;

import java.util.Scanner;

public class Quizz1 {
    public static void main(String[] args) {
        Scanner sos = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int x = sos.nextInt();

        System.out.println("Enter Second Value: ");
        int y = sos.nextInt();

        if(x>y){
            System.out.println("First value is bigger");
        }else if(x<y){
            System.out.println("Second value is bigger");
        }else if (x==y){
            System.out.println("First and second number are equal");
        }else{
            System.out.println("something wrong");
        }
        sos.close();

    }
}
