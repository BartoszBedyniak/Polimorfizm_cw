package pl.accenture;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    void stop() {
        super.stop();
        dock();
    }

    @Override
    double getDistance() {
        return 116161;
    }

    @Override
    double getFuelNeed() {
        return 156;
    }
    @Override
    public void dock()
    {
        System.out.println("przybyl do portu");
    }

}

