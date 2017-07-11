/**
 * Name: StaircasePrinter
 * Programming Exercise: 6.
 * Description:
 * 	Write a program StaircasePrinter that prints a staircase	
 */

package ch01;

public class p1o6 {

	public static void main(String[] args) {
		System.out.printf("%16s+---+\n","");
		System.out.printf("%16s|   |\n","");
		System.out.printf("%12s+---+---+\n","");
		System.out.printf("%12s|   |   |\n","");
		System.out.printf("%8s+---+---+---+\n","");
		System.out.printf("%8s|   |   |   |\n","");
		System.out.printf("%4s+---+---+---+---+\n","");
		System.out.printf("%4s|   |   |   |   |\n","");
		System.out.println("+---+---+---+---+---+");
		System.out.println("|   |   |   |   |   |");
		System.out.println("+---+---+---+---+---+");
	}
}
