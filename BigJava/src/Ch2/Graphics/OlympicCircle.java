/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class OlympicCircle {

    private int xLeft;
    private int yTop;
    private Color c;

    /**
     * Constructs a car with a given top left corner.
     *
     * @parm x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */

    public OlympicCircle(int x, int y, Color col) {
        xLeft = x;
        yTop = y;
        c = col;
    }
    /**
     * Draw the car.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {

        //create a 50x50 points
        Ellipse2D.Double LetterO = new Ellipse2D.Double(xLeft, yTop, 50, 50);
        g2.setColor(c);
        
        
        g2.setStroke(new BasicStroke(5));
        g2.draw(LetterO);
        
    }

}
