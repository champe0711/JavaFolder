/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_09Car;

/**
 *
 * @author chris
 */
public class PEe3_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PEe3_09Car car = new PEe3_09Car(50);
        car.addGas(20);
        car.drive(100);
        double gasLeft = car.getGasInTank();
        System.out.println("Gas Left: " +gasLeft);
        
    }
    
}
