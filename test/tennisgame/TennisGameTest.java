/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennisgame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gaston
 */
public class TennisGameTest {
    TennisGame game = null;
    
    public TennisGameTest() {
    }
    
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

     @Test
    public void testLoveAll(){
        System.out.println("Love all");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Love all";
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFifteenLove(){
        System.out.println("Fifteen,Love");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Fifteen,Love";
        game.playerOneScores();  //15 0
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testFiftennAll(){
        System.out.println("Fifteen,all");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Fifteen all";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //30 0 
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFortyThirty(){
        System.out.println("Forty,Thirty");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Forty,Thirty";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerOneScores(); //40 0
        game.playerTwoScores(); //40 15
        game.playerTwoScores(); //40 30
        String result = game.getScore();
        assertEquals(expResult, result);
    }

     @Test
    public void testThirtyForty(){
        System.out.println("Thirty, Forty");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Thirty,Forty";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerTwoScores(); //30 40
        String result = game.getScore();
        assertEquals(expResult, result);
    }
   
    
     @Test
    public void testDuece(){
        System.out.println("Deuce");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Deuce";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerTwoScores(); //30 40
        game.playerOneScores(); //40 40
        String result = game.getScore();
        assertEquals(expResult, result);
    }
   
     @Test
    public void testAdvantagePedro(){
        System.out.println("Advantage Pedro");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Advantage Pedro";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerTwoScores(); //30 40
        game.playerOneScores(); //40 40
        game.playerOneScores(); //ad 40
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
      @Test
    public void testAdvantageJuan(){
        System.out.println("Advantage juan");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Advantage Juan";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerTwoScores(); //30 40
        game.playerOneScores(); //40 40
        game.playerTwoScores(); //40 av
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testPedroWins(){
        System.out.println("Pedro Wins");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Pedro wins";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerOneScores(); //40 0
        game.playerTwoScores(); //40 15
        game.playerTwoScores(); //40 30
        game.playerOneScores(); //win 30
        String result = game.getScore();
        assertEquals(expResult, result);
    }

    @Test
    public void testJuanWins(){
        System.out.println("Juan wins");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Juan wins";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //15 15
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //40 15
        game.playerTwoScores(); //win 15
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    /**
     * Test of getScore method, of class TennisGame.
     */
 

    /**
     * Test of playerOneScores method, of class TennisGame.
     */
 
}
