package Chapter01.Programming_Projects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PPp1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalMilage = 1131.00;
        System.out.println("+------------------+");
        System.out.println("| Total Car Milage |");
        System.out.printf("|      %5.2f     |\n",totalMilage);
        System.out.println("+------------------+");
        double distance = 18.3;  //to work
        
        /**
         * Subtract work milage to total milage  = personal use
         * workout work milage by distance * 5 (days a week) * 2 (return journey)
         */
        double workUse = distance * 5 * 2; //5 times a week
        double personalUse = totalMilage - workUse; 
        
        System.out.println("Personal use || Work use");
        System.out.printf("%-12.2f || %8.2f\n", personalUse, workUse);
    }
    
}
