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
public class HourglassDraw extends JApplet {
    
    Hourglass hour1 = new Hourglass(10, 10, Color.BLUE);
    Hourglass hour200X = new Hourglass(10, 30, Color.GREEN);
    Hourglass hour50Y = new Hourglass(400, 10, Color.RED);
    Hourglass hourYellow = new Hourglass(600, 50, Color.BLUE);
    
    
    
    public void paint(Graphics g)
    {
        hour200X.setXPosition(200);
        hour50Y.setYPosition(50);
        hourYellow.setBoxColor(Color.YELLOW);
        
        setSize(1000, 500);
        
        hour1.draw(g);
        hour200X.draw(g);
        hour50Y.draw(g);
        hourYellow.draw(g);
    }
    
}
