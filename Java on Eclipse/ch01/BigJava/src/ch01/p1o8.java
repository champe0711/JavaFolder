/**
 * Name: p1.8
 * Programming Exercise: 8.
 * Description:
 * 	Write a program that computes the sum of the first ten positive integers, 1+2+ . . . +10
 */

package ch01;

public class p1o8 {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 1; i <10; i++){
			System.out.print(i+" + ");
			j+=i;
		}
		j+=10;
		System.out.println("10 = " + j);
	}
}
