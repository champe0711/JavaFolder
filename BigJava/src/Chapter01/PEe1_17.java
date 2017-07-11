/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class PEe1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Ahoy matey!", "Greetings", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
    
}
