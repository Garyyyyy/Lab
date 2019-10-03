package assignment4;

import assignment4.exceptions.IncorrectAgeRangeException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PieceTest {

    Piece piece;

    public PieceTest() throws IncorrectAgeRangeException {
        piece = new Piece("ABC", 20);
    }


    @Test
    public void getName() {
        Assert.assertEquals("ABC", piece.getName());
    }

    @Test
    public void setName() {
        piece.setName("CBA");
        Assert.assertEquals("CBA", piece.getName());
    }

    @Test
    public void getAge() {
        Assert.assertEquals(20, piece.getAge());
    }

    @Test(expected = IncorrectAgeRangeException.class)
    public void setAge() throws IncorrectAgeRangeException {
        piece.setAge(200);
    }
}