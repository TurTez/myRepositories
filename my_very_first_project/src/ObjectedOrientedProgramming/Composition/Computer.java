package ObjectedOrientedProgramming.Composition;

public class Computer   {
    Keyboard myKeyboard; // this is composition
    Mause myMause; // this is composition

    Monitor myMonitor;

    public Computer(Keyboard myKeyboard, Mause myMause, Monitor myMonitor){
        this.myKeyboard = myKeyboard;
        this.myMause = myMause;

    }

}
