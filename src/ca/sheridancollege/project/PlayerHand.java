package ca.sheridancollege.project;
import java.util.ArrayList;

public class PlayerHand{

    ArrayList<Card> cards;

    public PlayerHand(Deck deck) {
    cards = new ArrayList<>();
    takeCards(7, deck);
    }

    public void takeCards (int amount, Deck deck){
       cards.addAll(deck.getCards(amount));
    }
    public void addCard(Card card){
        cards.add(card);
    }
    public void removeCard(Card card){
        cards.remove(card);
    }
}
