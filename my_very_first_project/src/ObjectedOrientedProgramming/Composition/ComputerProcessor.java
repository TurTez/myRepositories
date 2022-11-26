package ObjectedOrientedProgramming.Composition;

public class ComputerProcessor {
    String brand;
    String name;
    int speed;

    ComputerProcessor(String brand, String name, int speed){
        this.brand = brand;
        this.name = name;
        this.speed = speed;
    }
    void IntelCore(){
        System.out.println("Budget Processor");
    }
    void corei9(){
        System.out.println("Good for Gaming");
    }
    void evoi7(){
        System.out.println("Good for daily usage");
    }
}
