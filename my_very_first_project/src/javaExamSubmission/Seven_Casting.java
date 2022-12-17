package javaExamSubmission;

public class Seven_Casting {
    /*
    Create a class and show an example of casting
    non primitive data type to primitive data type
    */
    public static void main(String[] args) {

        //Non Primitive data Type (String) to primitive data type (Character)
        String str = "Hello";
        System.out.println(str.charAt(4));

        //Non Primitive data Type (String) to primitive data type (integer)
        String myst = "10";
        System.out.println(Integer.parseInt(myst) + 5);
    }
}
