package assignment2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    Address address = new Address("ABC", "Seattle", "98000", "WA", "USA");

    @Test
    public void getStreetNumber() {
        Assert.assertEquals("ABC", address.getStreetNumber());
    }

    @Test
    public void setStreetNumber() {
        address.setStreetNumber("ABCD");
        Assert.assertEquals("ABCD", address.getStreetNumber());
    }

    @Test
    public void getCity() {
        Assert.assertEquals("Seattle", address.getCity());
    }

    @Test
    public void setCity() {
        address.setCity("Kirkland");
        Assert.assertEquals("Kirkland", address.getCity());
    }

    @Test
    public void getZipCode() {
        Assert.assertEquals("98000", address.getZipCode());
    }

    @Test
    public void setZipCode() {
        address.setZipCode("98001");
        Assert.assertEquals("98001", address.getZipCode());
    }

    @Test
    public void getState() {
        Assert.assertEquals("WA", address.getState());
    }

    @Test
    public void setState() {
        address.setState("wa");
        Assert.assertEquals("wa", address.getState());
    }

    @Test
    public void getCountry() {
        Assert.assertEquals("USA", address.getCountry());
    }

    @Test
    public void setCountry() {
        address.setCountry("U.S.A");
        Assert.assertEquals("U.S.A", address.getCountry());
    }
}