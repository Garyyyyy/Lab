package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;

public class Sniper extends Soldier{
    public Sniper(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }
}
