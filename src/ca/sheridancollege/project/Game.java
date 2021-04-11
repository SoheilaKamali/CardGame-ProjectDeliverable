package ca.sheridancollege.project;

public class Game {
    private static Game onlyGame = null;
    public ComputerPlayer computerPlayer;
    public HumanPlayer player1;
    private Deck deck;
    private Points points;

    private Game() {
        deck = new Deck();
        points = new Points();
    }

    public static Game getInstance(){
        if (onlyGame == null){
            onlyGame = new Game();
        }
        return onlyGame;
    }

    public void play() {
        while (points.getPoints() != 13) {
            player1.play();
            computerPlayer.play();
        }
    }
    public void initialize(String name){
        computerPlayer = new ComputerPlayer(deck);
        player1 = new HumanPlayer(name, deck);
    }

    public Card drawCard() {
        return deck.getCards();
    }

    public void requestCard(Card card, Player opponent) {
        try{
            opponent.playerHand.removeCard(card);
        }catch (Exception e){
            if(opponent.getPlayerID().equals("computer")){
                player1.playerHand.drawCard();
            }else {
                computerPlayer.playerHand.drawCard();
            }
    }
    }

    public Player checkWinner() {
        if (points.getPlayerPoints() > points.getComputerPoints()) {
            return player1;
        }
        return computerPlayer;
    }

}
