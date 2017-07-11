/**
 * Name: GrowSquarePrinter
 * Programming Exercise: 4.
 * Write a GrowSquarePrinter program that constructs a Rectangle object square representing a square with top-left corner (100, 100) and side length 50, prints its location by calling system.out.println)square), applies the translate and grow methods and calls System.out.println(square) again. Then calls to translate and grow should modify the square so that it has twice the size and the same top-left corners as the original. If the squares were drawn, they would look like this:
 * 
 * Your program will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods.
 * Look up the description of the grow method in the API documentation.
 */


import java.awt.Rectangle;

public class p204 {

	public static void main(String[] args) {
            
            //construct rectangle object with point (100,100) and side length 50
            Rectangle square = new Rectangle();
            square.setLocation(100,100);
            square.setSize(50,50);
            
            //prints its location
            System.out.println(square);
            
            //translate and grow method
            square.translate(25, 25);
            square.grow(25, 25);
            
            //print new location with same xy but different height width
            System.out.println(square);
            
	}
}
