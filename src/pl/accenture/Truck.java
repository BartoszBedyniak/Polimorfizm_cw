package pl.accenture;

public class Truck extends Car {
    void slowRide()
    {
        System.out.println("slowRide Truck");
    }

    @Override
    void ride() {
        super.ride();
        System.out.println("ride Car in Truck");
    }

    @Override
    void start() {
        super.start();
        System.out.println("start Vehicle in Truck");
    }
}
