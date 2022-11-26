package ObjectedOrientedProgramming;
public class ThisKeyWord {
    int a = 100; // field of the class
                // 100 is assigned value to a, integer data type
    String s = "Hello";
    //call the constructor call the class name
    public ThisKeyWord(int a, String s){ // to public to accerss other class and packages and project

        //this.a=a; // This keyword points to class level variable above
       //this.s=s;
    }
    public static void main(String[] args){ // main function

        // ta accrss non static values we need to create objects
        ThisKeyWord obj = new ThisKeyWord(1000, "Java");

        System.out.println(obj.a);
        System.out.println(obj.s);
    }
}
