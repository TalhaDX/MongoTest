package com;

/**
 * Created by Talha on 3/24/2016.
 */
public class HouseBlend {


    public String getDescription() {
        return "House Blend";
    }

    public Double getPrice() {
        return 0.89D;
    }

    public String withMilkDescription(Milk milk) {
        return "House Blend with " + milk.getDescription();
    }

    public Double withMilkPrice(Milk milk) {
        return 0.99D;
    }
}
