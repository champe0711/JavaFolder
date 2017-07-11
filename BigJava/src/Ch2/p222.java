
import Graphics.NameComponent;
import javax.swing.JFrame;

/**
 * Name: productPrinter
 * Programming Exercise: 22.
 * 
 * Write a graphics program that draw your name in red, contained inside a blue rectangle. Provide a class NameViewer and a classNameComponent
 */

public class p222 {

	public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setSize(500, 500);
            f.setTitle("Name Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            NameComponent name = new NameComponent();
            f.add(name);
            
            f.setVisible(true);
            
        }
}
