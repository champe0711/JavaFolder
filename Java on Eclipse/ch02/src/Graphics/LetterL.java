/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LetterL {

    private int xLeft;
    private int yTop;
    private Color c;
    private double tx;

    /**
     * Constructs a car with a given top left corner.
     *
     * @parm x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    

    public LetterL(int x, int y, Color col) {
        xLeft = x;
        yTop = y;
        c = col;
//        tx = size;
    }
    /**
     * Draw the car.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {

        //create a 50x50 points
        
        //top left point
        Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
        //bottom left point
        Point2D.Double p2 = new Point2D.Double(xLeft, yTop + 50);
        //middle left point
        Point2D.Double p3 = new Point2D.Double(xLeft, yTop + 25);
        //middle right point
        Point2D.Double p4 = new Point2D.Double(xLeft + 50, yTop + 25);
        //top right
        Point2D.Double p5 = new Point2D.Double(xLeft + 50, yTop);
        //bottom right
        Point2D.Double p6 = new Point2D.Double(xLeft + 50, yTop + 50);

        //connect points
        Line2D.Double LeftBar = new Line2D.Double(p1, p2);
        Line2D.Double BottomBar = new Line2D.Double(p2, p6);
        
//        g2.scale(tx, tx);
        g2.setColor(c);
        g2.draw(LeftBar);
        g2.draw(BottomBar);
        
        //reset
//        g2.scale(1.0, 1.0);
    }

}
