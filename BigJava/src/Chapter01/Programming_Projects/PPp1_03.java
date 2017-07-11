/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01.Programming_Projects;

/**
 *
 * @author chris
 */
public class PPp1_03 {

    public static void main(String[] args) {
        System.out.printf("%3.6f\n", Math.PI);
        //Gregory Leibniz Series

        double manual = 4.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0);
        System.out.println("Manual: " + manual);

        double newPI = 4.0;
        double oldPI = 4.0;
        String myS = "";

        System.out.println("Loop");
        int a = 3;
        int b = 1;
        boolean aBool = true;
//        System.out.printf("%2.6f ", newPI);
        while (aBool) {

            if (b % 2 == 1) {
                newPI = oldPI - (4.0 / a);
                //System.out.printf("%2.6f   = %2.6f - (%2.6f) || %2d )\n", newPI, oldPI, 4.0 / a, a);
//                System.out.printf(" - %2.6f ", 4.0 / a);
                oldPI = newPI;
            } else if (b % 2 == 0) {
                newPI = oldPI + (4.0 / a);
                //System.out.printf("%2.6f   = %2.6f + (%2.6f) || %2d )\n", newPI, oldPI, 4.0 / a, a);    
//                System.out.printf("+ %2.6f ", 4.0 / a);
                oldPI = newPI;
            }
            a += 2;
            b++;

            myS = Double.toString(newPI).substring(0, 8);
            if (myS.equals("3.141593")) {
//                System.out.println("");
                System.out.println("PI: " + myS + " was obtained at " + b + " operations in Gregory Leibniz Series");
                aBool = false;
            }
        }
    }

}
