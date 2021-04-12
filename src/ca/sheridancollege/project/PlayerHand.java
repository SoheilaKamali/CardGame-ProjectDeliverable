package ca.sheridancollege.project;

import java.util.ArrayList;

public class PlayerHand{

    private ArrayList<Card> cards;
    private String playerName;

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

    public void addCards(ArrayList<Card> card){
        cards.addAll(card);
    }

    public ArrayList<Card> extractCard(Ranks card){
        ArrayList<Card> cardsFound = new ArrayList<>();
        for (Card i : cards){
            if(i.rank.equals(card)){
                cardsFound.add(i);
            }
        }
        cards.removeAll(cardsFound);
        return cardsFound;
    }

    public void drawCard(){
        cards.add(Game.getInstance().drawCard());
    }

    public boolean checkCard(Card card){
        return cards.contains(card);
    }
    public Card getCard(int index){
       return cards.get(index);
    }

    public int getHandSize(){
        return cards.size();
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

    public String getPlayerName() {
        return playerName;
    }

    public boolean checkBook(Card card) {
        int counter = 0;
        for(Card i : cards){
            if (i.equals(card)){
                counter++;
            }
        }
        return counter == 4;
    }
}
