/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_02Counter;

/**
 *
 * @author chris
 */
public class PEe3_02 {
    
    public static void main(String[] args){
        
        PEe3_02Counter myCounter = new PEe3_02Counter();

        myCounter.setLimit(3);
        myCounter.click();
        myCounter.click();
        myCounter.click();
        System.out.println(myCounter.getValue());
        myCounter.click();
        System.out.println(myCounter.getValue());
    
    }
    
}
