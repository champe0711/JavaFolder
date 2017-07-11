/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

/**
 *
 * @author chris
 */
public class PEe3_03BankAccount {
    private double balance;

    public PEe3_03BankAccount() {
        balance = 0.0;
    }
    
    public PEe3_03BankAccount(double bal) {
        balance = bal;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Invalid amount");
            System.out.println("Transaction Failed");
        }else {
            balance = Math.max(0, balance - amount);
        }
    }
    
    public double getbalance(){
        return balance;
    }
    
}
