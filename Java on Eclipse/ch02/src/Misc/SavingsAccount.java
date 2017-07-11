/*
 * A bank account has a balance that can be changed by deposits and withdrawls.
 */

package Misc;

/**
 *
 * @author Christian Paul
 */
public class SavingsAccount {
    
    private double balance;
    private double interest;
    
    /**
     * Constructs a bank account with a zero balance
     */
    
    public SavingsAccount(){
        balance = 0;
    }
    
    /**
     * Construct a bank account with a given balance and interest.
       @param initialBalance the initial balance
       @param rate the initial rate
     */
    public SavingsAccount(double initialBalance, double rate ){
        this.balance = initialBalance;
        this.interest = rate;
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
     * @return the current balance
     */
    public double getBalance(){
        return this.balance;
    }
    
    /**
     * adds  interest  to the bank account
     */
    public void addInterest(){
        
        this.balance = this.balance + (this.balance * (this.interest / 100));
    }
    
}
