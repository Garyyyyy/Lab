package assignment5;

import assignment5.exceptions.IncorrectAgeRangeException;
import assignment5.exceptions.IncorrectStrengthValueException;

public class Soldier extends Piece {

    private int stamina;

    public Soldier(String name, int age) throws IncorrectAgeRangeException {
        super(name, age);
    }

    public int getStamina() {
        return stamina;
    }

    public void addStamina(int stamina) throws IncorrectStrengthValueException {
        if(this.stamina + stamina > 100){
            throw new IncorrectStrengthValueException("ERROR: Soldier’s strength should\n" +
                    "always in the range [0, 100].");
        } else{
            this.stamina += stamina;
        }

    }

    public void desStamina(int stamina) throws IncorrectStrengthValueException {
        if(this.stamina - stamina < 0){
            throw new IncorrectStrengthValueException("ERROR: Soldier’s strength should\n" +
                    "always in the range [0, 100].");
        } else{
            this.stamina -= stamina;
        }
    }

}
