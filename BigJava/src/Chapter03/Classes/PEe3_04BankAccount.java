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
public class PEe3_04BankAccount {
    private double balance;

    public PEe3_04BankAccount() {
        balance = 0.0;
    }
    
    public PEe3_04BankAccount(double bal) {
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
    
    public void addInterest(double rate){
        balance = balance + (balance * (rate / 100));
    }
    
    public void reset()
    {
        balance = 0;
    }
    
    public double getbalance(){
        return balance;
    }
    
}
