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
public class Brick {
    
    int xPosition;
    int yPosition;
    int width;
    int height;
    Color color;
    
    public Brick(int newXPosition, int newYPosition, int newWidth, int newHeight, Color newColor)
    {
        xPosition = newXPosition;
        yPosition = newYPosition;
        width = newWidth;
        height = newHeight;
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
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setXPosition(int newX)
    {
        xPosition = newX;
    }
    
    public void setYPosition(int newY)
    {
        yPosition = newY;
    }
    
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    
    public void setColor(Color newColor)
    {
        color = newColor;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }
}
