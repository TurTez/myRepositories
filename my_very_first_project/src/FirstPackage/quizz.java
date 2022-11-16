package FirstPackage;

import java.util.Scanner;
import java.util.SortedMap;

public class quizz {
    //Find a bigger number. Take input from user for two variables and print the largest variables 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number = ");
        int x = sc.nextInt();
        System.out.println("Input second number = ");
        int y = sc.nextInt();

        if(x>y) {
            System.out.println("First number is bigger");
        }
            else if(y>x) {
            System.out.println("Second number is bigger");
        }
            else{
            System.out.println("First and second number equal");

            sc.close();
        }
    }
}
