/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Components.PEe3_20HelloComponent;
import javax.swing.JFrame;

/**
 *
 * @author chris
 */
public class PEe3_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Circle");
        
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PEe3_20HelloComponent hello = new PEe3_20HelloComponent();
        
        f.add(hello);
        
        f.setVisible(true);
    }
    
}
