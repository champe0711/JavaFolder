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
public class PEe1_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Balance || 5% Interest || New Balance ||Year");
        double initBalance = 1000;
        double interest = 0.05;
        double interestGained;
        double newBalanace;
        
        for(int a = 1; a<=3; a++ ){
            interestGained = initBalance * interest;
            newBalanace = interestGained + initBalance;
            System.out.printf("%7.2f || %11.2f || %11.2f || %2d\n", initBalance, interestGained, newBalanace, a);
            initBalance = newBalanace;
        }
    }
    
}
