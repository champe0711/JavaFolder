package Graphics;

/*
 * Write a graphics program that draw your name in red, contained inside a blue rectangle. Provide a class NameViewer and a classNameComponent
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *  A component that draws two rectangles
 */
public class NameComponent extends JComponent{
        
    @Override   //construct a rectangle
    public void paintComponent(Graphics g){
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.RED);
        //draw name in red
        g2.drawString("Champe", 125, 150);
        
        g2.setColor(Color.BLUE);
        Rectangle r = new Rectangle(50, 50, 200, 200);
        g2.draw(r);
    }
    
            
    
}
