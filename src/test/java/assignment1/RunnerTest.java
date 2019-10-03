package assignment1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {

    Runner runner = new Runner(new Name("Chu", "Pika"), 5.5, 100.0, "X", 2.0, 2.0, "O");

    @Test
    public void getScore5K() {
        Assert.assertEquals(2.0, runner.getScore5K(), 1e-15);
    }

    @Test
    public void setScore5K() {
        runner.setScore5K(5.0);
        Assert.assertEquals(5.0, runner.getScore5K(), 1e-15);
    }

    @Test
    public void getScoreHalfMarathon() {
        Assert.assertEquals(2.0, runner.getScoreHalfMarathon(), 1e-15);
    }

    @Test
    public void setScoreHalfMarathon() {
        runner.setScoreHalfMarathon(4.0);
        Assert.assertEquals(4.0, runner.getScoreHalfMarathon(), 1e-15);
    }

    @Test
    public void getFavEvent() {
        Assert.assertEquals("O", runner.getFavEvent());
    }

    @Test
    public void setFavEvent() {
        runner.setFavEvent("BigO");
        Assert.assertEquals("BigO", runner.getFavEvent());
    }
}