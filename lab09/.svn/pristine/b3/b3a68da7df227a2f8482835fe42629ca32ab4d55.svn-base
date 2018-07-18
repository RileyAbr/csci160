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
public class Ball extends GameObject
                    implements Moveable{
    
    private int diameter;
    private int xVelocity;
    private int yVelocity;
    
    public Ball(int newX, int newY, int newDia, Color newColor)
    {
        super.xCord = newX;
        super.yCord = newY;
        diameter = newDia;
        super.objColor = newColor;
        xVelocity = 2;
        yVelocity = 2;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(objColor);
        g.fillOval(xCord, xCord, diameter, diameter);
    }
    
    public void move()
    {
        xCord += xVelocity;
        yCord += yVelocity;
    }
    
    public Rectangle getBounds()
    {
        Rectangle bounds = new Rectangle(xCord, yCord, diameter, diameter);
        
        return bounds;
    }
}
