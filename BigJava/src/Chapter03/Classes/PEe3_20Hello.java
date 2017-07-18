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
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class PEe3_20Hello {
    
    private int xLeft;
    private int yTop;
    private int letterLength;
    
    public PEe3_20Hello(int x, int y){
        xLeft = x;
        yTop = y;
        letterLength = 0;
    }
    
    /**
     * Points List
     * 11 12 13
     * 21 22 23
     * 31 32 33

        Point2D.Double p11 = new Point2D.Double(xLeft      + letterLength, yTop); //top left
        Point2D.Double p12 = new Point2D.Double(xLeft + 15 + letterLength, yTop); //mid top
        Point2D.Double p13 = new Point2D.Double(xLeft + 30 + letterLength, yTop); //top right
        
        Point2D.Double p21 = new Point2D.Double(xLeft      + letterLength, yTop + 15); //mid left
        Point2D.Double p22 = new Point2D.Double(xLeft + 15 + letterLength, yTop + 15); //mid mid
        Point2D.Double p23 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 15); //mid right
        
        Point2D.Double p31 = new Point2D.Double(xLeft      + letterLength, yTop + 30); //bot left
        Point2D.Double p32 = new Point2D.Double(xLeft + 15 + letterLength, yTop + 30); //bot top
        Point2D.Double p33 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 30); //bot right
    
    */
    
    
    public void drawH(Graphics2D g2){
        
        Point2D.Double p11 = new Point2D.Double(xLeft      + letterLength, yTop); //top left
        Point2D.Double p13 = new Point2D.Double(xLeft + 30 + letterLength, yTop); //top right
        Point2D.Double p21 = new Point2D.Double(xLeft      + letterLength, yTop + 15); //mid left
        Point2D.Double p23 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 15); //mid right
        Point2D.Double p31 = new Point2D.Double(xLeft      + letterLength, yTop + 30); //bot left
        Point2D.Double p33 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 30); //bot right

        //Make H
        Line2D.Double h1 = new Line2D.Double(p11, p31);
        Line2D.Double h2 = new Line2D.Double(p21, p23);
        Line2D.Double h3 = new Line2D.Double(p13, p33);
        
        //draw H
        g2.draw(h1);
        g2.draw(h2);
        g2.draw(h3);
        
        letterLength += 33;
    }
    
    public void drawE(Graphics2D g2){
        Point2D.Double p11 = new Point2D.Double(xLeft      + letterLength, yTop); //top left
        Point2D.Double p13 = new Point2D.Double(xLeft + 30 + letterLength, yTop); //top right
        Point2D.Double p21 = new Point2D.Double(xLeft      + letterLength, yTop + 15); //mid left
        Point2D.Double p22 = new Point2D.Double(xLeft + 15 + letterLength, yTop + 15); //mid mid
        Point2D.Double p31 = new Point2D.Double(xLeft      + letterLength, yTop + 30); //bot left
        Point2D.Double p33 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 30); //bot right
        
        //make E
        Line2D.Double e1 = new Line2D.Double(p11, p31);
        Line2D.Double e2 = new Line2D.Double(p11, p13);
        Line2D.Double e3 = new Line2D.Double(p21, p22);
        Line2D.Double e4 = new Line2D.Double(p31, p33);
        
        //draw E
        g2.draw(e1);
        g2.draw(e2);
        g2.draw(e3);
        g2.draw(e4);
        
        letterLength += 33;
    }
    
    public void drawL(Graphics2D g2){
        Point2D.Double p11 = new Point2D.Double(xLeft      + letterLength, yTop); //top left
        Point2D.Double p12 = new Point2D.Double(xLeft + 15 + letterLength, yTop); //mid top
        Point2D.Double p13 = new Point2D.Double(xLeft + 30 + letterLength, yTop); //top right
        
        Point2D.Double p21 = new Point2D.Double(xLeft      + letterLength, yTop + 15); //mid left
        Point2D.Double p22 = new Point2D.Double(xLeft + 15 + letterLength, yTop + 15); //mid mid
        Point2D.Double p23 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 15); //mid right
        
        Point2D.Double p31 = new Point2D.Double(xLeft      + letterLength, yTop + 30); //bot left
        Point2D.Double p32 = new Point2D.Double(xLeft + 15 + letterLength, yTop + 30); //bot top
        Point2D.Double p33 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 30); //bot right
        
        Line2D.Double l1 = new Line2D.Double(p11, p31);
        Line2D.Double l2 = new Line2D.Double(p31, p33);
        
        g2.draw(l1);
        g2.draw(l2);
        
        letterLength += 33;
    }
    
    public void drawO(Graphics2D g2){
        Point2D.Double p11 = new Point2D.Double(xLeft      + letterLength, yTop); //top left
        Point2D.Double p13 = new Point2D.Double(xLeft + 30 + letterLength, yTop); //top right
        Point2D.Double p31 = new Point2D.Double(xLeft      + letterLength, yTop + 30); //bot left
        Point2D.Double p33 = new Point2D.Double(xLeft + 30 + letterLength, yTop + 30); //bot right
        
        Line2D.Double o1 = new Line2D.Double(p11, p13);
        Line2D.Double o2 = new Line2D.Double(p11, p31);
        Line2D.Double o3 = new Line2D.Double(p31, p33);
        Line2D.Double o4 = new Line2D.Double(p13, p33);
        
        g2.draw(o1);
        g2.draw(o2);
        g2.draw(o3);
        g2.draw(o4);
        
        letterLength += 33;
    }
    
}
