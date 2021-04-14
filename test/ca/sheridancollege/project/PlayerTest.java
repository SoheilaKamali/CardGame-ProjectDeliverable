/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
public class PlayerTest {
    
    public PlayerTest() {
    }
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
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = hplayer;
        String expResult = "omar";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPoint method, of class Player.
     */
    @Test
    public void testAddPoint() {
        System.out.println("addPoint");
        Player instance = hplayer;
        instance.addPoint();
    }

    /**
     * Test of getPoints method, of class Player.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Player instance = hplayer;
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("", null);
        }

        public void play() throws InterruptedException {
        }
    }
    
}
