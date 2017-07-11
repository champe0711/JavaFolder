/**
 * Name: Intersections
 * Programming Exercise: 4.
 * The intersection method computes the intersection of two rectangles - that is, the rectangle that would be formed by two overlapping rectangles if they were drawn:
 * 
 * You call this method as follows: Rectangle r3 = r1.intersection(r2);
 * write a program IntersectionPrinter that constructs two rectangle objects, prints them as described in Exercise p2.3, and then prints the rectangle object that describes the intersection. Then the program should print the result of the intersection method when the rectangles do not overlap. Add a comment to your program that explains how you can tell whether the resulting rectangle is empty.
 */


import java.awt.Rectangle;

public class p205 {

	public static void main(String[] args) {
            
            //construct rectangle object with point (100,100) and side length 50
            Rectangle r1 = new Rectangle(0,0,50,100);
            //intersecting Rect
            Rectangle r2 = new Rectangle(20,80,100,50);
            //non-intersecting Rect
//            Rectangle r2 = new Rectangle(50,100,100,50);
            
            //print out values of rect1 and rect2
            System.out.println("r1 = " + r1 + "\nr2 = " + r2);
            //create a new intersecting Rect
            Rectangle r3 = r1.intersection(r2);
            
            //print out vlaues of the intersecting rect
            System.out.println("r3 = " +r3);
            
            //if the resulting rectangle have a width and height = 0; there is no intersection
	}
}
