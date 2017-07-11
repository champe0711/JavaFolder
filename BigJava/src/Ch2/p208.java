/**
 * Name: BrighterDemo
 * Programming Exercise: 8.
 * 
 * Repeat Exercise P2.7, but place your code into the following class. Then the color will be displayed.
 * 
 */

import java.awt.Color;
import javax.swing.JFrame;


public class p208 {

	public static void main(String[] args) {
            
            // Frame attributes
            JFrame frame = new JFrame();
            frame.setSize(200,200);
            
            //colour
            Color c = new Color(50, 100, 150); 
            c.brighter();
            
            frame.getContentPane().setBackground(c);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        }
}
