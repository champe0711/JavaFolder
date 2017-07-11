/*
 *Implement a class Product. A product has a name and a price, for example new Product(Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a program Product Printer that makes two products, prints the name and price, reduces their prices by $5.00, and then prints the price again
 */

package Misc;

/**
 *
 * @author Christian Paul
 */
public class Product {
    
    String pName;
    double pPrice;
    
    public Product(){
        
    }
    
    public Product(String name, double price){
        this.pName = name;
        this.pPrice = price;
    }
    
    public String getName(){
        return this.pName;
    }
    
    public double getPrice(){
        return this.pPrice;
    }
    
    public void reducePrice(){
        this.pPrice = this.pPrice - 5.00;
    }
}
