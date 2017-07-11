/**
 * Name: FourRectanglePrinter
 * Programming Exercise:3.
 * Description: Write a program called FourRectanglePrinter that constructs a Rectangle object, prints its location by calling System.out.println(box), and then translates and prints it three more times, so that, if the rectangle were drawn, they would form one large rectangle.
 * 
 * program will not produce a drawing. it will simply print the locations of the four rectangles
 */



import java.awt.Rectangle;

public class p203 {

	public static void main(String[] args) {
            
            //construct rectangle object (width, height)
            Rectangle box = new Rectangle(10, 10);
            //print X and Y
            System.out.println("Box 1: X = " + box.getX() + "   ||  Y = " + box.getY() );
            System.out.println("Box1 = " + box + "\n");
            
            box.translate(10,0);
            //print X and Y
            System.out.println("Box 2: X = " + box.getX() + "   ||  Y = " + box.getY() );
            System.out.println("Box2 = " + box + "\n");
            
            box.translate(0, 10);
            //print X and Y
            System.out.println("Box 3: X = " + box.getX() + "   ||  Y = " + box.getY() );
            System.out.println("Box3 = " + box + "\n");
            
            box.translate(-10, 0);
            //print X and Y
            System.out.println("Box 4: X = " + box.getX() + "   ||  Y = " + box.getY() );
            System.out.println("Box4 = " + box + "\n");
            
	}
}
