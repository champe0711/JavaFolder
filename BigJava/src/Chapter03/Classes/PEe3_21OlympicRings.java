/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author chris
 */
public class PEe3_21OlympicRings {
    
    private int xLeft;
    private int yTop;
    private Color color;
    
    public PEe3_21OlympicRings(int x, int y, Color c){
        xLeft = x;
        yTop = y;
        color = c;
        
    }
    
    
    public void draw(Graphics2D g2){
        Ellipse2D.Double ring = new Ellipse2D.Double(xLeft, yTop, 40, 40);
        
        g2.setColor(color);
        
        g2.draw(ring);
    }
    
}
