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
public class PEe2_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle(20, 15);
        
        System.out.println("Rectangle Perimeter");
        System.out.println("--------------------");
        System.out.println("            Expected || Actual");
        System.out.printf("Perimeter |     %3d  || %3.0f\n", (20*2)+(15*2), r.getHeight() *2 + r.getWidth()*2);
    }
    
}
