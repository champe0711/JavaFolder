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
public class PEe3_10Product {

    private final String PNAME;
    private double pPrice;
    
    public PEe3_10Product(String name, double price) {
       PNAME = name;
       pPrice = price;
    }
    
    public String getName(){
        return PNAME;
    }
    
    public double getPrice(){
        return pPrice;
    }
    
    public void reducePrice(double reduce){
        pPrice = pPrice - reduce;
    }
    
    
    
}
