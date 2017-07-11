
import Misc.Car;

/**
 * Name: carTester
 * Programming Exercise: 17.
 * 
 * Implement a class Car with the following properties. a car has a certain fuel efficiency (measured in miles/gallon or litter/km - pick one) and a certain amount of fuel in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, reducing the amount of gasoline in the fuel tank. Also supply methods getGasInTank, returning the current amount of gasoline in the fuel tank, and add Gas, to add gasoline to the fuel tank. 
 * 
 * You may assume that the drive method is never called with a distance that consumes more than the available gas. Supply a carTester class that tests all methods.
 */



public class p217 {

	public static void main(String[] args) {
            Car c = new Car(80.0);
            c.addGas(50.0);
            c.drive(100.0);
            System.out.println("Gas Left = " + c.getGasTank());
            
        }
}
