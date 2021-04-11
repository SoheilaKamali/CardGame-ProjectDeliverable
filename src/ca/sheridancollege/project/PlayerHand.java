package ca.sheridancollege.project;

import java.util.ArrayList;

public class PlayerHand{

    private ArrayList<Card> cards;
    public String playerName;

    public PlayerHand(Deck deck, String name) {
        cards = new ArrayList<>();
        takeCards(7, deck);
        playerName = name;
    }

    private void takeCards (int amount, Deck deck){
        cards.addAll(deck.getCards(amount));
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card);
    }
    public void drawCard(){
        cards.add(Game.getInstance().drawCard());
    }

    public boolean checkCard(Ranks card){
        for(Card i : cards){
            if(i.rank.equals(card)){
                return true;
            }
        }
        return false;
    }

    public String display(){
        int counter = 1;
        String cards = "";
        for (Card i : this.cards){
            cards += counter + ". " + i + "\n";
            counter++;
        }
        return cards;
    }

    public boolean checkBook(Card card) {
        int counter = 0;
        for(Card i : cards){
            if (i.rank.equals(card.rank)){
                counter++;
            }
        }
        return counter == 4;
    }
}
