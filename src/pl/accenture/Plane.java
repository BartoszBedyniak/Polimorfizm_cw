package pl.accenture;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    void go() {
        super.go();
    }

    @Override
    void stop() {
        super.stop();
        land();
    }

    @Override
    double getDistance() {
        return 1234124124;
    }

    @Override
    double getFuelNeed() {
        return 15125125;
    }
    public void takeOff() {
        System.out.println("lecimy");
    }
    public void land(){
        System.out.println("ladujemy");
    }
    public void callAirControl(){
        System.out.println("nic nie robie");
    }
}
