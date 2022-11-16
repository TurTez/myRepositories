package FirstPackage;

import java.util.SortedMap;

public class ConstructorContd {

    //constructor
    public ConstructorContd(){

        System.out.println("Call the Constructor");
    }

    //Method
    void mOne(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {

        ConstructorContd obj = new ConstructorContd();
        obj.mOne();
        //as soon as we created an object for the constructor, constructor get executed

    }
}
