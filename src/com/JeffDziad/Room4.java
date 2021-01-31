package com.JeffDziad;

public class Room4 extends Room implements Lootable{


    public Room4(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(500);
        player.addToInventory("Ancient Coins(500)");
        return "*You start randomly mashing the buttons in hopes to find a way out.*\n*Instead a shower of coins rains on you. You pick up as many as you can carry.*\n*Ancient Coins(500) added to inventory!*";
    }

    @Override
    public String getDescription() {
        return "The room looks like some kind of control room.\nOn the wall are huge screens with buttons next to them.";
    }
}
