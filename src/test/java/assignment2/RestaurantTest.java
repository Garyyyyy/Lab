package assignment2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    List<String> meals = new ArrayList<>();
    List<String> desserts = new ArrayList<>();
    List<String> beverages = new ArrayList<>();
    List<String> drinks = new ArrayList<>();

    Menu menu = new Menu(meals, desserts, beverages, drinks);
    Address address = new Address("ABC", "Seattle", "98000", "WA", "USA");
    Restaurant rest = new Restaurant("XXX", address, menu, true);

    @Test
    public void getName() {
        Assert.assertEquals("XXX", rest.getName());
    }

    @Test
    public void setName() {
        rest.setName("XXXX");
        Assert.assertEquals("XXXX", rest.getName());
    }

    @Test
    public void getAddress() {
        Assert.assertEquals(address, rest.getAddress());
    }

    @Test
    public void setAddress() {
        address.setCountry("U.S.A");
        Assert.assertEquals(address, rest.getAddress());
    }

    @Test
    public void getMenu() {
        Assert.assertEquals(menu, rest.getMenu());
    }

    @Test
    public void setMenu() {
        menu.getMeals().add("Coco");
        Assert.assertEquals(menu, rest.getMenu());
    }

    @Test
    public void isOpened() {
        Assert.assertTrue(rest.isOpened());
    }

    @Test
    public void setOpened() {
        rest.setOpened(false);
        Assert.assertFalse(rest.isOpened());
    }
}