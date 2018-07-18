/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author riley
 */
public class Ball {
    private int xPosition;
    private int yPosition;
    private int diameter;
    private int xVelocity;
    private int yVelocity;
    private Color color;
    
    public Ball()
    {
        xPosition = 20;
        yPosition = 20;
        diameter = 20;
        xVelocity = 7;
        yVelocity = 7;
        color = Color.BLUE;
    }
    
    public Ball(int newXPosition, int newYPosition, int newDiameter, int newXVelocity, int newYVelocity, Color newColor)
    {
        xPosition = newXPosition;
        yPosition = newYPosition;
        diameter = newDiameter;
        xVelocity = newXVelocity;
        yVelocity = newYVelocity;
        color = newColor;
    }
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public int getDiamter()
    {
        return diameter;
    }
    
    public int getXVelocity()
    {
        return xVelocity;
    }
    
    public int getYVelocity()
    {
        return yVelocity;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setXPosition(int newXPosition)
    {
        xPosition = newXPosition;
    }
    
    public void setYPosition(int newYPosition)
    {
        yPosition = newYPosition;
    }
    
    public void setDiamter(int newDiameter)
    {
        diameter = newDiameter;
    }
    
    public void setXVelocity(int newXVelocity)
    {
        xVelocity = newXVelocity;
    }
    
    public void setYVelocity(int newYVelocity)
    {
        yVelocity = newYVelocity;
    }
    
    public void setColor(Color newColor)
    {
        color = newColor;
    }
    
    public void move()
    {
        xPosition += xVelocity;
        yPosition += yVelocity;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }
}

