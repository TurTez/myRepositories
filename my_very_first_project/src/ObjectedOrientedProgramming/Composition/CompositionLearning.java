package ObjectedOrientedProgramming.Composition;

public class CompositionLearning {
    public static void main(String[] args) {
        Keyboard Logitech = new Keyboard("Logitech", true, true);
        Keyboard Dell = new Keyboard("Dell", true, true);
        Mause AppleMause = new Mause("Apple", "Blue", true, true);
        Monitor SamsungMonitor = new Monitor("Samsung", 27, "HD", true);

        Computer myPC = new Computer(Logitech, AppleMause,SamsungMonitor);
    }
}
