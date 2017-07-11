/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import Chapter02.Classes.Day;

/**
 *
 * @author chris
 */
public class PEe2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Day d = new Day();
        Day bday = new Day(2017, 8, 21);
        System.out.println(bday);
        System.out.println("DD/MM/YYYY");
        System.out.println(d.getDay() + " " + d.getMonth() + " " + d.getYear());
        d.advance(10);
        System.out.println("days Remaining: " + Math.abs(d.daysBetween(bday)));

    }

}
