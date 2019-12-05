package pl.accenture;

public class Truck extends Car {
    public Truck(String name) {
        super(name);
    }

    @Override
    void go() {
        super.go();
        System.out.println("Jedzie Truck");
    }

    @Override
    double getFuelNeed() {
        return super.getFuelNeed();
    }
}
