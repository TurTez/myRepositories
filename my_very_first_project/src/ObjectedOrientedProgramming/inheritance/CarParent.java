package ObjectedOrientedProgramming.inheritance;

public class CarParent {
    int numOfDoor;
    int milesPerGallon;
    String carBrand;
    String carModel;
    boolean doesItNew;

    void testDrive(){
        System.out.println("I would like to test drive the car");
    }
    void buyCar(){
        System.out.println("I would like to buy the cae");
    }
    void notBuyCar(){
        System.out.println("I would like to chose another car");
    }
}
