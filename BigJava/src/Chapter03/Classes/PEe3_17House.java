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
public class PEe3_17House {
    private int xPos;
    private int yPos;
    private int xLen;
    private int yHei;
    
    public PEe3_17House(){
        
    }
    
    public PEe3_17House(int x, int y, int width, int height){
        xPos = x;
        yPos = y;
        xLen = width;
        yHei = height;
    }
    
    public void draw(Graphics2D g2){
        
        //roof points
        Point2D.Double p1 = new Point2D.Double(xPos + (xLen * 0.1 ),yPos + 0); // top left point
        Point2D.Double p2 = new Point2D.Double(xPos + 0 , yPos + (yHei * 0.2) );  //left bottom point
        Point2D.Double p3 = new Point2D.Double(xPos + (xLen - (xLen * 0.1) ), yPos + 0);  //bot right
        Point2D.Double p4 = new Point2D.Double(xPos + (xLen), yPos + ( yHei * 0.2) ); // bot left
        
        //roof point connect
        Line2D.Double l1 = new Line2D.Double(p1, p2);
        Line2D.Double l2 = new Line2D.Double(p2, p4);
        Line2D.Double l3 = new Line2D.Double(p1, p3);
        Line2D.Double l4 = new Line2D.Double(p3, p4);
        
        
        //wall
        Rectangle.Double body = new Rectangle.Double(xPos + (xLen * 0.1) , yPos + (yHei * 0.2) , xLen * 0.8 , yHei * 0.9 );
        
        //window
        Rectangle.Double window11 = new Rectangle.Double(xPos + (xLen * 0.15), yPos + (yHei * 0.3), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window12 = new Rectangle.Double(xPos + (xLen * 0.35), yPos + (yHei * 0.3), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window13 = new Rectangle.Double(xPos + (xLen * 0.55), yPos + (yHei * 0.3), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window14 = new Rectangle.Double(xPos + (xLen * 0.75), yPos + (yHei * 0.3), xLen * 0.1, yHei * 0.1);
        
        Rectangle.Double window21 = new Rectangle.Double(xPos + (xLen * 0.15), yPos + (yHei * 0.5), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window22 = new Rectangle.Double(xPos + (xLen * 0.35), yPos + (yHei * 0.5), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window23 = new Rectangle.Double(xPos + (xLen * 0.55), yPos + (yHei * 0.5), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window24 = new Rectangle.Double(xPos + (xLen * 0.75), yPos + (yHei * 0.5), xLen * 0.1, yHei * 0.1);
        
        Rectangle.Double window31 = new Rectangle.Double(xPos + (xLen * 0.15), yPos + (yHei * 0.7), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window32 = new Rectangle.Double(xPos + (xLen * 0.35), yPos + (yHei * 0.7), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window33 = new Rectangle.Double(xPos + (xLen * 0.55), yPos + (yHei * 0.7), xLen * 0.1, yHei * 0.1);
        Rectangle.Double window34 = new Rectangle.Double(xPos + (xLen * 0.75), yPos + (yHei * 0.7), xLen * 0.1, yHei * 0.1);
        
        //door
        Rectangle.Double door1 = new Rectangle.Double(xPos + (xLen * 0.35), yPos + (yHei * 0.85), xLen * 0.3 , yHei *0.12);
        Rectangle.Double door2 = new Rectangle.Double(xPos + (xLen * 0.5 ), yPos + (yHei * 0.85), xLen * 0.15, yHei *0.12);
        //steps
        Rectangle.Double steps = new Rectangle.Double(xPos +(xLen * 0.3), yPos + (yHei * 0.97), xLen * 0.4, yHei * 0.1);
        
        
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
