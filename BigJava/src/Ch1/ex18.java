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
public class ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] friendsList = {"John", "Allan", "Martha", "Nathan", "Ben", "Jen"};
        String[] friendsBdays = {"Jan 1, 1990", "Feb 29, 1989", "Feb 28, 1990", "Mar 11, 1990", "Nov 29 1992", "Dec 25 1999"};
        System.out.println("FrindsList || Frinds Birthdays");
        for(int a = 0; a< friendsList.length; a++){
            System.out.printf("%-10s || %-20s%n", friendsList[a], friendsBdays[a]);
        }
    }
    
}
