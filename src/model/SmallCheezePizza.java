package model;

import constants.PizzaSize;

public class SmallCheezePizza extends VegPizza{


    @Override
    public String name() {
        return "Small Chezze Pizza";
    }

    @Override
    public String size() {
        return String.valueOf(PizzaSize.SMALL);
    }

    @Override
    public float price() {
        return 100.0f;
    }
}
