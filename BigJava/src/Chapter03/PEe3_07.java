/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Chapter03;

import Chapter03.Classes.PEe3_07CashRegister;


/**
 *
 * @author chris
 */
public class PEe3_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_07CashRegister reg = new PEe3_07CashRegister();
        
        reg.recordPurchase(0.75);
        reg.recordPurchase(1.50);
        System.out.println(reg.printReceipt());
        reg.receivePayment(2, 0, 5, 0, 0);
        System.out.print("Change: ");
        System.out.println(reg.giveChange());
        System.out.println("Expected: 0.25");
        System.out.println("Sales Total: " +reg.getSalesTotal());
        System.out.println("Sales Count: " +reg.getSalesCount());
    }
    
}
