package Graphics;

/**
 * Draw a "Bull's eye" -- a set of concentric rings in alternating black and
 * white colours. Hint: Fill a black circle, then fill a smaller white circle on
 * top, and so on.
 *
 * Your program should be composedd of classes BullsEye, BullsEyeComponent, and
 * bullsEyeViewer
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class BullsEye {

    private int xLeft;
    private int yTop;

    public BullsEye(int frameSizeX, int frameSizeY) {
        xLeft = frameSizeX;
        yTop = frameSizeY;
    }

    /**
     * draw the bulls ey
     *
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2) {
        double m1 = (xLeft/2)-25;   //middle point x = 450
        double m2 = (yTop/2)-25;    //middle point y = 350
        
        
        
        //prepared shapes
        Ellipse2D.Double circle7 = new Ellipse2D.Double(m1-150, m2-150, 350, 350);
        g2.setColor(Color.BLACK);
        g2.fill(circle7);       //this will draw the shape thus no need to call for g2.draw(circle7);
        Ellipse2D.Double circle6 = new Ellipse2D.Double(m1-125, m2-125, 300, 300);
        g2.setColor(Color.WHITE);
        g2.fill(circle6);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(m1-100, m2-100, 250, 250);
        g2.setColor(Color.BLACK);
        g2.fill(circle5);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(m1-75, m2-75, 200, 200);
        g2.setColor(Color.WHITE);
        g2.fill(circle4);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(m1-50, m2-50, 150, 150);
        g2.setColor(Color.BLACK);
        g2.fill(circle3);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(m1-25, m2-25, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(circle2);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(m1, m2, 50, 50);
        g2.setColor(Color.BLACK);
        g2.fill(circle1);
    }

}
