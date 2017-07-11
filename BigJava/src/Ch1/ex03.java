/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch1;

/**
 *
 * @author Christian Paul
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =1;
        for(int a = 1; a<=10; a++){
            System.out.printf("(%2d) %2d * %6d = " , a, a , i);
            i*=a;
            System.out.printf("%6d%n", i);
        }
    }
    
}
