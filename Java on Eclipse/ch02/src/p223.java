
import Graphics.FaceComponent;
import javax.swing.JFrame;

/**
 * Name: productPrinter
 * Programming Exercise: 22.
 * 
 * write a program that plot the following face. Provide a class FaceViewer and a class FaceComponent
 */

public class p223 {
	public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setSize(500, 500);
            f.setTitle("Face Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            FaceComponent face = new FaceComponent();
            f.add(face);
            
            f.setVisible(true);
            
        }
}
