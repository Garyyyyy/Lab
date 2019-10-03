package assignment5;

import assignment5.exceptions.IncorrectAgeRangeException;

public class Piece {

    private String name;
    private int age;

    public Piece(String name, int age) throws IncorrectAgeRangeException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeRangeException {
        if(age < 0 || age > 128){
            throw new IncorrectAgeRangeException("ERROR: provided value for age is outside of the range [0, 128]");
        }else{
            this.age = age;
        }
    }
}
