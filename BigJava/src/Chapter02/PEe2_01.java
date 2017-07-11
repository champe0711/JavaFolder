package Chapter02;

import java.awt.Rectangle;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PEe2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(7,3);
        
        System.out.println(" Rectangle Width and Height");
        System.out.println("-----------------------------");
        System.out.println("          Expected || Actual");
        System.out.println("Height |      3.0  || " + r.getHeight());
        System.out.println("Width  |      7.0  || " + r.getWidth());
    }
    
}
