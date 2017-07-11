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
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class House {

    private int xLeft;
    private int yTop;

    public House(int frameSizeX, int frameSizeY) {
        xLeft = frameSizeX;
        yTop = frameSizeY;
    }

    /**
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2) {
        
        //roof points
        Point2D.Double r1 = new Point2D.Double(xLeft, yTop);
        Point2D.Double r2 = new Point2D.Double(xLeft + 50, yTop - 50);
        Point2D.Double r3 = new Point2D.Double(xLeft +100, yTop);
        Point2D.Double r4 = new Point2D.Double(xLeft +550, yTop - 50);
        Point2D.Double r5 = new Point2D.Double(xLeft +500, yTop);
        Point2D.Double r6 = new Point2D.Double(xLeft +600, yTop);
        
        //connect roof1
        Line2D.Double leftRoof1 = new Line2D.Double(r1, r2);
        Line2D.Double leftRoof2 = new Line2D.Double(r2, r3);
        //connect centre roof
        Line2D.Double midroof = new Line2D.Double(r2, r4);
        //connect roof2
        Line2D.Double rightRoof1 = new Line2D.Double(r4, r5);
        Line2D.Double rightRoof2 = new Line2D.Double(r4, r6);
        
        //left Side of the house
        Rectangle leftBlock = new Rectangle(xLeft, yTop, 100, 200);
        Rectangle centreBlock = new Rectangle(xLeft + 100, yTop, 400, 200);
        Rectangle rightBlock = new Rectangle(xLeft + 500, yTop, 100, 200);
        
        //leftside Details
        Rectangle Lwindow1 = new Rectangle(xLeft + 10 , yTop + 20, 80, 65);
        Rectangle Ldetail1 = new Rectangle(xLeft + 10 , yTop + 110, 20, 70);
        Rectangle LDetail2 = new Rectangle(xLeft + 30 , yTop + 110, 20, 70);
        Rectangle LDetail3 = new Rectangle(xLeft + 50 , yTop + 110, 20, 70);
        Rectangle LDetail4 = new Rectangle(xLeft + 70 , yTop + 110, 20, 70);
        
        //Middle Details
        Rectangle Mwindow1 = new Rectangle(xLeft + 125 , yTop + 20, 100, 65);
        Rectangle Mwindow2 = new Rectangle(xLeft + 245 , yTop + 20, 100, 65);
        Rectangle Mwindow3 = new Rectangle(xLeft + 365 , yTop + 20, 100, 65);
        Rectangle Mwindow4 = new Rectangle(xLeft + 125 , yTop + 110, 100, 70);
        Rectangle Mwindow6 = new Rectangle(xLeft + 365 , yTop + 110, 100, 70);
        
        //door
        Rectangle door1 = new Rectangle(xLeft + 245 , yTop + 110, 100, 70);
        Rectangle door2 = new Rectangle(xLeft + 292 , yTop + 110, 6, 70);
        Ellipse2D.Double handle  = new Ellipse2D.Double(xLeft + 285, yTop + 145, 20, 10);
        //stair
        Rectangle step1 = new Rectangle(xLeft + 240 , yTop + 180, 110, 10);
        Rectangle step2 = new Rectangle(xLeft + 235 , yTop + 190, 120, 10);
        Rectangle step3 = new Rectangle(xLeft + 230 , yTop + 200, 130, 10);
        
        //rightside Details
        Rectangle Rwindow1 = new Rectangle(xLeft + 510 , yTop + 20, 80, 65);
        Rectangle RDetail1 = new Rectangle(xLeft + 510 , yTop + 110, 20, 70);
        Rectangle RDetail2 = new Rectangle(xLeft + 530 , yTop + 110, 20, 70);
        Rectangle RDetail3 = new Rectangle(xLeft + 550 , yTop + 110, 20, 70);
        Rectangle RDetail4 = new Rectangle(xLeft + 570 , yTop + 110, 20, 70);
        
        //garage roof points
        Point2D.Double gpoint1 = new Point2D.Double(xLeft + 650, yTop + 100);
        Point2D.Double gpoint2 = new Point2D.Double(xLeft + 800, yTop + 100);
        Point2D.Double gpoint3 = new Point2D.Double(xLeft + 630, yTop + 130);
        Point2D.Double gpoint4 = new Point2D.Double(xLeft + 820, yTop + 130);
        
        //garage roof connect
        Line2D.Double gRoof1 = new Line2D.Double(gpoint1, gpoint2);
        Line2D.Double gRoof2 = new Line2D.Double(gpoint1, gpoint3);
        Line2D.Double gRoof3 = new Line2D.Double(gpoint2, gpoint4);
        
        //garage body
        Rectangle gBlock = new Rectangle(xLeft + 630 , yTop + 130, 190, 70);
        
        //gDetail
        Rectangle gDetail1 = new Rectangle(xLeft + 685 , yTop + 140, 130, 10);
        Rectangle gDetail2 = new Rectangle(xLeft + 685 , yTop + 150, 130, 10);
        Rectangle gDetail3 = new Rectangle(xLeft + 685 , yTop + 160, 130, 10);
        Rectangle gDetail4 = new Rectangle(xLeft + 685 , yTop + 170, 130, 10);
        Rectangle gDetail5 = new Rectangle(xLeft + 685 , yTop + 180, 130, 10);
        Rectangle gDetail6 = new Rectangle(xLeft + 685 , yTop + 190, 130, 10);
        
        //door
        Rectangle gDoor = new Rectangle(xLeft + 640 , yTop + 140, 35, 60);
        
        
        //draw them!!
        g2.draw(leftBlock);
        g2.draw(centreBlock);
        g2.draw(rightBlock);
        g2.draw(midroof);
        g2.draw(leftRoof1);
        g2.draw(leftRoof2);
        g2.draw(rightRoof1);
        g2.draw(rightRoof2);
        g2.draw(Lwindow1);
        g2.draw(Ldetail1);
        g2.draw(LDetail2);
        g2.draw(LDetail3);
        g2.draw(LDetail4);
        g2.draw(Mwindow1);
        g2.draw(Mwindow2);
        g2.draw(Mwindow3);
        g2.draw(Mwindow4);
        g2.draw(Mwindow6);
        g2.draw(Rwindow1);
        g2.draw(RDetail1);
        g2.draw(RDetail2);
        g2.draw(RDetail3);
        g2.draw(RDetail4);
        g2.draw(door1);
        g2.draw(step1);
        g2.draw(step2);
        g2.draw(step3);
        g2.draw(handle);
        g2.draw(door2);
        g2.draw(gRoof1);
        g2.draw(gRoof2);
        g2.draw(gRoof3);
        g2.draw(gBlock);
        g2.draw(gDoor);
        g2.draw(gDetail1);
        g2.draw(gDetail2);
        g2.draw(gDetail3);
        g2.draw(gDetail4);
        g2.draw(gDetail5);
        g2.draw(gDetail6);
    }

}
