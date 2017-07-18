/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author chris
 */
public class PEe3_18CarModel {
    
    private int xLeft;
    private int yTop;
    private Color c = Color.BLACK;
    
    
    /**
     * Constructs a car with a given top left corner
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    
    public PEe3_18CarModel(int x, int y){
        xLeft = x;
        yTop = y;
    }
    
    public PEe3_18CarModel(int x, int y, Color fill){
        c = fill;
        xLeft = x;
        yTop = y;
    }
    
    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2){
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
        //the bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
        //the front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
        //the rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
        //the bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);
        
        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
        
        //color
        g2.setColor(c);
        
        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
}
