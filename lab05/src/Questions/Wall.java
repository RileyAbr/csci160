/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author riley
 */
public class Wall extends JApplet
{
    Brick brick1 = new Brick(10, 10, 40, 20, Color.RED);
    Brick brick2 = new Brick(30, 30, 40, 20, Color.ORANGE);
    Brick brick3 = new Brick(50, 50, 40, 20, Color.YELLOW);
    Brick brick4 = new Brick(70, 70, 40, 20, Color.GREEN);
    Brick brick5 = new Brick(90, 90, 40, 20, Color.BLUE);
    Brick brick6 = new Brick(110, 110, 40, 20, Color.CYAN);
    Brick brick7 = new Brick(130, 130, 40, 20, Color.MAGENTA);
    Brick brick8 = new Brick(150, 150, 40, 20, Color.GRAY);
    
    public void paint(Graphics g)
    {
        brick1.draw(g);
        brick2.draw(g);
        brick3.draw(g);
        brick4.draw(g);
        brick5.draw(g);
        brick6.draw(g);
        brick7.draw(g);
        brick8.draw(g);
        
    }
}
