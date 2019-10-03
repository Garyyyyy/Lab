package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;

public class Farmer extends Civilian {
    public Farmer(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }
}
