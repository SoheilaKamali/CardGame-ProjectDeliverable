package ca.sheridancollege.project;

public class Game {
    ComputerPlayer computerPlayer;
    HumanPlayer player1;
    Deck deck;

    public Game(String name) {
        deck = new Deck();
        computerPlayer = new ComputerPlayer(deck);
        player1 = new HumanPlayer(name, deck);
    }

    public void play() {
    }

    public void drawCard() {

    }

    public void requestCard() {
    }

    public boolean checkBook() {
        return false;
    }

    public String checkWinner() {
        return null;
    }


}
