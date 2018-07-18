/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JApplet;

/**
 *
 * @author riley
 */
public class ModernArt extends JApplet {
    
        public void paint(Graphics g)
        {
            setSize(700, 700);
            
            super.paint(g);
            
            Polygon triDraw = new Polygon();
            triDraw.addPoint(250,0);
            triDraw.addPoint(150, 150);
            triDraw.addPoint(350, 150);
            
            g.drawPolygon(triDraw);
            
            Polygon triFill = new Polygon();
            triFill.addPoint(250, 600);
            triFill.addPoint(150, 450);
            triFill.addPoint(350, 450);
            
            g.setColor(Color.MAGENTA);
            g.fillPolygon(triFill);
            
            g.drawRect(150, 150, 200, 300);
            
            g.setColor(Color.BLUE);
            g.fillOval(100, 125, 50, 60);
            g.fillOval(350, 125, 50, 60);
            g.fillOval(100, 425, 50, 60);
            g.setColor(Color.BLACK);
            g.drawOval(350, 425, 50, 60);
            
            g.setColor(Color.GREEN);
            g.drawLine(200, 200, 200, 400);
            g.setColor(Color.RED);
            g.drawLine(250, 160, 250, 440);
            g.setColor(Color.GREEN);
            g.drawLine(300, 200, 300, 400);
            
            g.setColor(Color.MAGENTA);
            g.drawString("Sk8r Boiz", 125, 550);
        }
}
