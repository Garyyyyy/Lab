package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;

public class Marine extends Soldier {
    public Marine(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }
}
