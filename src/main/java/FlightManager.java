import People.Passenger;
import Plane.Plane;
import Plane.PlaneType;

public class FlightManager {

    private Plane plane;
    private PlaneType planeType;
    private Flight flight;


    public FlightManager(Plane plane, Flight flight) {
        this.plane = plane;
        this.flight = flight;
    }

    public int getBaggageWeightPerPerson(){
        int planeWeight = this.plane.getPlaneType().getWeight();
        int planeCapacity = this.plane.getPlaneType().getCapacity();
        return ((planeWeight/2)/planeCapacity);
    }

    public int calculateBookedBaggageWeight() {
        int totalBaggageWeight = flight.getNumberOfPassengers()*getBaggageWeightPerPerson();
        return totalBaggageWeight;
    }

    public int calculateBaggageWeightRemaining() {
//        int baggageWeightLeft = flight.getW
    }
}
