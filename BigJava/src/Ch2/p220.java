
import Misc.Bug;

/**
 * Name: productPrinter
 * Programming Exercise: 19.
 * 
 * Write a class Bug that models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction. Provide a constructor and methods.
 * 
 * your bugTester should construct a bug, make it move and turn a few times, and print the actual and expected position.
 */

public class p220 {

	public static void main(String[] args) {
            Bug b = new Bug(10);
            System.out.println("Position = " + b.getPosition());
            b.move();
            System.out.println("Position = " + b.getPosition());
            b.turn();
            b.move();
            b.move();
            b.move();
            b.move();
            System.out.println("Position = " + b.getPosition());
        }
}
