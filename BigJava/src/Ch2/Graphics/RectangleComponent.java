package Graphics;







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *  A component that draws two rectangles
 */
public class RectangleComponent extends JComponent{
        
    @Override   //construct a rectangle
    public void paintComponent(Graphics g){
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        // Draw rectangle   (x,y,wdith,height)
        Rectangle rect = new Rectangle(5, 10, 100, 50);
        g2.draw(rect);
        
        //move rectangle 15 units to the right and 25 units down
//        rect.translate(15, 25);
//        
//        //draw moved rectangle
//        g2.draw(rect);
        System.out.println("Width = " + rect.getWidth() + "; Height = " + rect.getHeight());
        System.out.println("1. Actual Area =        " + (rect.getWidth() * rect.getHeight()) );
        System.out.println("2. Actual Perimeter =   " + (2 * (rect.getWidth() + rect.getHeight()) ) );
    }
    
            
    
}
