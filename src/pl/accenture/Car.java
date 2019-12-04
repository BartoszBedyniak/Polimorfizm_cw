package pl.accenture;

public class Car extends Vehicle {
    void ride()
    {
        System.out.println("ride car ");
    }

    @Override
    void start() {
        super.start();
        System.out.println("start Vehicle in Car");
    }
}
