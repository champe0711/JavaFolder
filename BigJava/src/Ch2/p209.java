/**
 * Name: DarkerDemo
 * Programming Exercise: 9.
 * 
 * Repeat Exercise P2.7, but apply the darker method twice to the object Color.RED. Call your class DarkerDemo
 * 
 */

import java.awt.Color;
import javax.swing.JFrame;


public class p209 {

	public static void main(String[] args) {
            
            // Frame attributes
            JFrame frame = new JFrame();
            frame.setSize(200,200);
            
            //colour
            Color c = new Color(50, 100, 150); 
            c.RED.darker();
            c.RED.darker();
            
            System.out.println(c);
            
            frame.getContentPane().setBackground(c);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        }
}
