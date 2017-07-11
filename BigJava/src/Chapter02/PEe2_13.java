/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.awt.Point;

/**
 *
 * @author chris
 */
public class PEe2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-3, -4);
        double dist = p1.distance(p2);
        System.out.println("P1:" + p1 + " P2: " + p2);
        System.out.println("distance between p1 and p2 = " + dist);
    }

}
