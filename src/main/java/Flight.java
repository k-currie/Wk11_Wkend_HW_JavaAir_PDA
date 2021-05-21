import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import Plane.Plane;

import java.util.ArrayList;

public class Flight {

        private Plane plane;
        private Pilot pilot;
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
    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

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
}
