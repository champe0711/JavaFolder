package Chapter03.Components;


import Chapter03.Classes.PEe3_20Hello;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PEe3_20HelloComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_20Hello hello = new PEe3_20Hello(10, 10);
        
        hello.drawH(g2);
        hello.drawE(g2);
        hello.drawL(g2);
        hello.drawL(g2);
        hello.drawO(g2);
    }
}
