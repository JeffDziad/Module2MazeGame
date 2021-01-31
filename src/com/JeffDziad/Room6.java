package com.JeffDziad;

public class Room6 extends Room implements Exit, Interactable{


    public Room6(String name) {
        super(name);
    }

    @Override
    public String exit(Player player) {
        return "*You step onto the glowing circle and the ceiling opens above you. You wait a few seconds and you are teleported back to the surface.*\n*It seems you may live to tell your story.*";
    }

    @Override
    public String interact(Player player) {
        return "*You step onto the glowing circle and the ceiling opens above you.*";
    }

    @Override
    public String getDescription() {
        return "A glowing circle in the center of this empty room intensifies as you walk in.";
    }
}
