package ObjectedOrientedProgramming.Composition;

public class Keyboard {
    String brand;
    boolean isWireless;
    boolean hasNumpad;

    public Keyboard(String brand, boolean isWireless, boolean hasNumpad){ //Constractor to pass parameter
        //this keyword introduce class level atributes to
        this.brand= brand;
        this.isWireless = isWireless;
        this.hasNumpad = hasNumpad;
    }
    void typingWithKeyboard(){
        System.out.println("Start typing with Keyword");
    }
    void turnOnCapsLock(){
        System.out.println("Caps Lock Turn On We are typing Capital");
    }
    void turnOffCapLock(){
        System.out.println("Turn OFF");
    }

}
