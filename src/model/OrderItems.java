package model;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {
    List<Item> items = new ArrayList<Item>();
    public void addItems(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost=0.0f;
        for(Item item : items){
            cost+=item.price();
        }
        return cost;
    }
    public void showItem(){
        for(Item item : items){

        }
    }

}
