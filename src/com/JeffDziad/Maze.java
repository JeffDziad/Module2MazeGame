package com.JeffDziad;

public class Maze {

    private Room currentRoom;

    private Player player;

    private boolean isFinished = false;

    public Maze(Player player){
        this.player = player;
        //create rooms and their connections
        Room1 room1 = new Room1("Teleportation Site");
        Room2 room2 = new Room2("Scroll Room");
        Room3 room3 = new Room3("Alien Wardrobe");
        Room4 room4 = new Room4("Control Center");
        Room5 room5 = new Room5("Cryogenics");
        Room6 room6 = new Room6("Unknown");
        room1.setEast(room2);
        room1.setDownward(room4);
        room2.setWest(room1);
        room2.setDownward(room5);
        room3.setEast(room4);
        room4.setUpward(room1);
        room4.setEast(room5);
        room4.setWest(room3);
        room4.setSouth(room6);
        room5.setUpward(room2);
        room5.setWest(room4);
        room6.setNorth(room4);
        currentRoom = room1;
    }

    public String exitCurrentRoom(){
        if(currentRoom instanceof Exit){
            ((Exit) currentRoom).exit(player);
            isFinished = true;
            return "The light of the sun finally shines on you once again, you've made it!";
        }else{
            return "You look around for some sort of secret exit, but none is to be found.";
        }
    }

    public String interactWithCurrentRoom(){
        if(currentRoom instanceof Interactable){
            return ((Interactable) currentRoom).interact(player);
        }else{
            return "There doesn't seem to be anything here to interact with.";
        }
    }

    public String lootCurrentRoom(){
        if(currentRoom instanceof Lootable){
            return ((Lootable) currentRoom).loot(player);
        }else{
            return "I dont see anything that I can take with me.";
        }
    }

    public boolean move(char direction){
        if(currentRoom.isValidDirection(direction)){
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        }else{
            return false;
        }
    }

    public String getPlayerInventory(){
        return player.getInventory();
    }

    public int getPlayerScore(){
        return player.getScore();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits(){
        return currentRoom.getExit();
    }

    public boolean isFinished(){
        return isFinished;
    }

}
