/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

/**
 *
 * @author chris
 */
public class PEe4_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double MM = 25.4; //millimeter per inch
        
        //display a dimensions of a letter-size (8.5 x 11 inches)
        
        System.out.printf("Dimension of a letter-size Sheet %.4f\n" ,8.5  * (11 * MM));
        
    }
    
}
