package Graphics;

/*
 * Write a graphics program that draw your name in red, contained inside a blue rectangle. Provide a class NameViewer and a classNameComponent
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *  A component that draws two rectangles
 */
public class FaceComponent extends JComponent{
        
    @Override   //construct a rectangle
    public void paintComponent(Graphics g){
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        //draw head
        Ellipse2D c = new Ellipse2D.Double(50, 50, 100, 100);
        g2.setColor(Color.BLACK);
        g2.draw(c);
        
        //left eye
        Ellipse2D e1 = new Ellipse2D.Double(70, 70, 20, 20);
        g2.draw(e1);
        
        //right eye
        Ellipse2D e2 = new Ellipse2D.Double(110, 70, 20, 20);
        g2.draw(e2);
        
        //lips
        Line2D.Double m = new Line2D.Double(70, 120, 130, 120);
        g2.draw(m);
        
        
    }
    
            
    
}
