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
        System.out.println("1. - Love all");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Love all";
        String result = game.getScore();
        assertEquals(expResult, result);
    }
  
    
    @Test
    public void testFifteenLove(){
        System.out.println("2- Pedro - Fifteen,Love");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Fifteen,Love";
        game.playerOneScores();  //15 0
        String result = game.getScore();
        assertEquals(expResult, result);
    }
 
     @Test
    public void testFiftennAll(){
        System.out.println("3- Fifteen,all");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Fifteen all";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //30 0 
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
 
    @Test
    public void testFortyThirty(){
        System.out.println("4- Pedro Forty,Thirty");
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
    public void testPedroWins(){
        System.out.println("5- Pedro wins");
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
    public void testThirtyForty(){
        System.out.println("6- Juan Thirty, Forty");
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
    public void testJuanWins(){
        System.out.println("7- Juan wins");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Juan wins";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerTwoScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerTwoScores(); //30 40
        game.playerTwoScores(); //30 wins
        String result = game.getScore();
        assertEquals(expResult, result);
    }
   
    
     @Test
    public void testDuece(){
        System.out.println("8- Deuce");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Deuce";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //15 15
        game.playerOneScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerOneScores(); //40 30
        game.playerTwoScores(); //40 40
     
        String result = game.getScore();
        assertEquals(expResult, result);
    }
   
     @Test
    public void testAdvantagePedro(){
        System.out.println("9- Advantage Pedro");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Advantage Pedro";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //15 15
        game.playerOneScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerOneScores(); //40 30
        game.playerTwoScores(); //40 40
        game.playerOneScores(); //ad 40

        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
      @Test
    public void testAdvantageJuan(){
        System.out.println("10 Advantage juan");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Advantage Juan";
        game.playerOneScores(); //15 0
        game.playerTwoScores(); //15 15
        game.playerOneScores(); //30 15
        game.playerTwoScores(); //30 30
        game.playerOneScores(); //40 30
        game.playerTwoScores(); //40 40
        game.playerTwoScores(); //40 av
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
     
    // TEST PARTICION INVALIDA
     @Test
    public void testPuntajeMayorPedroMasde40(){
        System.out.println("I1 - PuntajePedro > 40");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Wrong Score";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerOneScores(); //40 0
        game.playerOneScores(); //>40 0
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
   @Test
    public void testPuntajeMayorJuanMasde40(){
        System.out.println("I2 PuntajeJuan > 40");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Wrong Score";
        game.playerTwoScores(); //15
        game.playerTwoScores(); //30
        game.playerTwoScores(); //40
        game.playerTwoScores(); //>40
        String result = game.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPuntajeMayorEnAdvantageJuan(){
        System.out.println("I3 PuntajeMayorEnAdvantageJuan");
        game = new TennisGame("Pedro", "Juan");
        String expResult = "Wrong Score";
        game.playerOneScores(); //15 0
        game.playerOneScores(); //30 0
        game.playerOneScores(); //40 0
        game.playerTwoScores(); //40 15
        game.playerTwoScores(); //40 30
        game.playerTwoScores(); //40 40
        game.playerTwoScores(); //40 av
        game.playerTwoScores(); //40 av
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
