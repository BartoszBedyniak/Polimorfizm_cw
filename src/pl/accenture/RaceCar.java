package pl.accenture;

public class RaceCar extends Car {

    public RaceCar(String name) {
        super(name);
    }

    @Override
    void go() {
        super.go();
        System.out.println("jedzie raceCar");
    }


    @Override
    double getFuelNeed() {
        return super.getFuelNeed();
    }
}

