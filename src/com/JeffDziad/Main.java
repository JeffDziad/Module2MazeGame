package com.JeffDziad;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Player player = new Player();
        Maze maze = new Maze(player);

        char[] possibleMoves = {'N', 'S', 'E', 'W', 'U', 'D'};

        String userInputString;
        char userInputChar;

        backstory();

        System.out.println("Commands: ");
        System.out.println("- N = Move North\n- S = Move South\n- E = Move East\n- W = Move West\n- U = Move Up\n- D = Move Down\n- I = Interact\n- L = Loot\n- X = Try to Exit\n- V = Show Inventory\n\n");

        while(!maze.isFinished()){
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("Room Exits: " + maze.getCurrentRoomExits());
            System.out.print("\nEnter command: ");
            userInputString = sc.nextLine();
            userInputChar = userInputString.charAt(0);
            userInputChar = Character.toUpperCase(userInputChar);
            //check if user inputted a movement command
            if(checkForMove(possibleMoves, userInputChar)){
                if(player.getHasKey()){
                    if(!maze.move(userInputChar)){
                        System.out.println("That's not a valid move.");
                    }
                }else{
                    System.out.println("*You try your hardest, but you cant seem to pry the doors open. Maybe its time to look around some more?*");
                }
            }else if(userInputChar == 'I'){
                System.out.println(maze.interactWithCurrentRoom());
            }else if(userInputChar == 'L'){
                System.out.println(maze.lootCurrentRoom());
            }else if(userInputChar == 'X'){
                System.out.println(maze.exitCurrentRoom());
            }else if(userInputChar == 'V'){
                System.out.println("Inventory: " + maze.getPlayerInventory());
            }else{
                System.out.println("*Not a valid command!*");
            }
        }
        System.out.println("Your final score was: " + maze.getPlayerScore() + " Points");
    }

    public static boolean checkForMove(char[] arr, char input){
        for(char i: arr){
            if(i == input){
                return true;
            }
        }
        return false;
    }

    public static void backstory(){
        String buffer;
        System.out.println("The year is 2029.");
        System.out.println("Mars Base Alpha is a newly established base on the surface of Mars.");
        System.out.println("You are a new hire to work at the base as a geologic researcher.");
        System.out.println("Eventually, you and your team are exploring a underground cave system when everything goes wrong.");
        System.out.println("You are separated from your team when you are teleported into some sort of intricate underground alien structure.");
        System.out.println("Its up to you to make it out alive.");
        System.out.println("Press the ENTER key to begin your journey...");
        buffer = sc.nextLine();
    }

}

