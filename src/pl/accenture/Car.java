package pl.accenture;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    double getDistance() {
        return 142412;
    }

    @Override
    double getFuelNeed() {
        return 125125125;
    }
}
