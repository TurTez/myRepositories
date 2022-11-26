package ObjectedOrientedProgramming.Composition;

public class ComputerComposition {
    public static void main(String[] args){
        ComputerHarddrive haddrive1 = new ComputerHarddrive("Seagate",500, 4096,"SATA");
        ComputerMonitor monitor1 = new ComputerMonitor("Dell", 24, "Flat", 100);
        ComputerProcessor processor1 = new ComputerProcessor("Intel", "core", 200);

        ComputerBuy myComputer = new ComputerBuy(haddrive1,monitor1,processor1);
    }
}
