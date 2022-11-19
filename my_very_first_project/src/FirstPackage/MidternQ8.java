package FirstPackage;

import java.util.Scanner;
// Q8 Take two inputs from user as integer in your IDE console print the smallest number.
public class MidternQ8 {
    public static void main(String[] args) {

        Scanner sos = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = sos.nextInt();

        System.out.println("Enter Second Number : ");
        int y = sos.nextInt();

        if(x<y){
            System.out.println("First number is smaller than second number ");
        }else if(x>y){
            System.out.println("Second number is smaller then first number ");
        }else if(x==y){
            System.out.println("First and Second numbers are equal");
        } else{
            System.out.println("Something wrong");
        }
        sos.close();
    }
}
