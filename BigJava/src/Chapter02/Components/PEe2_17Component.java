/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02.Components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PEe2_17Component extends JComponent {
    
    int windowH;
    int windowW;
    
    public PEe2_17Component(int w, int h){
        windowW = w;
        windowH = h;
    }
    
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle r1 = new Rectangle(windowW/2, windowH/2, 20, 30);
        Rectangle r2 = new Rectangle(windowW/2, windowH/2, 40, 30);
        
        //draw components
        g2.draw(r1);
        g2.draw(r2);
        
    }
    
}
