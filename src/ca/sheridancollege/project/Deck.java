package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{

    private ArrayList <Card> cards;

    public Deck() {
        cards = new ArrayList<>(52);
        deckBuild();
        shuffle();
    }

    public void deckBuild(){
        int i = 0;
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                cards.add(i, new Card(s, r));
                // increment i here
                // System.out.println(cards.get(i));
                i++;
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards(int amount) {
        ArrayList<Card> card = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            card.add(cards.get(0));
            cards.remove(0);
        }
        return card;
    }

    public Card getCards() {
        Card card;
        card = (cards.get(0));
        cards.remove(0);
        return card;
    }


    @Override
    public String toString() {
        return null;
    }
}
