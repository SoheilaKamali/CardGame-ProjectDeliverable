package ca.sheridancollege.project;


public class ComputerPlayer extends Player{


    public ComputerPlayer(Deck deck){
        super("computer" , deck);
    }

    @Override
    public void play()  {

        System.out.println("Player: " + getPlayerID() + "\nPoints: " + getPoints() + "\n");
        System.out.println("Computer is picking...");
        delay(3000);

        Card temp;

        int numChosen = (int) Math.floor(Math.random() * (playerHand.getHandSize()-1));

        while(game.requestCard(playerHand.getCard(numChosen), this)) {
            numChosen = (int) Math.floor(Math.random() * (playerHand.getHandSize()-1));
            System.out.println("Request Completed Computer has taken a Card From you and will request again: "
                    + playerHand.getCard(playerHand.getHandSize() - 1));

            temp = playerHand.getCard(playerHand.getHandSize() - 1);
            if(playerHand.checkBook(temp)){
                addPoint();
                playerHand.extractCard(temp.rank);
                System.out.println("Points Awarded\nNew Points: " + getPoints() + " For " + getPlayerID());
                System.out.println("for card " + temp.rank.name() + "\n");
            }

            delay(2000);
        }
        System.out.println("Computer's Request Failed now will draw a card \n");
        playerHand.drawCard();
        delay(2000);

        temp = playerHand.getCard(playerHand.getHandSize() - 1);

        if(playerHand.checkBook(temp)){
            addPoint();
            playerHand.extractCard(temp.rank);
            System.out.println("Points Awarded\nNew Points: " + getPoints() + " For " + getPlayerID());
            System.out.println("for card " + temp.rank.name() + "\n");

        }
    }
}
