package ObjectedOrientedProgramming.Composition;

public class ComputerMonitor {
    String brandName;
    int screenSize;
    String screenType;
    int screenResolution;

    ComputerMonitor(String brandName, int screenSize, String screenType, int screenResolution){
        this.brandName = brandName;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.screenResolution =screenResolution;
    }
    void doDesign(){
        System.out.println("Monitor is Good for Design");
    }

    void watch(){
        System.out.println("Monitor iss good for watching movies");
    }

    void read(){
        System.out.println("Monitor is good for reading from the screen");
    }
}
