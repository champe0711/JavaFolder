

/**
 * Name: CashRegisterTester
 * Programming Exercise: 14.
 * 
 *  Add a feature to the CashRegister class for computing sales tax. The tax rate should be supplied when constructing a CashRegister object. Add recordTaxablePurchase and getTotalTax methods. (amounts added with recordPurchase are not taxable.) the giveChange method should correctly reflect the sales tax that is charged on taxable items. 
 */



import Misc.CashRegister;

public class p214 {

	public static void main(String[] args) {
            //create new register
            CashRegister reg = new CashRegister(10.00);
            
            //register a product
            reg.recordPurchase(10.20);
            reg.recordTaxablePurchase(15.49);
            reg.recordTaxablePurchase(12.99);
            reg.recordTaxablePurchase(20.99);
            reg.enterPayment(100.00);
            reg.Receipt();
            System.out.printf("Change = %.02f\n", reg.giveChange());
            

            System.out.println("Expected: 35.38");
        
        }
}
