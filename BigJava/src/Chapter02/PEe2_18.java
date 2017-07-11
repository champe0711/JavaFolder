/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import Chapter02.Components.PEe2_18Component;
import javax.swing.JFrame;

/**
 *
 * @author chris
 */
public class PEe2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final int H = 512;
        final int W = 1024;
        f.setSize(W,H);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        PEe2_18Component sqr = new PEe2_18Component();
        f.add(sqr);
        
    }
    
}
