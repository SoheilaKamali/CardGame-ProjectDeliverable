/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Ranks.ACE;
import static ca.sheridancollege.project.Suits.HEARTS;
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
public class PlayerHandTest {
    
    public PlayerHandTest() {
    }
    Card c = new Card(HEARTS, ACE);
    Deck deck = Deck.getInstance();
    HumanPlayer hplayer = new HumanPlayer("omar", deck);
    
    
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
     * Test of extractCard method, of class PlayerHand.
     */
    @Test
    public void testExtractCard() {
        System.out.println("extractCard");
        Ranks card = c.rank;
        PlayerHand instance = hplayer.playerHand;
        ArrayList<Card> expResult = new ArrayList<>();
        expResult.add(c);
        ArrayList<Card> result = instance.extractCard(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of addDrawnCard method, of class PlayerHand.
     */
    @Test
    public void testAddDrawnCard() {
        System.out.println("addDrawnCard");
        PlayerHand instance = hplayer.playerHand;
        instance.addDrawnCard();
    }

    /**
     * Test of checkCard method, of class PlayerHand.
     * Some times it will Fail because player hand is randomized 
     * every time we run the test. (NOT EXPECTED RESULT) Result can be random  
     */
    @Test
    public void testCheckCard() {
        System.out.println("checkCard");
        Card card = c;
        PlayerHand instance = hplayer.playerHand;
        boolean expResult = false;
        boolean result = instance.checkCard(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkBook method, of class PlayerHand.
     */
    @Test
    public void testCheckBook() {
        System.out.println("checkBook");
        Card card = c;
        PlayerHand instance = hplayer.playerHand;
        boolean expResult = false;
        boolean result = instance.checkBook(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkRequest method, of class PlayerHand.
     */
    @Test
    public void testCheckRequest() {
        System.out.println("checkRequest");
        Card card = c;
        PlayerHand instance = hplayer.playerHand;
        boolean expResult = false;
        boolean result = instance.checkRequest(card);
        assertEquals(expResult, result);
    }
    
}
