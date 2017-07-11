/**
 * Name: Cash Register Class
 * Description:
 * `A cash register totals up sales and computes change due.    
 * 
*/

package Misc;

public class CashRegister {
    
    private double purchase;
    private double paymnet;
    private double taxRate;
    private double tax;
    private double sales;
    private int salesCount;
    
    /**
     * Constructs a cash register with no money in it
     */
    public CashRegister(){
        
    }
    
    /**
     * Cash register constructor with taxRate
     * @param amount construct cash register with tax rate
     */
    public CashRegister(double amount){
        this.taxRate = amount/ 100;
    }
    
    /*
    * Records the sale of an item
    * @param amount the price of the item
    */
    public void recordPurchase(double amount){
        this.purchase = this.purchase + amount;
    }
    
    /**
     * Record Taxable Purchase 
     * @param amount amount of taxable purchase
     */
    
    public void recordTaxablePurchase(double amount){
        //compute for taxed goods
        this.tax = this.tax + (amount * this.taxRate);
        //add tax amount to purchase total
        this.purchase = this.purchase + amount;
    }
    
    /**
     * Enters the payment received from the customer
     * @param amount the amount of the payment
     */
    public void enterPayment(double amount){
        this.paymnet = amount;
    }
    
    /**
     * Computes the change due and resets the machine for the next customer
     * @return the change due to the customer
     */
    public double giveChange(){        
        //increase sales count
        this.salesCount ++;
        double change = this.paymnet - (this.purchase + this.tax);
        this.sales = this.sales +  (this.purchase + this.tax);
        //reset values
        this.purchase = 0;
        this.paymnet = 0;
        this.tax = 0;
        return change;
    }
    
    /**
     * Simple Receipt
     */
    
    public void Receipt(){
        System.out.printf("Sales no. %05d \n", this.salesCount);
        System.out.printf("Total Purchase: %.02f\n", this.purchase);
        System.out.printf("Total Taxable: %.02f\n", this.tax);
        System.out.printf("Payment: %.02f\n", this.paymnet);
    }
    
    //get the total Tax
    public double getTotalTax(){
        return this.tax;
    }
    
    //Get the total sales
    public double getSalesTotal(){
        return this.sales;
    }
    
    //get sales count
    public int getSalesCount(){
        return this.salesCount;
    }
    
    /**
     * Reset counters and globals
     */
    
    
    public void reset(){
        this.paymnet = 0;
        this.purchase = 0;
        this.sales = 0;
        this.salesCount = 0;
        this.tax = 0;
        this.taxRate = 0;
    }
    
}
