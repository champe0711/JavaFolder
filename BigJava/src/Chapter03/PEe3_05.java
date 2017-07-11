/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Chapter03;

import Chapter03.Classes.PEe3_05SavingsAccount;

/**
 *
 * @author chris
 */
public class PEe3_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_05SavingsAccount myAccount1 = new PEe3_05SavingsAccount(1000.0);
        PEe3_05SavingsAccount myAccount2 = new PEe3_05SavingsAccount(1000.0, 10.0);
        
        myAccount1.addInterest(10.0);
        System.out.println("Actual Balance");
        System.out.println("Account1: " + myAccount1.getbalance());
        System.out.println("Account2: " + myAccount2.getbalance());
        System.out.println("Expected Balance");
        System.out.println("Account1: 1100.0\nAccount2: 1100.0");
        
    }
    
}
