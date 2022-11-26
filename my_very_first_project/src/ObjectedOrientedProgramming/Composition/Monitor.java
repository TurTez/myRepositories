package ObjectedOrientedProgramming.Composition;

public class Monitor {
    String monitorName;
    int monitorSize;
    String resolution;
    boolean hasWebCam;

    public Monitor(String monitorName, int monitorSize, String resolution){
        this.monitorName = monitorName;
        this.monitorSize = monitorSize;
        this.resolution = resolution;
    }
    public Monitor(String monitorName, int monitorSize, String resolution,boolean hasWebCam){
        this.monitorName = monitorName;
        this.monitorSize =monitorSize;
        this.resolution = resolution;
        this.hasWebCam = hasWebCam;

    }

    void turnOn(){
        System.out.println("MyMonitor TurnOn");
    }

    void turnOff(){
        System.out.println("MyMonitor Turn OFF");
    }
}

