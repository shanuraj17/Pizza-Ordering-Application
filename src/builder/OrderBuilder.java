package builder;

import model.OrderItems;
import model.SmallCheezePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderItems preparePizza() throws IOException{
        OrderItems itemsOrder = new OrderItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the choice of pizza and coke");
        int pizzaAndCokeChoice = Integer.parseInt(br.readLine());
        switch(pizzaAndCokeChoice){
            case 1 : {
                System.out.println("Enter veg or Non-veg pizza");
                int vegAndNonVeg = Integer.parseInt(br.readLine());
                switch(vegAndNonVeg){
                    case 1: {
                        System.out.println("Enter the Type of pizza 1.Veg Cheeze 2.Veg Onion 3.Veg Masala");
                        int typeOfPizza = Integer.parseInt(br.readLine());
                        switch(typeOfPizza){
                            case 1: {
                                    itemsOrder.addItems(new SmallCheezePizza());
                            }
                            break;
                        }
                    }


                }
            }
        }
        return itemsOrder;
    }
}
