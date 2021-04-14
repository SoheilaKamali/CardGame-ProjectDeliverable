/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omarz
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    Deck deck = Deck.getInstance();
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deckBuild method, of class Deck.
     * GOOD Test Case
     */
    @Test
    public void testDeckBuild() {
        System.out.println("deckBuild");
        Deck instance = deck;
        instance.deckBuild();
    }

    
    /**
     * Test of getCards method, of class Deck.
     * NEED to change the array-list in the deck class to public in order to work.
     */
    @Test
    public void testGetCards_0args() {
        System.out.println("getCards");
        Deck instance = deck;
        Card expResult = deck.cards.get(0);
        Card result = instance.getCards();
        assertEquals(expResult, result);
    }

    
}
