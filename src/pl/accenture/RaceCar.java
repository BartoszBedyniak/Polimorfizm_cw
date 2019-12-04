package pl.accenture;

public class RaceCar extends Car {

    void fastRide() {
        System.out.println("fastRide in Racecar");
    }

    @Override
    void ride() {
        super.ride();
        System.out.println("ride Car in RaceCar");
    }

    @Override
    void start() {
        super.start();
        System.out.println("start Vehicle in RaceCar");
    }
}

