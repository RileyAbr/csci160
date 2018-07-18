/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BattleShip;

import ProvidedClasses.Constants;
import ProvidedClasses.ShipLayout;

/**
 *
 * @author riley
 */
public class BugelnVogel implements BattleShipPlayer{
    
    int[] myShot = new int[2];
    Boolean bottomHalfDone = false;
    int xShot = 9;
    int yShot = 9;
    
    //Called when the game of BattleShip is over
    @Override
    public void gameOver(boolean won)
    {
        
    }
    
    //Called at the beginning of the game to place your ships
    @Override
    public ShipLayout getShipLayout()
    {
        //Create a ShipLayout object to manage our ship placements
        ShipLayout guteSchiffe = new ShipLayout();
        
        //Placing the five ships on the game board
        guteSchiffe.placeShip(Constants.CARRIER, 0, 0, Constants.HORIZONTAL);
        guteSchiffe.placeShip(Constants.BATTLESHIP, 4, 2, Constants.HORIZONTAL);
        guteSchiffe.placeShip(Constants.SUBMARINE, 5, 3, Constants.HORIZONTAL);
        guteSchiffe.placeShip(Constants.DESTROYER, 7, 4, Constants.HORIZONTAL);
        guteSchiffe.placeShip(Constants.PATROL, 7, 6, Constants.HORIZONTAL);
        
        return guteSchiffe;
    }
    
    //Called at the beginning of your turn to call your shot on an X and Y coordinate position
    @Override
    public int[] getShotLocation()
    {
        myShot[0] = xShot;
        myShot[1] = yShot;
        
        if(xShot > -1)
        {
            xShot--;
        }
        if(xShot == -1)
        {
            xShot = 9;
            yShot--;
        }
        
        return myShot;
    }
    
    //Called everytime a shot occurs in the game
    //yourShot – true if your AI made this shot.  False if it was your opponent’s
    //x – the x coordinate of this shot
    //y – the y coordinate of this shot
    //result – the result of this shot. Will be one of Constants.HIT, Constants.MISS
    /*shipSunk – if this shot caused a ship to sink, this will be one of 
    Constants.CARRIER, Constants.BATTLESHIP, Constants.SUBMARINE, 
    Constants.DESTROYER, Constants.PATROL.  Otherwise null */
    @Override
    public void shotNotification(boolean yourShot, int x, int y, String result, String shipSunk)
    {

    }
    

}


