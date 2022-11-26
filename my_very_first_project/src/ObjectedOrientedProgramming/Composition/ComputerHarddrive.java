package ObjectedOrientedProgramming.Composition;

public class ComputerHarddrive {
    String brand;
    int capacity;
    int speed;
    String storageType;

    ComputerHarddrive(String brand, int capacity, int speed, String storageType){
        this.brand = brand;
        this.capacity = capacity;
        this.speed = speed;
        this.storageType = storageType;

    }
    void storePictures(){
        System.out.println("Store Pictures");
    }
    void storeDocuments(){
        System.out.println("Storing documents");
    }
    void sveDesign(){
        System.out.println("Saving Design");
    }
}
