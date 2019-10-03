package assignment5;

import assignment5.exceptions.IncorrectAgeRangeException;
import assignment5.exceptions.IncorrectWealthValueException;

public class Civilian extends Piece {

    private int wealth = 0;

    public Civilian(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }

    public int getWealth() {
        return wealth;
    }

    public void addWealth(int wealth) throws IncorrectWealthValueException {
        if(this.wealth + wealth < 0){
            throw new IncorrectWealthValueException("ERROR: Wealth can not be negative !");
        }
        this.wealth += wealth;
    }

    public void decWealth(int wealth) throws IncorrectWealthValueException {
        if(this.wealth - wealth < 0){
            throw new IncorrectWealthValueException("ERROR: Wealth can not be negative !");
        }
        this.wealth -= wealth;
    }


}
