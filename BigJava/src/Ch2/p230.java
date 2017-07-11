

import Graphics.HELLOComponent;
import Graphics.OlympicComponent;
import javax.swing.JFrame;

/**
 * Name: productPrinter
 * Programming Exercise: 24.
 * 
 * Write a program that draws a picture of a house. It could be as simple as the accompanying figure, or if you like, make it more elaborate(3-D, skyscraper, marble columns in the entryway, whatever
 */

public class p230 {
	public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setSize(1000, 500);
            f.setTitle("Face Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            OlympicComponent olympic = new OlympicComponent();
            f.add(olympic);
            
            
            f.setVisible(true);
            
        }
}
