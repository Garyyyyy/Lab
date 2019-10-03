package assignment2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MenuTest {

    List<String> meals = new ArrayList<>();
    List<String> desserts = new ArrayList<>();
    List<String> beverages = new ArrayList<>();
    List<String> drinks = new ArrayList<>();

    Menu menu = new Menu(meals, desserts, beverages, drinks);

    @Test
    public void getMeals() {
        Assert.assertEquals(meals, menu.getMeals());
    }

    @Test
    public void setMeals() {
        meals.add("A");
        Assert.assertEquals(meals, menu.getMeals());
    }

    @Test
    public void getDesserts() {
        Assert.assertEquals(desserts, menu.getDesserts());
    }

    @Test
    public void setDesserts() {
        desserts.add("B");
        Assert.assertEquals(desserts, menu.getDesserts());
    }

    @Test
    public void getBeverages() {
        Assert.assertEquals(beverages, menu.getBeverages());
    }

    @Test
    public void setBeverages() {
        beverages.add("C");
        Assert.assertEquals(beverages, menu.getBeverages());
    }

    @Test
    public void getDrinks() {
        Assert.assertEquals(drinks, menu.getDrinks());
    }

    @Test
    public void setDrinks() {
        drinks.add("D");
        Assert.assertEquals(drinks, menu.getDrinks());
    }
}