/**
 * Name: Car
 * Description: Car Class
 * 
 * 
 */

package Misc;

public class Car {
    
    private double fuel;
    private double litersPerKm;
    
    public Car(){
        this.fuel = 0.0;
    }
    
    public Car(double efficiency){
        this.fuel = 0.0;
        
        //this bit of code is producing 0.000004 result
        this.litersPerKm = 1 - (efficiency / 100);
    }
    
    public void drive(double dist){
        this.fuel = this.fuel - (this.litersPerKm * dist);
    }
    
    public double getGasTank(){
        return this.fuel;
    }
    
    public void addGas(double amount){
        this.fuel = this.fuel + amount;
    }
}
