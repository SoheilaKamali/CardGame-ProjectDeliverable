/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Suits.*;
import static ca.sheridancollege.project.Ranks.*;
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
public class GameTest {
    
    public GameTest() {
    }
    
    Game game = Game.getInstance();
    Deck deck = Deck.getInstance();
    Card c = new Card(HEARTS, ACE);
    HumanPlayer hplayer = new HumanPlayer("omar", deck);
    ComputerPlayer cplayer = new ComputerPlayer(deck);
    
    
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
     * Test of initialize method, of class Game.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        String name = "omar";
        Game instance = game;
        instance.initialize(name);
    }

    /**
     * Test of drawCard method, of class Game.
     * NEED to change the array-list in the deck class to public in order to work.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Game instance = game;
        Card expResult = deck.cards.get(0);
        Card result = instance.drawCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of requestCard method, of class Game.
     * Some times it will Fail because player hand is randomized 
     * every time we run the test 
     */
    @Test
    public void testGoodRequestCard() {
        System.out.println("requestCard");
        Card card = c;
        Player requester = hplayer;
        Game instance = game;
        boolean expResult = true;
        boolean result = instance.requestCard(card, requester);
        assertEquals(expResult, result);
    }
    
}
