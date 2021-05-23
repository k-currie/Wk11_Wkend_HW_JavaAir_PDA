import People.CrewRank;
import People.Passenger;
import People.Pilot;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    PlaneType planeType;
    Flight flight;
    Passenger passenger;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;


    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUEA380);
        pilot = new Pilot("Jackie Trent", CrewRank.CAPTAIN, "DE34346");
        flight = new Flight(plane, pilot, "GH4523", "ABZ", "PLA", "08:30");
        flightManager = new FlightManager(plane, flight);
        passenger1 = new Passenger("Bob", 2);
        passenger2 = new Passenger("Betty", 1);
        passenger3 = new Passenger("Sal", 2);
        passenger4 = new Passenger("Kevin", 3);
        passenger5 = new Passenger("Gavin", 1);
        passenger6 = new Passenger("Helen", 2);
    }

    @Test
    public void canGetBaggageWeightPerPerson() {
        assertEquals(50, flightManager.getBaggageWeightPerPerson());
    }

    @Test
    public void canGetPlanesTotalAvailableBaggageWeight() {
        assertEquals(500, flightManager.getPlanesStartingBaggageWeight());
    }

    @Test
    public void canCalculateBaggageWeightOfBookedPassengers() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(150, flightManager.calculateBookedBaggageWeight());
    }

    @Test
    public void canCalculateBaggageWeightStillAvailable() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(350, flightManager.calculateBaggageWeightRemaining());
    }
}
