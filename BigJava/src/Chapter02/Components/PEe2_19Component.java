/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02.Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PEe2_19Component extends JComponent {
    
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle r1 = new Rectangle(0, 0, 60, 30);
        String s = "Christian";
        
        //color
        Color c1 = Color.pink;              //pink
        
        //draw
        g2.setColor(Color.blue);
        g2.fill(r1);
        g2.draw(r1);
        
        g2.setColor(Color.red);
        g2.drawString(s, 2, 20);
    }
    
}
