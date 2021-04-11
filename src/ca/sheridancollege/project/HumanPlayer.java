package ca.sheridancollege.project;

import java.util.Scanner;

public class HumanPlayer extends Player {

    Game game = Game.getInstance();
    Scanner in = new Scanner(System.in);


    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public HumanPlayer(String name, Deck deck) {
        super(name, deck);

    }

    @Override
    public void play() {
        System.out.println(playerHand.display());
        System.out.println("Please enter The Card you would like to request");
        in.nextInt();

    }

}