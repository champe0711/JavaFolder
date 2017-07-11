/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_01Counter;

/**
 *
 * @author chris
 */
public class PEe3_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PEe3_01Counter myCounter = new PEe3_01Counter();
        
        myCounter.click();
        myCounter.click();
        System.out.println(myCounter.getValue());
        myCounter.undo();
        System.out.println(myCounter.getValue());
        myCounter.undo();
        myCounter.undo();
        System.out.println(myCounter.getValue());
        myCounter.undo();
        System.out.println(myCounter.getValue());
    }
    
}
