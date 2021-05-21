package People;

public class Pilot extends Person{

    private CrewRank crewRank;
    private String licenceNumber;

    public Pilot(String name, CrewRank crewRank, String licenceNumber) {
        super(name);
        this.crewRank = crewRank;
        this.licenceNumber = licenceNumber;
    }

    //METHOD//
    public String flyPlane(String flyPlaneMessage) {
        return flyPlaneMessage;
    }

    //GETTERS//
    public CrewRank getCrewRank() {
        return crewRank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
