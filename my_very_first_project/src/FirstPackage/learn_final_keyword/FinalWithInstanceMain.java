package FirstPackage.learn_final_keyword;

import java.util.SortedMap;

import static FirstPackage.learn_final_keyword.FinalKeywordWithInstance.NUMOFTIRES;

public class FinalWithInstanceMain {
    public static void main(String[] args) {
        FinalKeywordWithInstance sos = new FinalKeywordWithInstance();
        FinalKeywordWithInstance sos2 = new FinalKeywordWithInstance();
        FinalKeywordWithInstance sos3  = new FinalKeywordWithInstance();
//create 3 instance when we create the instance copy of the class (FinalKeywordWithInstance) is been made each time
        sos.brand = "Jaguar";
        sos.color = "Red";
        sos.numOfDood = 2;

        System.out.println("Buying Ca: " + sos.brand);
        System.out.println(" Color: " + sos.color);
        System.out.println("Door Numbers: " + sos.numOfDood);
        System.out.println("Number of the Door: " + NUMOFTIRES);
        System.out.println("");

        sos2.brand = "Toyota";
        sos2.color = "Blue";
        sos2.numOfDood = 5;

        System.out.println("Buying Car: " + sos2.brand);
        System.out.println("Color: " + sos2.color);
        System.out.println("Door Numbers: " + sos2.numOfDood);
        System.out.println("Number of the Door: " + NUMOFTIRES);
        System.out.println("");

        sos3. brand = "Nissan";
        sos3. color = "Black";
        sos3. numOfDood = 4;

        System.out.println("Buying Car: " + sos3.brand);
        System.out.println("Color: " + sos3.color);
        System.out.println("Door Numbers: " + sos3.numOfDood);
        System.out.println("Number of the Door: " + NUMOFTIRES);
    }
}
