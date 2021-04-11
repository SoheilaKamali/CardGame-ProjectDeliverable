package ca.sheridancollege.project;

import java.util.Scanner;

public class HumanPlayer extends Player {


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
        System.out.println("Player: " + getPlayerID() + "\nPoints: " + getPoints() + "\n");
        System.out.println(playerHand.display());
        System.out.print("Please enter The Card you would like to request: ");
        while(game.requestCard(playerHand.getCard(in.nextInt() - 1), this)) {
            System.out.println("Request Completed you have taken a card from computer request again: "
                    + playerHand.getCard(playerHand.getHandSize() - 1)+ "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
            System.out.println(playerHand.display());
            System.out.print("Request: ");

        }

        System.out.println("Request Failed Now you will draw a card");
        playerHand.drawCard();
        System.out.println("You have Drawn A card: "
                + playerHand.getCard(playerHand.getHandSize() - 1) + "\n");

        Card temp = playerHand.getCard(playerHand.getHandSize() - 1);
        if(playerHand.checkBook(temp)){
            addPoint();
            playerHand.extractCard(temp.rank);
        }
    }
}