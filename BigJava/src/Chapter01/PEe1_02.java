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
public class PEe1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for(int a = 1; a<=10; a++){
            System.out.print(a);
            sum += a;
            if(a == 10)
                System.out.print(" = ");
            else            
                System.out.print(" + ");

        }
        System.out.println(sum);

    }
    
}
