/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch1;

/**
 *
 * @author Christian Paul
 */

import javax.swing.JOptionPane;
public class ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("My name is Hal! What is your name?");
        
        JOptionPane.showMessageDialog(null, "Hello "+name+ " How are you?");
    }
    
}
