package main;

import builder.OrderBuilder;
import model.OrderItems;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OrderBuilder orderBuilder = new OrderBuilder();
        OrderItems orderItems = orderBuilder.preparePizza();
        orderItems.showItem();
        float totalCost = orderItems.getCost();
        System.out.println(totalCost);
    }
}
