package FirstPackage;

import java.util.Scanner;
import java.util.SortedMap;

public class quizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("Input x: ");
        int y = sc.nextInt();
        System.out.println("Input y: ");

        If(x > y) {
            System.out.println("Smallest num: +x");
        } else if (x > y) {
            System.out.println("Smallest num: +y");
        }
    }
}
