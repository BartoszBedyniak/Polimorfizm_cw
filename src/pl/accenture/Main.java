package pl.accenture;

public class Main {

    public static void main(String[] args) {
	Vehicle [] V={new Plane("samolot"),new Car("samochod"),new Ship("samochod"),new Truck("truck"),new RaceCar("raceCar")};

	for(Vehicle vehicle:V)
    {
        vehicle.go();
        vehicle.stop();

        System.out.println(vehicle.calculateFuelConsumption());
        if(vehicle instanceof Plane){
        ((Plane) vehicle).land();
        }
        System.out.println("\n");


    }

    }

}

