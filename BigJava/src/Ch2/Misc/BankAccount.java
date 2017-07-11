/*
 * A bank account has a balance that can be changed by deposits and withdrawls.
 */

package Misc;

/**
 *
 * @author Christian Paul
 */
public class BankAccount {
    
    private double balance;
    
    /**
     * Constructs a bank account with a zero balance
     */
    
    public BankAccount(){
        balance = 0;
    }
    
    /**
     * Construct a bank account with a given balance.
       @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    
    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    
    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    
    /**
     * Gets the current balance of the bank account.
     * return the current balance
     */
    public double getBalance(){
        return this.balance;
    }
    
    /**
     * adds  interest at the given rate
     * @param rate add interest to the account
     */
    public void addInterest(double rate){
        this.balance = this.balance + (this.balance * (rate / 100));
    }
    
}
