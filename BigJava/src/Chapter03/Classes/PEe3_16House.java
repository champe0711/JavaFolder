/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Dimension2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author chris
 */
public class PEe3_16House {
    private int xLength;
    private int yLength;
    
    public PEe3_16House(int x, int y){
        xLength = x;
        yLength = y;
    }
    
    public void draw(Graphics2D g2){
        
        //roof points
        Point2D.Double p1 = new Point2D.Double(xLength * 0.1 , 0); // top left point
        Point2D.Double p2 = new Point2D.Double(0 , yLength * 0.2);  //left bottom point
        Point2D.Double p3 = new Point2D.Double(xLength - (xLength * 0.1) , 0); 
        Point2D.Double p4 = new Point2D.Double(xLength, yLength * 0.2);
        
        //roof point connect
        Line2D.Double l1 = new Line2D.Double(p1, p2);
        Line2D.Double l2 = new Line2D.Double(p2,p4);
        Line2D.Double l3 = new Line2D.Double(p1,p3);
        Line2D.Double l4 = new Line2D.Double(p3,p4);
        
        
        //wall
        Rectangle.Double body = new Rectangle.Double(xLength * 0.1, yLength * 0.2, xLength * 0.8, yLength*0.9);
        
        //window
        
        Rectangle.Double window11 = new Rectangle.Double(xLength * 0.15, yLength * 0.3, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window12 = new Rectangle.Double(xLength * 0.35, yLength * 0.3, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window13 = new Rectangle.Double(xLength * 0.55, yLength * 0.3, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window14 = new Rectangle.Double(xLength * 0.75, yLength * 0.3, xLength * 0.1, yLength * 0.1);
        
        Rectangle.Double window21 = new Rectangle.Double(xLength * 0.15, yLength * 0.5, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window22 = new Rectangle.Double(xLength * 0.35, yLength * 0.5, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window23 = new Rectangle.Double(xLength * 0.55, yLength * 0.5, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window24 = new Rectangle.Double(xLength * 0.75, yLength * 0.5, xLength * 0.1, yLength * 0.1);
        
        Rectangle.Double window31 = new Rectangle.Double(xLength * 0.15, yLength * 0.7, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window32 = new Rectangle.Double(xLength * 0.35, yLength * 0.7, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window33 = new Rectangle.Double(xLength * 0.55, yLength * 0.7, xLength * 0.1, yLength * 0.1);
        Rectangle.Double window34 = new Rectangle.Double(xLength * 0.75, yLength * 0.7, xLength * 0.1, yLength * 0.1);
        
        //door
        Rectangle.Double door1 = new Rectangle.Double(xLength * 0.35, yLength * 0.85, xLength * 0.3, yLength *0.12);
        Rectangle.Double door2 = new Rectangle.Double(xLength * 0.5, yLength * 0.85, xLength * 0.15, yLength *0.12);
        //steps
        Rectangle.Double steps = new Rectangle.Double(xLength * 0.3, yLength * 0.97, xLength * 0.4, yLength * 0.1);
        
        
        //colour
        
        //draw
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
        g2.draw(body);
        g2.draw(window11);
        g2.draw(window12);
        g2.draw(window13);
        g2.draw(window14);
        g2.draw(window21);
        g2.draw(window22);
        g2.draw(window23);
        g2.draw(window24);
        g2.draw(window31);
        g2.draw(window32);
        g2.draw(window33);
        g2.draw(window34);
        g2.draw(door1);
        g2.draw(door2);
        g2.draw(steps);
    }
}
