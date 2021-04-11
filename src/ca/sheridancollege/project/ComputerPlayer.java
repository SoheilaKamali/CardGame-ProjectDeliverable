package ca.sheridancollege.project;

public class ComputerPlayer extends Player{

    public ComputerPlayer(Deck deck){
        super("computer" , deck);
    }

      @Override
    public void play() {
        System.out.println(playerHand.display());
        System.out.println("Please enter The Card you would like to request");

    }
}
