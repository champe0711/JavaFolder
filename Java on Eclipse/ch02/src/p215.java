/**
 * Name: CashRegisterTester
 * Programming Exercise: 15.
 * 
 *  After closing time, the store manager would like to know how much business was transacted during the day. Modify the CashRegister class to enable this functionality. Supply methods getSalesTotal and get SalesCount to get the total amount of all sales and the number of sales. Supply a method reset that resets any counters and totals so that the next day's sales start from zero.
 */



import Misc.CashRegister;

public class p215 {

	public static void main(String[] args) {
        //create new register
        CashRegister reg = new CashRegister(10.00);

        //register a product
        reg.recordPurchase(10.20);
        reg.recordTaxablePurchase(999999.49);
        reg.recordTaxablePurchase(12.99);
        reg.recordTaxablePurchase(20.99);
        reg.enterPayment(10000000.00);
        reg.Receipt();
        System.out.printf("Change = %.02f\n\n", reg.giveChange());
        
        reg.recordPurchase(10.20);
        reg.recordTaxablePurchase(15.49);
        reg.recordTaxablePurchase(300.99);
        reg.recordTaxablePurchase(500.99);
        reg.enterPayment(1000.00);
        reg.Receipt();
        System.out.printf("Change = %.02f\n\n", reg.giveChange());
        
        reg.recordPurchase(200.20);
        reg.recordTaxablePurchase(15.49);
        reg.recordTaxablePurchase(12.99);
        reg.recordTaxablePurchase(20.99);
        reg.enterPayment(500.00);
        reg.Receipt();
        System.out.printf("Change = %.02f\n\n", reg.giveChange());
        
        reg.recordPurchase(10.20);
        reg.recordTaxablePurchase(55.49);
        reg.recordTaxablePurchase(22.99);
        reg.recordTaxablePurchase(20.99);
        reg.enterPayment(500.00);
        reg.Receipt();
        System.out.printf("Change = %.02f\n\n", reg.giveChange());
        
        System.out.println("Total Sales " + reg.getSalesTotal());
        
        reg.reset();
        
        reg.recordPurchase(10.20);
        reg.recordTaxablePurchase(15.49);
        reg.recordTaxablePurchase(12.99);
        reg.recordTaxablePurchase(120.99);
        reg.enterPayment(1000.00);
        reg.Receipt();
        System.out.printf("Change = %.02f\n\n", reg.giveChange());
        
        }
}
