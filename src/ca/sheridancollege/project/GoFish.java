package ca.sheridancollege.project;


import java.util.Scanner;

public class GoFish {


    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to GoFish a game against the computer");
        System.out.print("please enter a Player Name: ");
        Game game = Game.getInstance();
        game.initialize(in.nextLine());
        game.play();
        System.out.println(game.checkWinner().getPlayerID() + " is the WINNER. HOORAY!!");

    }


}
