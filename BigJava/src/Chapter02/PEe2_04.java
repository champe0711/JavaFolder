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
public class PEe2_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //y, x, w, h
        Rectangle r = new Rectangle(5, 10, 20, 30);
        
        System.out.println("              Rectangle");
        System.out.println("        --------------------");
        System.out.println("         Expected || Actual");
        System.out.printf("Height |     40.0 || %-3.1f \n", r.getHeight());
        System.out.printf("Width  |     25.0 || %-3.1f \n", r.getWidth());
        r.add(0, 0);
        System.out.println("");
        System.out.println("           After r.add(0,0)");
        System.out.println("              Rectangle");
        System.out.println("        --------------------");
        System.out.println("         Expected || Actual");
        System.out.printf("Height |     40.0 || %-3.1f \n", r.getHeight());
        System.out.printf("Width  |     25.0 || %-3.1f \n", r.getWidth());
//        System.out.println("Height " + r.getHeight() + " || " + r.getWidth() + " ");
    }

}
