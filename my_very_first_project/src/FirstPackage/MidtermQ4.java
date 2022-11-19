package FirstPackage;

/**
 Create a method with two parameters and return multiplications of those two as parameters,
 call the method inside main method and pass the argument as 50 and 60.
 **/
public class MidtermQ4 {
    static int myMethod(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(50,60));
    }
}
