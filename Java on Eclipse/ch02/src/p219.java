
import Misc.Product;

/**
 * Name: productPrinter
 * Programming Exercise: 19.
 * 
 * Implement a class Product. A product has a name and a price, for example new Product(Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a program Product Printer that makes two products, prints the name and price, reduces their prices by $5.00, and then prints the price again
 */

public class p219 {

	public static void main(String[] args) {
            Product p1 = new Product("Product A", 9.99);
            Product p2 = new Product("Product B", 29.99);
            System.out.println("Name: " + p1.getName() + "\t|| Price: " + p1.getPrice());
            System.out.println("Name: " + p2.getName() + "\t|| Price: " + p2.getPrice() );
            p1.reducePrice();
            p2.reducePrice();
            System.out.println("Name: " + p1.getName() + "\t|| Price: " + p1.getPrice() );
            System.out.println("Name: " + p2.getName() + "\t|| Price: " + p2.getPrice() );
        }
}
