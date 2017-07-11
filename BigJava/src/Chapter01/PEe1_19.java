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
public class PEe1_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] state = {"Alabama","Alaska","Aizona","Arkansas","California","Colorado","Connecticut"};
        Double[] tax = {4.00, 0.00, 5.60, 6.50, 7.25, 2.90, 6.35};
        
        System.out.println("   Sales Tax Rates");
        System.out.println("--------------------");
        for(int a = 0; a< state.length; a++){
            System.out.printf("%-12s || %4.2f\n",state[a], tax[a]);
        }
        
    }
    
}
