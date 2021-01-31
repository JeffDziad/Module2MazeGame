package com.JeffDziad;

public class Room1 extends Room implements Lootable{


    public Room1(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(10);
        player.addToInventory("Ancient Coins(10)");
        return "You touch the glowing print with your hand, a drawer opens an dispenses some coins.";
    }

    @Override
    public String getDescription() {
        return "You find yourself inside some sort of ancient alien ruins.\nThere is an alter with a glowing hand print in the center of the room.";
    }

}
