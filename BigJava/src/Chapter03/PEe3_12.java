/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_12Bug;

/**
 *
 * @author chris
 */
public class PEe3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_12Bug bug = new PEe3_12Bug(10);
        bug.move();
        System.out.println("Bug Position: " + bug.getPosition());
        bug.turn();
        bug.move();        
        System.out.println("Bug Position: " + bug.getPosition());

        
        
    }
    
}
