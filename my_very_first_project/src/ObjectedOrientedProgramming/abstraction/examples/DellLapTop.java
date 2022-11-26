package ObjectedOrientedProgramming.abstraction.examples;

public class DellLapTop extends Laptop {


    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");

    }

    @Override
    public void os() {
        System.out.println("Windowa 10");

    }

    @Override
    public void webCam() {
        System.out.println("WebCam");

    }

    @Override
    public void buildInKeyboard() {
        System.out.println("Yes");

    }

    @Override
    public void buildInMousePad() {
        System.out.println("Ofcourse");

    }
}
