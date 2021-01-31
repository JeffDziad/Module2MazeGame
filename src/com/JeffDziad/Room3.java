package com.JeffDziad;

public class Room3 extends Room implements Interactable{


    public Room3(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(10);
        player.addToInventory("Alien Clothing");
        return "*You take some of the cloths and put them on, and damn, do you look good in them.*\n*Alien Clothing added to inventory!*";
    }

    @Override
    public String getDescription() {
        return "The room is filled with clothing, none of which looks like its for humans.";
    }
}
