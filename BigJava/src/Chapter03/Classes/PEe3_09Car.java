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
public class PEe3_09Car {

    private final int EFFICIENCY;
    private double fuel;
    
    public PEe3_09Car(int carEfficiency) {
        EFFICIENCY = carEfficiency;
        fuel = 0;
    }
    
    public void drive(int distance){
        fuel = fuel - ( distance / EFFICIENCY);
        
    }
    
    public void addGas(double gas){
        fuel += gas;
    }
    
    public double getGasInTank(){
        return fuel;
    }
    
    
    
    
    
}
