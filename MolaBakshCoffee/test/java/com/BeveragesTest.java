package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeveragesTest {

    // Beverages
    private HouseBlend houseBlend = new HouseBlend();
    private DarkRoast darkRoast = new DarkRoast();
    private Decaf decaf = new Decaf();
    private Espresso espresso = new Espresso();

    // Condiments
    private Milk milk = new Milk();
    private Soy soy = new Soy();
    private Mocha mocha = new Mocha();
    private Whip whip = new Whip();


    @Test
         public void HouseBlendDescription() {
        assertEquals("House Blend", houseBlend.getDescription());
    }

    @Test
    public void HouseBlendPrice() {
        assertEquals(Double.valueOf(0.89), houseBlend.getPrice());
    }

    @Test
    public void DarkRoastDescription() {
        assertEquals("Dark Roast", darkRoast.getDescription());
    }

    @Test
    public void DarkRoastPrice() {
        assertEquals(Double.valueOf(0.99), darkRoast.getPrice());
    }

    @Test
    public void DecafDescription() {
        assertEquals("Decaf", decaf.getDescription());
    }

    @Test
    public void DecafPrice() {
        assertEquals(Double.valueOf(1.05), decaf.getPrice());
    }

    @Test
    public void EspressoDescription() {
        assertEquals("Espresso", espresso.getDescription());
    }

    @Test
    public void EspressoPrice() {
        assertEquals(Double.valueOf(1.99), espresso.getPrice());
    }

    @Test
    public void MilkDescription() {
        assertEquals("Milk", milk.getDescription());
    }

    @Test
    public void MilkPrice() {
        assertEquals(Double.valueOf(0.10), milk.getPrice());
    }

    @Test
    public void SoyDescription() {
        assertEquals("Soy", soy.getDescription());
    }

    @Test
    public void SoyPrice() {
        assertEquals(Double.valueOf(0.15), soy.getPrice());
    }

    @Test
    public void MochaDescription() {
        assertEquals("Mocha", mocha.getDescription());
    }

    @Test
    public void MochaPrice() {
        assertEquals(Double.valueOf(0.20), mocha.getPrice());
    }

    @Test
    public void WhipDescription() {
        assertEquals("Whip", whip.getDescription());
    }

    @Test
    public void WhipPrice() {
        assertEquals(Double.valueOf(0.10), whip.getPrice());
    }

    @Test
    public void HouseBlendWithMilkDescription() {
        assertEquals("House Blend with Milk", houseBlend.withMilkDescription(milk));
    }

    @Test
    public void HouseBlendWithMilkPrice() {
        assertEquals(Double.valueOf(0.99), houseBlend.withMilkPrice(milk));
    }

}
