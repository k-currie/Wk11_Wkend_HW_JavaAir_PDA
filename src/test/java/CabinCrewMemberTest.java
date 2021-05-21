import People.CabinCrewMember;
import People.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    CrewRank crewRank;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Penny", CrewRank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Penny", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(CrewRank.FLIGHTATTENDANT, cabinCrewMember.getCrewRank());
    }

    @Test
    public void canMakeAnnouncement() {
        assertEquals("Please return to economy", cabinCrewMember.makeAnnouncement("Please return to economy"));
    }
}
