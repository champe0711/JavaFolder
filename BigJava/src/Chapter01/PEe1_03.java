/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author chris
 */
public class PEe1_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prod = 1;
        for (int a = 1; a <= 10; a++) {
            System.out.printf("%2d * %6d",a ,prod);
            prod *=a;
            System.out.printf(" = %8d \n",prod);

        }

    }

}
