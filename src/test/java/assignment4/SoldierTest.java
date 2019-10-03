package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;
import assignment4.exceptions.IncorrectStrengthValueException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SoldierTest {

    Soldier soldier = new Soldier("solider", 20);

    public SoldierTest() throws IncorrectAgeRangeException {
    }

    @Test
    public void getStamina() {
        Assert.assertEquals(0, soldier.getStamina());
    }

    @Test(expected = IncorrectStrengthValueException.class)
    public void addStamina() throws IncorrectStrengthValueException {
        soldier.addStamina(101);
    }

    @Test(expected = IncorrectStrengthValueException.class)
    public void desStamina() throws IncorrectStrengthValueException {
        soldier.desStamina(100);
    }
}