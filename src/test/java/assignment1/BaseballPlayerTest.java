package assignment1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseballPlayerTest {

    BaseballPlayer bbp = new BaseballPlayer(new Name("Chu", "Pika"), 5.5, 100.0, "X", "Zeus", 2.0, 10);

    @Test
    public void getTeamName() {
        Assert.assertEquals("Zeus", bbp.getTeamName());
    }

    @Test
    public void setTeamName() {
        bbp.setTeamName("Safari");
        Assert.assertEquals("Safari", bbp.getTeamName());
    }

    @Test
    public void getAverageBatting() {
        Assert.assertEquals(2.0, bbp.getAverageBatting(), 1e-15);
    }

    @Test
    public void setAverageBatting() {
        bbp.setAverageBatting(1.0);
        Assert.assertEquals(1.0, bbp.getAverageBatting(), 1e-15);
    }

    @Test
    public void getSeasonHomeRuns() {
        Assert.assertEquals(10, (int)bbp.getSeasonHomeRuns());
    }

    @Test
    public void setSeasonHomeRuns() {
        bbp.setSeasonHomeRuns(20);
        Assert.assertEquals(20, (int)bbp.getSeasonHomeRuns());
    }
}