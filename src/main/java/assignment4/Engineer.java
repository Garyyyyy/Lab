package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;

public class Engineer extends Civilian {
    public Engineer(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }
}
