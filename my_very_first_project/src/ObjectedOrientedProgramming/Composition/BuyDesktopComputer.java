package ObjectedOrientedProgramming.Composition;

public class BuyDesktopComputer {
    public static void main(String[] args) {
        Keyboard dellKeyboard = new Keyboard("dell", true, true);
        Mause hpMause = new Mause("hp", "blue", true, true);
        Monitor dellMonitor = new Monitor("Dell", 21, "HD");
        Monitor SamsungMonitor = new Monitor("Samsung", 21, "HD", true);
        Monitor GamingMonitor = new Monitor("Dell", 27, "HD");

        Computer desktopPC = new Computer(dellKeyboard,hpMause, dellMonitor);

        desktopPC.myKeyboard.typingWithKeyboard();
        desktopPC.myMause.LeftClick();
        desktopPC.myMonitor.turnOn();

    }
}
