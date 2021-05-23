import People.CabinCrewMember;
import People.CrewRank;
import People.Passenger;
import People.Pilot;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    PlaneType planeType;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CrewRank crewRank;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;



    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Jackie Trent", CrewRank.CAPTAIN, "DE34346");
        flight = new Flight(plane, pilot, "GH4523", "ABZ", "AGP", "08:30");
        cabinCrewMember1 = new CabinCrewMember("Penny", CrewRank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Garry", CrewRank.FLIGHTATTENDANT);
        passenger1 = new Passenger("Bob", 2);
        passenger2 = new Passenger("Betty", 1);
        passenger3 = new Passenger("Sal", 2);
        passenger4 = new Passenger("Kevin", 3);
        passenger5 = new Passenger("Gavin", 1);
        passenger6 = new Passenger("Helen", 2);
    }


    @Test
    public void hasFlightNumber() {
        assertEquals("GH4523", flight.getFlightNumber());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("ABZ", flight.getDepartureAirport());
    }

    @Test
    public void hasDestinationAirport() {
        assertEquals("AGP", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("08:30", flight.getDepartureTime());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasPilot() {
        assertEquals(pilot, flight.getPilot());
        assertEquals("Jackie Trent", pilot.getName());
    }

    @Test
    public void canAddCrewMember() {
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        assertEquals(2, flight.getNumberOfCrew());
    }

    @Test
    public void canAddPassengers() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(4, flight.getNumberOfPassengers());
    }

    @Test
    public void willNotAddPassengerIfCapacityMet() {
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(2, flight.getNumberOfCrew());
        assertEquals(5, flight.getNumberOfPassengers());
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);

        assertEquals(2, flight.getAvailableSeats());
    }

}
