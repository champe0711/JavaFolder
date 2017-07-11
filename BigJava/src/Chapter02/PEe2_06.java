/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author chris
 */
public class PEe2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Original: " + s);
        
        s = s.replace('e', 'a');
        s = s.replace('o', 'e');
        s = s.replace('a', 'o');
        
        System.out.println(s);
    }

}
