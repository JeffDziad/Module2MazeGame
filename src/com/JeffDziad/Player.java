package com.JeffDziad;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int score = 0;
    private List<String> inventory = new ArrayList<>();

    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addToScore(int points){
        score += points;
    }

    public String getInventory(){
        StringBuilder output = new StringBuilder("");
        if(inventory.size() == 0) {
            return "Your Inventory is Empty!";
        }else{
            for(String item : inventory){
                output.append(item).append(", ");
            }
            String items = output.toString();
            if(items.length() > 0){
                items = items.substring(0, items.length() - 2);
            }
            return items;
        }
    }

    public int getScore(){
        return score;
    }

}
