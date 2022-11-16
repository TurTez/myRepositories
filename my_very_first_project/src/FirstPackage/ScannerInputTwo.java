package FirstPackage;

import java.util.Scanner;

public class ScannerInputTwo {
    public static void main(String[] args) {
        //scanner used when user enter the value manually

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = sc.nextInt();
        System.out.println("Second value: ");
        int y = sc.nextInt();
        System.out.println("Result is: ");
        System.out.println(x+y);
    }
}