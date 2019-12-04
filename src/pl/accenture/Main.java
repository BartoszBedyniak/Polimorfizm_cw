package pl.accenture;

public class Main {

    public static void main(String[] args) {
	Vehicle [] V={new Vehicle(), new Plane(),new Car(),new Ship(),new Truck(),new RaceCar()};
	for(Vehicle vehicle:V) {
        if(vehicle instanceof Vehicle) {
            vehicle.start();
        }
        if(vehicle instanceof Plane) {
            ((Plane) vehicle).fly();
        }
        if(vehicle instanceof  Car){
            ((Car) vehicle).ride();
        }
        if(vehicle instanceof  Ship){
            ((Ship) vehicle).swim();
        }
        if(vehicle instanceof Truck){
            ((Truck) vehicle).slowRide();
        }
        if(vehicle instanceof  RaceCar)
            ((RaceCar) vehicle).fastRide();

    }
    }
}
