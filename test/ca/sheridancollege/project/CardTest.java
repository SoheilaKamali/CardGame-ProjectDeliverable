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
public class CardTest {
    
    public CardTest() {
    }
    Card card = new Card(HEARTS, ACE);
    Card cardrequested = new Card(DIAMONDS, ACE);
    Card cardrequested2 = new Card(DIAMONDS, TWO);
    
    
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
     * Test of toString method, of class Card.
     * GOOD TEST CASE
     */
    @Test
    public void testGoodToString() {
        System.out.println("toString");
        Card instance = card;
        String expResult = "ACE of HEARTS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Card.
     * GOOD TEST CASE
     */
    @Test
    public void testGoodEquals() {
        System.out.println("equals");
        Object o = cardrequested;
        Card instance = card;
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Card.
     * BAD TEST CASE
     */
    @Test
    public void testBadEquals(){
        System.out.println("equals");
        Object o = cardrequested2;
        Card instance = card;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
}
