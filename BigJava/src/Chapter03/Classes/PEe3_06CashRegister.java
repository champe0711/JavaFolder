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
public class PEe3_06CashRegister {
    
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
    private double purchase;
    private double payment;
    private String aString = "";

    /**
     * Constructs a cash register with no money in it.
     */
    public PEe3_06CashRegister() {
        purchase = 0;
        payment = 0;
    }
    
    /**
     * Records the purcahse price of an item
     * @param amount the price of the purshased item
     */
    
    public void recordPurchase(double amount){
        purchase = purchase + amount;
        aString = aString.concat(String.valueOf(amount) + "\n");
    }
    
    /**
     * Processes the payment received from the customer.
     * @param dollars the number of dollars in the payment
     * @param quarters the number of quarters in the payment
     * @param dimes the number of dimes in the payment
     * @param nickels the number of nickels in the payment
     * @param pennies the number of pennies in the payment
     */
    
    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
    
    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    
    public String printReceipt(){
        return aString;
    }
}
