package ObjectedOrientedProgramming.abstraction.examples;

public class BuyingLaptop {
    public static void main(String[] args) {
        DellLapTop dl = new DellLapTop();
        dl.turnOn();
        dl.turnOff();
        dl.os();
        dl.buildInMousePad();
        dl.buildInKeyboard();
    }
}
