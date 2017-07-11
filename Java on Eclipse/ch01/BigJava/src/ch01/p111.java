/**
 * Name: test
 * Programming Exercise: 9.
 * Description:
 * 	Run the following program
 */

package ch01;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class p111 {

	public static void main(String[] args) throws Exception {
		
		URL imageLocation = new URL("http://horstmann.com/bigj6/bigjava.jpg");
		//URL imageLocation2 = new URL("http://biobio.loc.edu/chu/web/Courses/COSI223/book.jpg");
		URL imageLocation3 = new URL("http://www.horstmann.com/bigj4/bigjava.jpg");
		//JOptionPane.showMessageDialog(null, "Big Java", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));		
		//JOptionPane.showMessageDialog(null, "Hi", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation2));
		JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation3));
		System.exit(0);
	}
}
