package Graphics;
/** 
 * Draw a "Bull's eye" -- a set of concentric rings in alternating black and white colours. Hint: Fill a black circle, then fill a smaller white circle on top, and so on.
 * 
 * Your program should be composedd of classes BullsEye, BullsEyeComponent, and bullsEyeViewer
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BullsEyeComponent extends JComponent{
        
    @Override   //construct a rectangle
    public void paintComponent(Graphics g){
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int y = getHeight();
        
        
        //draw bulls eye
        BullsEye b = new BullsEye(x, y);
        b.draw(g2);
        
        
        
    }
    
            
    
}
