/**
 * Name: BrighterDemo
 * Programming Exercise: 7.
 * 
 * In the Java library, a colour is specified by its red, green, and blue components between 0 and 255 (see Table 2 on page 78). Write a program BrighterDemo that constructs a Color object with red, green, and blue values of 50, 100, and 150. Then apply the brighter method and print the red, green, and blue values of the resulting color. (you won't actually see the the color - see the next exercise on how to display the color.) 
 * 
 */

import java.awt.Color;

public class p207 {

	public static void main(String[] args) {
            
            //colour
            Color c = new Color(50, 100, 150);
            c.brighter();
            
            System.out.println(c);
	}
}
