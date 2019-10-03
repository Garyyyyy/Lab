package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;

public class Civilian extends Piece {

    private int wealth = 0;

    public Civilian(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }

    public int getWealth() {
        return wealth;
    }

    public void addWealth(int wealth) {
        this.wealth += wealth;
    }

    public void decWealth(int wealth) {
        this.wealth -= wealth;
    }


}
