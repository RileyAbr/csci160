/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author riley
 */
public class Hourglass {
    
    int xPosition;
    int yPosition;
    Color boxColor;
    
    public Hourglass(int newXPosition, int newYPosition, Color newColor)
    {
        xPosition = newXPosition;
        yPosition = newYPosition;
        boxColor = newColor;
    }
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public Color getBoxColor()
    {
        return boxColor;
    }
    
    public void setXPosition(int newXPos)
    {
        xPosition = newXPos;
    }
    
    public void setYPosition(int newYPos)
    {
        yPosition = newYPos;
    }
    
    public void setBoxColor(Color newBoxCo)
    {
        boxColor = newBoxCo;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(boxColor);
        g.fillRect(xPosition + 20, yPosition + 20, 110, 160);
        
        g.setColor(Color.WHITE);
        Polygon sandTop = new Polygon();
        sandTop.addPoint(xPosition + 75, yPosition + 100);
        sandTop.addPoint(xPosition + 25, yPosition + 25);
        sandTop.addPoint(xPosition + 125, yPosition + 25);
        g.fillPolygon(sandTop);

        Polygon sandBot = new Polygon();
        sandBot.addPoint(xPosition + 75, yPosition + 100);
        sandBot.addPoint(xPosition + 25, yPosition + 175);
        sandBot.addPoint(xPosition + 125, yPosition + 175);
        g.fillPolygon(sandBot);
    
    }
    
    
    
    
    
}
