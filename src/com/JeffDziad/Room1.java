package com.JeffDziad;

public class Room1 extends Room implements Lootable, Interactable{

    public Room1(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(10);
        player.addToInventory("Ancient Coins(10)");
        return "*You touch the glowing print with your hand, a drawer opens an dispenses some coins.*\n*Ancient Coins(10) added to inventory!*";
    }

    @Override
    public String getDescription() {
        return "You find yourself inside some sort of ancient alien ruins.\nThere is an alter with a glowing hand print in the center of the room.\nThere are two doors that are sealed shut, maybe theres a key?";
    }

    @Override
    public String interact(Player player) {
        player.addToInventory("Key");
        player.setHasKey(true);
        return "*After scrambling to find a way out, you find a key hanging under the alter.*\n*Key added to inventory!*";
    }
}
