/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes.Supplements;

import javax.swing.JFrame;

/**
 *
 * @author chris
 */
public class CarViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        f.setSize(300, 400);
        f.setTitle("Two Cars");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Sec308CarComponent component = new Sec308CarComponent();
        f.add(component);
        
        f.setVisible(true);
    }
    
}
