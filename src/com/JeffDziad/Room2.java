package com.JeffDziad;

public class Room2 extends Room implements Interactable{


    public Room2(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(10);
        player.addToInventory("Alien Tablets(2)");
        return "You quickly grab as many as you can hold in hopes to decode them once you get back to Mars Base Alpha.";
    }

    @Override
    public String getDescription() {
        return "There are tablets of unknown origin scattered throughout the room.\nThey seem to be written in an alien language.";
    }
}
