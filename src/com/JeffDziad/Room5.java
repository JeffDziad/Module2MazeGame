package com.JeffDziad;

public class Room5 extends Room implements Interactable{


    public Room5(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        return "To investigate further, you wipe the condensation off the glass.\nYou cant believe you're eyes, these are aliens preserved in some sort of cryogenic chamber.";
    }

    @Override
    public String getDescription() {
        return "The room is filled with tube like structures but you cant seem to tell what they're containing.";
    }
}
