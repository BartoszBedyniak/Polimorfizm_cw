package pl.accenture;

public class Ship extends Vehicle {
    void swim()
    {
        System.out.println("swim ship");
    }

    @Override
    void start() {
        super.start();
        System.out.println("start Vehicle in ship");
    }
}
