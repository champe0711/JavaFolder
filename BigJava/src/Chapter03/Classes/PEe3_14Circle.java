/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author chris
 */
public class PEe3_14Circle {
    private int xLeft;
    private int yTop;
    
    public PEe3_14Circle(int x, int y){
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2){
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, yTop, xLeft);
        g2.setColor(Color.red);
        g2.fill(circle);
            
        g2.draw(circle);
    }
}
