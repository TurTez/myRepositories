package FirstPackage;
public class MidtermQ5 {

    /**
     Q5.	What is overloading? How can we overload a constructor? Please write the code below to demonstrate.

     When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
     Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.
     We can overload a method using different (more or less) parameters
     We can overload with different data types
     **/
    static int myMethod(int a, int b) {
        return a + b;
    }
    static double myMethod(double a, double b){
        return a + b;
        }

    public static void main(String[] args) {
        int number1 = myMethod (2,6);
        double number2 = myMethod(10.23,20.23);
            System.out.println("myMethod number 1: " + number1);
            System.out.println("myMethod number 2: " + number2);
        }
    }

