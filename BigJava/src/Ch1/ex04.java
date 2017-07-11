/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch1;

/**
 *
 * @author Christian Paul
 */
public class ex04 {

    public static void main(String[] args) {
        double accountBal = 1000.00;
        double interest = 0.05;
        System.out.printf("%4s || %6s || %8s || %7s%n", "Year" , "Balance" , "Interest", "Total");
        for(int a = 1; a <=5; a++){
            System.out.printf("%4d || %6.2f || %8.2f || ",a, accountBal, accountBal * interest);
            accountBal += accountBal * interest;
            System.out.printf("%6.2f%n",accountBal);
        }
    }
    
}
