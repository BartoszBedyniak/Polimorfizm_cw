package pl.accenture;

public class Truck extends Car {
    public Truck(String name) {
        super(name);
    }

    @Override
    void go() {
        super.go();
        System.out.println("start Vehicle in Truck");
    }

    @Override
    double getFuelNeed() {
        return super.getFuelNeed();
    }
}
