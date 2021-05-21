import People.CrewRank;
import People.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    CrewRank crewRank;

    @Before

    public void before() {
        pilot = new Pilot("Jackie Trent", CrewRank.CAPTAIN, "DE34346");
    }

    @Test
    public void hasName() {
        assertEquals("Jackie Trent", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(CrewRank.CAPTAIN, pilot.getCrewRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("DE34346", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("And we're off!", pilot.flyPlane("And we're off!"));
    }
}
