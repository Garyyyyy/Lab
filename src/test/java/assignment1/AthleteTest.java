package assignment1;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class AthleteTest {
    private Athlete athlete = new Athlete(new Name("Pika", "Chu"), 5.5, 100.0, "X");

    @Test
    public void getAthletesName() {
        Assert.assertEquals(new Name("Pika", "Chu"), athlete.getAthletesName());
        Assert.assertNotEquals(new Name("pika", "chu"), athlete.getAthletesName());
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(5.5, athlete.getHeight(), 1e-15);
        Assert.assertNotEquals(5.0, athlete.getHeight(), 1e-15);
    }

    @Test
    public void getWeight() {
        Assert.assertEquals( 100.0, athlete.getWeight(), 1e-15);
        Assert.assertNotEquals(5.5, athlete.getWeight(), 1e-15);
    }

    @Test
    public void getLeague() {
        Assert.assertEquals("X", athlete.getLeague());
        Assert.assertNotEquals("xvcv", athlete.getLeague());
    }
}