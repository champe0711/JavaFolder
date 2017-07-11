/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Misc;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

/**
 *  an appllet that draws two rectangles
 */
public class MyApplet extends JApplet{
    
    public void paint(Graphics g){
        //Prepare for extended graphics
        Graphics2D g2 = (Graphics2D) g;
        
        //Construct a rectangle and draw it
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);
        
        //move rectangle 15 units to the right and 25 units down
        box.translate(15, 25);
        
        //draw moved rectangle
        g2.draw(box);
        
    }
}
