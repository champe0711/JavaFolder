/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_10Product;

/**
 *
 * @author chris
 */
public class PEe3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_10Product toaster = new PEe3_10Product("Toaster", 29.95);
        PEe3_10Product fridge = new PEe3_10Product("Refridgirator", 49.49);
        PEe3_10Product stove = new PEe3_10Product("Stove", 39.89);
        System.out.printf("Name: %15s || Price: %3.2f \n", toaster.getName(), toaster.getPrice() );
        System.out.printf("Name: %15s || Price: %3.2f \n", fridge.getName(), fridge.getPrice() );
        System.out.printf("Name: %15s || Price: %3.2f \n", stove.getName(), stove.getPrice() );
        
        toaster.reducePrice(5.00);
        fridge.reducePrice(5.00);
        stove.reducePrice(5.00);
        System.out.println("                After Reduction");
        System.out.printf("Name: %15s || Price: %3.2f \n", toaster.getName(), toaster.getPrice() );
        System.out.printf("Name: %15s || Price: %3.2f \n", fridge.getName(), fridge.getPrice() );
        System.out.printf("Name: %15s || Price: %3.2f \n", stove.getName(), stove.getPrice() );
        
    }
    
}
