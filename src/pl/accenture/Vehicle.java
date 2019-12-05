package pl.accenture;

abstract public class Vehicle {
    private String name;

    void go()
    {
        System.out.println("uruchomiony");
    }
    void stop()
    {
        System.out.println("zatrzymany");
    }

    public Vehicle(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "nazwa "+this.name;

    }

    abstract double getDistance();

    abstract double getFuelNeed();
    double calculateFuelConsumption()
    {
        return getFuelNeed()/getDistance();
    }




}
