/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_04BankAccount;
/**
 *
 * @author chris
 */
public class PEe3_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_04BankAccount myAccount = new PEe3_04BankAccount();
        myAccount.deposit(1000.0);
        myAccount.addInterest(10.0);
        System.out.println("Current Balance: " + myAccount.getbalance());
        myAccount.withdraw(500.0);
        myAccount.withdraw(400.0);
        System.out.println("Actual:   " + myAccount.getbalance());
        System.out.println("Expected: 200.0");
        myAccount.withdraw(400.0);
        System.out.println(myAccount.getbalance());
    }
    
}
