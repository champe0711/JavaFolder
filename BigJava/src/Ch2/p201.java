/**
 * Name: AreaTester
 * Programming Exercise: 1.
 * Description:
 * 	Write an AreaTester program that constructs a Rectangle object and then computes and prints its area. Use the getWidth and getHeight methods. Also print the expected answer
 */



import java.awt.Rectangle;

public class p201 {

	public static void main(String[] args) {
            //construct rectangle object
            Rectangle box = new Rectangle(10, 20);
            
            //getheight and getWidth method
            double height = box.getHeight();
            double width = box.getWidth();
            
            //compute for area (formula for Area = H * W)
            double area = width * height;
            
            //produce Actual and expected values
            System.out.println("***Expected Values***");
            System.out.println("Height = 20     ||      Width = 10");
            System.out.println("Area : 20 * 10 = 200");
            System.out.println("***Actual Values***");
            System.out.println("Height = " + height +"   ||      Width = "+ width);
            System.out.println("Area : " +height + " * " + width + " = " + area);
            
	}
}
