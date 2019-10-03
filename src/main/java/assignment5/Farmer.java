package assignment5;

import assignment5.exceptions.IncorrectAgeRangeException;

public class Farmer extends Civilian {
    public Farmer(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }
}
