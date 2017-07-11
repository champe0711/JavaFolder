
import Graphics.BullsEyeComponent;
import javax.swing.JFrame;

/**
 * Name: productPrinter
 * Programming Exercise: 24.
 * 
 * Draw a "Bull's eye" -- a set of concentric rings in alternating black and white colours. Hint: Fill a black circle, then fill a smaller white circle on top, and so on.
 * 
 * Your program should be composedd of classes BullsEye, BullsEyeComponent, and bullsEyeViewer
 */

public class p224 {
	public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setSize(1000, 500);
            f.setTitle("Face Viewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            BullsEyeComponent bComponent = new BullsEyeComponent();
            f.add(bComponent);
            
            f.setVisible(true);
            
        }
}
