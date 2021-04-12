package ca.sheridancollege.project;

public class ComputerPlayer extends Player{


    public ComputerPlayer(Deck deck){
        super("computer" , deck);
    }

    @Override
    public void play()  {

        System.out.println("Player: " + getPlayerID() + "\nPoints: " + getPoints() + "\n");
        System.out.println("Computer is picking...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignore) {
        }

        int numChosen = (int) Math.floor(Math.random() * (playerHand.getHandSize()-1));

        while(game.requestCard(playerHand.getCard(numChosen), this)) {
            numChosen = (int) Math.floor(Math.random() * (playerHand.getHandSize()-1));
            System.out.println("Request Completed Computer has taken a Card From you and will request again: "
                    + playerHand.getCard(playerHand.getHandSize() - 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        }
        System.out.println("Computer's Request Failed now will draw a card \n");
        playerHand.drawCard();

        Card temp = playerHand.getCard(playerHand.getHandSize() - 1);

        if(playerHand.checkBook(temp)){
            addPoint();
            playerHand.extractCard(temp.rank);
        }
    }
}
