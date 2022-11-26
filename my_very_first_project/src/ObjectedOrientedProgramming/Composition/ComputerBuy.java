package ObjectedOrientedProgramming.Composition;

public class ComputerBuy {
    ComputerHarddrive myHardDrive; //Composition
    ComputerMonitor myMonitor;
    ComputerProcessor myProcessor;

    public ComputerBuy(ComputerHarddrive myHardDrive, ComputerMonitor myMonitor, ComputerProcessor myProcessor){
        this.myHardDrive = myHardDrive;
        this.myMonitor = myMonitor;
        this.myProcessor = myProcessor;
    }
}
