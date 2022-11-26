package ObjectedOrientedProgramming.inheritance;

public class CarTest2 {
    public static void main(String[] args) {
        CarOne toyota = new CarOne();
        toyota.carBrand = "Toyote";
        toyota.carModel = "RAV4";
        toyota.color = "GREEN";
        toyota.doesItNew = true;
        toyota.madeByHand = false;
        toyota.numOfDoor = 5;
        toyota.milesPerGallon = 30;
        toyota.notBuyCar();

        toyota.driveCarOne();
        System.out.println("Brand of the Car: " + toyota.carBrand);
        System.out.println("Model of the Car: " + toyota.carModel);
        System.out.println("Is this car new: " + toyota.doesItNew);
        System.out.println("Number of doors:" + toyota.numOfDoor);

        System.out.println("Made by hand: " + toyota.madeByHand); //Coming from CarOne
        System.out.println("Color of the Car: " + toyota.color);

        System.out.println("");


        CarTwo nisan = new CarTwo();
        nisan.carBrand = "Nisan";
        nisan.carModel = "Altima";
        nisan.doesItNew = false;
        nisan.milesPerGallon = 28;
        nisan.numOfDoor = 4;
        nisan.typeOfEngineTwo = "Gas";
        nisan.lowPrice = 25000;

        nisan.testDrive();

        System.out.println("Brand of the Car: " + nisan.carBrand);
        System.out.println("Model of the Car: " + nisan.carModel);
        System.out.println("Is this car new: " + nisan.doesItNew);
        System.out.println("Number of doors:" + nisan.numOfDoor);

        System.out.println("Lowest Price " + nisan.lowPrice); // coming from CarTwo
        System.out.println("Type of Engine: " + nisan.typeOfEngineTwo);

        System.out.println("");

        CarThree mercedes = new CarThree();
        mercedes.carBrand = "Mercedes";
        mercedes.carModel = "XLS2000";
        mercedes.doesItNew = true;
        mercedes.milesPerGallon = 55;
        mercedes.numOfDoor = 2;
        mercedes.TypeofEngineThree = "Electric and Hybrid";
        mercedes.highspeed = 500;

        mercedes.driveCarThree();
        System.out.println("Brand of the Car: " + mercedes.carBrand);
        System.out.println("Model of the Car: " + mercedes.carModel);
        System.out.println("Is this car new: " + mercedes.doesItNew);
        System.out.println("Number of doors:" + mercedes.numOfDoor);

        System.out.println("Speed of the Car: " + mercedes.highspeed);//coming from CarThree
        System.out.println("Engine type: " + mercedes.TypeofEngineThree);
        System.out.println("");
    }
}
