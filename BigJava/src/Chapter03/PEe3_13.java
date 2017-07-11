/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_13Moth;

/**
 *
 * @author chris
 */
public class PEe3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_13Moth moth = new PEe3_13Moth(0.0);
        moth.moveToLight(2.0);
        System.out.println(moth.getPosition());
        moth.moveToLight(20.0);
        System.out.println(moth.getPosition());
    }
    
}
