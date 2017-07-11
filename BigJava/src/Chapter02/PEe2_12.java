/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.Random;

/**
 *
 * @author chris
 */
public class PEe2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Random Price from $10.00 to $19.95 generator");
        
        System.out.printf("Random Price: $%2.2f\n", 10 + r.nextInt(10) + r.nextDouble() - 0.05 );
    }
    
}
