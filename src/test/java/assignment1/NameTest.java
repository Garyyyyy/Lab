package assignment1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    Name name = new Name("Chu", "Pika");

    @Test
    public void getFirstName() {
        Assert.assertEquals("Chu", name.getFirstName());
    }

    @Test
    public void setFirstName() {
        name.setFirstName("Chuu");
        Assert.assertEquals("Chuu", name.getFirstName());
    }

    @Test
    public void getLastName() {
        Assert.assertEquals("Pika", name.getLastName());
    }

    @Test
    public void setLastName() {
        name.setLastName("Pikaa");
        Assert.assertEquals("Pikaa", name.getLastName());
    }

    @Test
    public void testEquals() {
        Name name2 = new Name("Chu", "Pika");
        Assert.assertTrue(name2.equals(name));
    }
}