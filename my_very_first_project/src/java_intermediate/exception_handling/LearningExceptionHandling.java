package java_intermediate.exception_handling;

import java.util.Scanner;

public class LearningExceptionHandling {

    public static void main(String[] args) {
// exception handling with multiple try
        int [] iA = {6,7,8,9};
        try {
            System.out.println("Second index nimber is: " + iA[1]);
        }catch (NullPointerException n) {
            System.out.println("Your array has null value");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Your array is out of bound");
        }
}
}