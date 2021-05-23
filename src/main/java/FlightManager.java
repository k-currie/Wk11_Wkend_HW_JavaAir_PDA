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
        int baggageWeight = planeWeight/2;
        int planeCapacity = this.plane.getPlaneType().getCapacity();
        return (baggageWeight/planeCapacity);
    }

    public int getPlanesStartingBaggageWeight(){
        int planeWeight = this.plane.getPlaneType().getWeight();
        int baggageWeight = planeWeight/2;
        return baggageWeight;
    }

    public int calculateBookedBaggageWeight() {
        int bookedBaggageWeight = flight.getNumberOfPassengers()*getBaggageWeightPerPerson();
        return bookedBaggageWeight;
    }

    public int calculateBaggageWeightRemaining() {
        int baggageWeightRemaining = getPlanesStartingBaggageWeight() - calculateBookedBaggageWeight();
        return baggageWeightRemaining;
    }
}
