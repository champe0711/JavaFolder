/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class PEe1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog(null, "My name is Hal! What would you like me to do?");
        JOptionPane.showMessageDialog(null, "I'm sorry," + msg + " I can't do that");
    }
    
}
