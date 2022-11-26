package ObjectedOrientedProgramming.Composition;

public class Mause {
    String brand;
    String color;
    boolean isWireless;
    boolean hasScrollWeel;

    public Mause(String brand, String color, boolean isWireless, boolean hasScrollWeel){
        this.brand = brand;
        this.color = color;
        this.isWireless = isWireless;
        this.hasScrollWeel = hasScrollWeel;
    }
    void LeftClick(){
        System.out.println("Left Click");
    }

    void rightClick(){
        System.out.println("Right Click");
    }
    void scrollingUp(){
        System.out.println("Scrolling UP");
    }
    void scrollingDown(){
        System.out.println("Scrolling down");
    }
}
