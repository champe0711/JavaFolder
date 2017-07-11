/**
 * Name: PerimeterTester
 * Programming Exercise: 2.
 * Description:
 * 	Write a PerimeterTester program that constructs a Rectangle object and then computes and prints its perimeter. Use the getWidth and getHeight methods. Also print the expected answer.
 */



import java.awt.Rectangle;
        
public class p202 {
    
	public static void main(String[] args) {
            //construct rectangle object
            Rectangle box = new Rectangle(5, 10);
            
            //getheight and getWidth method
            double height = box.getHeight();
            double width = box.getWidth();
            
            //compute for permiter = 2 (W + H)
            double perimeter = 2 * ( width + height);
            
            //produce Actual and expected values
            System.out.println("***Expected Values***");
            System.out.println("Height = 20     ||      Width = 10");
            System.out.println("Perimeter = 2 * (10 + 5) = 30");
            System.out.println("***Actual Values***");
            System.out.println("Height = " + height +"   ||      Width = "+ width);
            System.out.println("Perimeter = 2 * (" + height + " + " + width + " )= " + perimeter);
	}
}
