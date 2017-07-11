

import Graphics.HouseComponent2;
import javax.swing.JFrame;

/**
 * Name: productPrinter
 * Programming Exercise: 24.
 * 
 * Write a program that draws a picture of a house. It could be as simple as the accompanying figure, or if you like, make it more elaborate(3-D, skyscraper, marble columns in the entryway, whatever
 */

public class p226 {
	public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setSize(2000, 1000);
            f.setTitle("Face Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            HouseComponent2 hComponent = new HouseComponent2();
            f.add(hComponent);
            
            f.setVisible(true);
            
        }
}
