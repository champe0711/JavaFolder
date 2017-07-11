
import Misc.Moth;

/**
 * Name: productPrinter
 * Programming Exercise: 21.
 * Implement a class Moth that models a moth flying across a straight line. the moth has a position, the distance from a fixed origin. When the moth moves towards a point of light, its new position is halfway between its old position and the position of the light source. Supply a constructor and methods.
 * 
 * Your MothTester should construct a moth, move it toward a couple of light sources, and check that the moth's position is as expected
 */

public class p221 {

	public static void main(String[] args) {
            Moth m = new Moth(0.0);
            m.moveToLight(20.0);
            System.out.println("Positon = " +m.getPosition());
            m.moveToLight(-20.0);
            System.out.println("Positon = " +m.getPosition());
        }
}
