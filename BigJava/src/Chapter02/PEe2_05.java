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
public class PEe2_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Mississippi";
        System.out.println("Original : " + s);
        s = s.replace('s', '$').replace('i', '!');
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == 's'){
//                s = s.replace(s.charAt(i), '$'); 
//            }
//            if(s.charAt(i) == 'i'){
//                s = s.replace(s.charAt(i), '!');
//            }
//        }
        System.out.println("Replaced : " +s);
    }
    
}
