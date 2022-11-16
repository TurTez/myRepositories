package ObjectedOrientedProgramming;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args){

        Scanner s =new Scanner(System.in); //System.in input the data

      String str = s.next();
      System.out.println(str);

        String str2 = s.nextLine();
        System.out.println(str2);


      /**  System.out.println("enter a number: ");
        int x = s.nextInt();

        System.out.println("enter another number: ");
        int y = s.nextInt();
        System.out.println(x+y);
       */
    }
}
