package People;

public class CabinCrewMember extends Person{

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    //METHOD//
    public String makeAnnouncement(String message) {
        return message;
    }

    //GETTER//
    public CrewRank getCrewRank() {
        return crewRank;
    }

}
