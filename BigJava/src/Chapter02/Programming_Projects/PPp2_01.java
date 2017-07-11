/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02.Programming_Projects;

import Chapter02.Components.PPp2_01Component;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author chris
 */
public class PPp2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Four Rectangle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d = new Dimension(1024, 512);
        f.setSize(d);
        
        PPp2_01Component fourSqr = new PPp2_01Component();
        f.add(fourSqr);
        
        f.setVisible(true);
    }
    
}
