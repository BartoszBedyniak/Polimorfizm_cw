package pl.accenture;

public class Plane extends Vehicle {
    void fly()
    {
        System.out.println("fly Plane");
    }

    @Override
    void start() {
        super.start();
        System.out.println("start  Vehicle in plane");
    }
}
