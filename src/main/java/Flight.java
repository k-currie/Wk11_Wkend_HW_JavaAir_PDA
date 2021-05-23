import People.CabinCrewMember;
import People.CrewRank;
import People.Passenger;
import Plane.Plane;
import Plane.PlaneType;
import People.Pilot;


import java.util.ArrayList;
import java.util.PrimitiveIterator;

// Assume 1 pilot per flight

public class Flight {

        private Plane plane;
        private PlaneType planeType;
        private Pilot pilot;
        private CrewRank crewRank;
        private ArrayList<CabinCrewMember> crewMembers;
        private ArrayList<Passenger> passengers;
        private String flightNumber;
        private String departureAirport;
        private String destinationAirport;
        private String departureTime;

        public Flight(Plane plane, Pilot pilot, String flightNumber, String departureAirport, String destinationAirport, String departureTime) {
            this.plane = plane;
            this.pilot = pilot;
            this.crewMembers = new ArrayList<CabinCrewMember>();
            this.passengers = new ArrayList<Passenger>();
            this.flightNumber = flightNumber;
            this.departureAirport = departureAirport;
            this.destinationAirport = destinationAirport;
            this.departureTime = departureTime;
        }

        //GETTERS//

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane getPlane() {
            return plane;
    }
    public Pilot getPilot() {
            return pilot;
    }

        //METHODS//

    public void addCrewMember(CabinCrewMember cabinCrewMember) {
            this.crewMembers.add(cabinCrewMember);
    }

    public int getNumberOfCrew() {
            return this.crewMembers.size();
    }

    public void addPassenger(Passenger passenger) {
            if(getAvailableSeats() >0)
            {this.passengers.add(passenger);}
    }

    public int getNumberOfPassengers() {
            return this.passengers.size();
    }

    public int getAvailableSeats() {
            int capacity = plane.getPlaneType().getCapacity();
            int customers = getNumberOfPassengers();
            int staffPilot = 1;
            int staffTotal = getNumberOfCrew() + staffPilot;
            int placesTaken = customers + staffTotal;
            return capacity - placesTaken;
    }
}
