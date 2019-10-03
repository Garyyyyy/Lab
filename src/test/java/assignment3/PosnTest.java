package assignment3;

import org.junit.Assert;
import org.junit.Test;

public class PosnTest {
    Posn posn = new Posn(5, 8);

    @Test
    public void getX() {
        Assert.assertEquals(5, (int)posn.getX());
    }

    @Test
    public void getY() {
        Assert.assertEquals(8, (int)posn.getY());
    }

    @Test
    public void testEquals() {
        Posn posn1 = new Posn(5,8);
        Assert.assertEquals(posn1, posn);
        Posn posn2 = null;
        Assert.assertNotEquals(posn2, posn);


    }

    @Test
    public void testHashCode() {
        Assert.assertEquals(163, posn.hashCode());
        Posn posn3 = new Posn(5, null);
        Assert.assertEquals(155, posn3.hashCode());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Posn{x=5, y=8}", posn.toString());
    }
}