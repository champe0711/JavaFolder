/**
 * Name: Die Simulator
 * Programming Exercise: 9.
 * 
 * The Random class implements a random number generator, which produces sequences of numbers that appear to be random. To generate random integers, you construct an object of the Random class, and then apply the nextInt method. For example, the call generator .nextInt(6) gives you a random number between 0 and 5.
 * 
 * Write a program DieSimulator that uses the random class to simulate the cast of a die, printing a random number between 1 and 5 every time that the program is run.
 * 
 */

import java.util.Random;

public class p210 {

	public static void main(String[] args) {
            //initiate Random
            Random r = new Random();
            
            for (int i = 0; i < 10; i++)    {
                //check values
                System.out.println("Die = " + (r.nextInt(6)+1));
            }
            
        }
}
