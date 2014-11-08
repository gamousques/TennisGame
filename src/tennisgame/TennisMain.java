/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennisgame;
import tennisgame.TennisGame;
/**
 *
 * @author gaston
 */
public class TennisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TennisGame game =  new TennisGame("Gaston", "Federer");
        // Game típico 
        System.out.println("Partido Tipico");
        
        System.out.println("Saca Gastón");
        game.playerOneScores(); //15 0
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Federer");
        game.playerTwoScores();//15 15
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Gastón");
        game.playerOneScores(); //30 15
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Federer");
        game.playerTwoScores();//30 30
        System.out.println("Score=" + game.getScore());
       
        System.out.println("Saca Gastón");
        game.playerOneScores(); //40 30
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Federer");
        game.playerOneScores(); //win 30    
        System.out.println(game.getScore());
    }
    
}
