/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.awt.Rectangle;

/**
 *
 * @author chris
 */
public class PEe2_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 15); //perimeter
        Rectangle r2 = new Rectangle(6,7);  // area
        System.out.println("Rectangles with 42");
        System.out.println("Perimeter and Area");
        System.out.println("-----------------------");
        System.out.println("              Rect1 || Rect2");
        System.out.printf("Width:    | %7.1f || %-5.1f \n", r1.getWidth(), r2.getWidth() );
        System.out.printf("Height:   | %7.1f || %-5.1f \n", r1.getHeight(), r2.getHeight() );
        System.out.printf("%19.1f || %-12.1f \n", r1.getHeight() * 2 + r1.getWidth() *2 , r2.getHeight() * r2.getWidth());
        System.out.println("    Rect1 Perimeter || Rect2 Area");
    }
    
}
