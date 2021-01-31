package com.JeffDziad;

import java.util.ArrayList;

public abstract class Room {

    private String name;

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name){
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
        char dir = Character.toUpperCase(direction);
        if(dir == 'N'){
            if(this.north != null)
                return this.north;
        }else if(dir == 'S'){
            if(this.south != null)
                return this.south;
        }else if(dir == 'E'){
            if(this.east != null)
                return this.east;
        }else if(dir == 'W'){
            if(this.west != null)
                return this.west;
        }else if(dir == 'U'){
            if(this.up != null)
                return this.up;
        }else if(dir == 'D'){
            if(this.down != null)
                return this.down;
        }
        return null;
    }

    public String getExit(){
        ArrayList<String> exits = new ArrayList<String>();
        if(this.north != null){
            exits.add("N");
        }
        if(this.south != null){
            exits.add("S");
        }
        if(this.east != null){
            exits.add("E");
        }
        if(this.west != null){
            exits.add("W");
        }
        if(this.up != null){
            exits.add("U");
        }
        if(this.down != null){
            exits.add("D");
        }
        StringBuilder exitsOutput = new StringBuilder("");
        for(String exit : exits){
            exitsOutput.append(exit).append(", ");
        }
        String output = exitsOutput.toString();
        if(output.length() > 0){
            output = output.substring(0, output.length() - 2);
        }
        return output;
    }

    public String getName(){
        return name;
    }

    public boolean isValidDirection(char direction){
        char dir = Character.toUpperCase(direction);
        if(dir == 'N'){
            if(this.north != null){
                return true;
            }
        }else if(dir == 'S'){
            if(this.south != null){
                return true;
            }
        }else if(dir == 'E'){
            if(this.east != null){
                return true;
            }
        }else if(dir == 'W'){
            if(this.west != null){
                return true;
            }
        }else if(dir == 'U'){
            if(this.up != null){
                return true;
            }
        }else if(dir == 'D'){
            if(this.down != null){
                return true;
            }
        }
        return false;
    }

    public void setNorth(Room n){
        this.north = n;
    }

    public void setSouth(Room s){
        this.south = s;
    }

    public void setEast(Room e){
        this.east = e;
    }

    public void setWest(Room w){
        this.west = w;
    }

    public void setUpward(Room u){
        this.up = u;
    }

    public void setDownward(Room d){
        this.down = d;
    }

}
