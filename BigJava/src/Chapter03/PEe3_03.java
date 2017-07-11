/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_03BankAccount;
/**
 *
 * @author chris
 */
public class PEe3_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_03BankAccount myAccount = new PEe3_03BankAccount();
        myAccount.deposit(1000.0);
        myAccount.withdraw(500.0);
        myAccount.withdraw(400.0);
        System.out.println("Actual:   " + myAccount.getbalance());
        System.out.println("Expected: 100.0");
        myAccount.withdraw(200.0);
        System.out.println(myAccount.getbalance());
    }
    
}
