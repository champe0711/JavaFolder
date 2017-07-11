/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Components;

import Chapter03.Classes.PEe3_14Circle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PEe3_15TargetComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        PEe3_14Circle c = new PEe3_14Circle(getHeight(),getWidth());
        
        c.draw(g2);
    }
}
