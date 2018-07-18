/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author riley
 */
public abstract class GameObject implements Drawable{
    
    protected int xCord;
    protected int yCord;
    protected Color objColor;
    
    public int getXCord()
    {
        return xCord;
    }
    
    public int getYCord()
    {
        return yCord;
    }
    
    public Color getObjColor()
    {
        return objColor;
    }
    
    public void setXCord(int newX)
    {
        xCord = newX;
    }
    
    public void setYCord(int newY)
    {
        yCord = newY;
    }
    
    public void setObjColor(Color newColor)
    {
        objColor = newColor;
    }
    
    public abstract void draw(Graphics g);
    
    public abstract Rectangle getBounds();
    
}
