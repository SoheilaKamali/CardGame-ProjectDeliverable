/**
 * SYST 17796 Project Winter 2021 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * hello
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye
 */
public class Card
{
     Suits suit;
     Ranks rank;
     //Constructor

     public Card(Suits suit, Ranks rank) {
         this.suit = suit;
         this.rank = rank;
     }

    @Override
    public String toString() {
        return rank + " " + suit;
    }

}
