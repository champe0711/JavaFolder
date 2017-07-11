/**
 * Name: AreaTester
 * Programming Exercise: 6.
 * 
 * In this exercise, you will explore simple way of visualizing a rectangle object. The setBounds Method of the JFrame class moves a frame window to a given rectangle. Complete the following program to visually wshow the translate method of the Rectangle Class.
 */


import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class p206 {

	public static void main(String[] args) {
            
            // construct a frame and show it
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            //construct a rectangle and set the frame bounds
            Rectangle r = new Rectangle(1000, 500);
            frame.setBounds(r);
            
            JOptionPane.showMessageDialog(frame, "Click OK to continue");
            
            // Move the rectangle and set the frame bounds again
            r.translate(400, 300);
            frame.setBounds(r);
	}
}
