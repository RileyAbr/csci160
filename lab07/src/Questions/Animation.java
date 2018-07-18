/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author (Your Name Here)
 */
public class Animation extends JApplet 
{
    /*  For this portion of the assignment, you will be creating a simple animation 
        of a ball that moves around the screen of an applet and bounces off of the
        walls.
    
        As part of this assignment, you will need to have first completed the Ball class. 
    
        1) Create an instance of the Ball class and make sure it can draw itself
        2) Complete the detectCollisions method that determines when your Ball object
            has collided with any of the walls, in which case it should reverse direction.
        3) Create an instance of the Timer class and assign it an ActionListener that
            moves the ball around and repaints the screen every time it triggers its event
    */
    
    private Ball b1;
    
    public void init() 
    {
        b1 = new Ball();
        Timer t = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e) 
            {
            update();  // Calls method to move objects
            repaint(); // Redraw the screen
            detectCollisions();
            }
        });

        t.start();     
    }

    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        super.paint(g);
        
        b1.draw(g);
    }
    
    public void update()
    {
        b1.move();
    }
    
    public void detectCollisions()
    {
        int width = this.getWidth();
        int height = this.getHeight();
        
        if(b1.getXPosition() < 0 || b1.getXPosition() + b1.getDiamter() > width)
        {
            b1.setXVelocity(b1.getXVelocity() * -1);
            b1.setColor(Color.BLUE);
        }
        
        if(b1.getYPosition() < 0 || b1.getYPosition() + b1.getDiamter() > height)
        {
            b1.setYVelocity(b1.getYVelocity() * -1);
            b1.setColor(Color.RED);
        }
    }
}
