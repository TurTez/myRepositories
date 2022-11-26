package ObjectedOrientedProgramming.Composition;

public class ComputerBuy2 {
    public static void main(String[] args) {
        ComputerHarddrive myDrive1 = new ComputerHarddrive("Seagate", 250, 150, "HDD");
        ComputerMonitor myMonitor = new ComputerMonitor("HP", 21, "Flat", 250);
        ComputerProcessor myProcessor = new ComputerProcessor("Ryzen", "AMD", 300);

        ComputerBuy myPC = new ComputerBuy(myDrive1, myMonitor,myProcessor);
        myPC.myHardDrive.storeDocuments();
        myPC.myHardDrive.storePictures();
        myPC.myHardDrive.storePictures();

        myPC.myMonitor.doDesign();
        myPC.myMonitor.read();
        myPC.myMonitor.watch();

        myPC.myProcessor.corei9();
        myPC.myProcessor.evoi7();
        myPC.myProcessor.IntelCore();
    }
}
