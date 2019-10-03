package assignment5;

import assignment5.exceptions.IncorrectAgeRangeException;
import assignment5.exceptions.IncorrectWealthValueException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CivilianTest {
    Civilian civilian = new Civilian("ABC", 20);

    public CivilianTest() throws IncorrectAgeRangeException {
    }

    @Test
    public void getWealth() {
        Assert.assertEquals(0, civilian.getWealth());
    }

    @Test(expected = IncorrectWealthValueException.class)
    public void addWealth() throws IncorrectWealthValueException {
        civilian.addWealth(-100);
    }

    @Test(expected = IncorrectWealthValueException.class)
    public void decWealth() throws IncorrectWealthValueException {
        civilian.decWealth(200);
    }
}