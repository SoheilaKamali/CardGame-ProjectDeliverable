package ca.sheridancollege.project;

public class Game {
    private static Game onlyGame = null;
    private ComputerPlayer computerPlayer;
    private HumanPlayer player1;
    private Deck deck;

    private Game() {
        deck = new Deck();
    }

    public static Game getInstance(){
        if (onlyGame == null){
            onlyGame = new Game();
        }
        return onlyGame;
    }

    public void play() {
        while ((player1.getPoints() + computerPlayer.getPoints()) != 13) {
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


    public boolean requestCard(Card card, Player requester) {
        Player opponent = null;
        if (requester != computerPlayer){
            opponent = computerPlayer;
        }else{
            opponent = player1;
        }
            if(opponent.playerHand.checkCard(card)){
                requester.playerHand.addCards(opponent.playerHand.extractCard(card.rank));
                return true;
            }else{
                return false;
            }
    }

    public Player checkWinner() {
        if (player1.getPoints() > computerPlayer.getPoints()) {
            return player1;
        }
        return computerPlayer;
    }
}

