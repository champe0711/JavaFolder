/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author chris
 */
public class PEe1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] col1 = {"Uno","Dos","Tres","Qouatro"};
        String[] col2 = {"One","Two","Tree","Four"};
        System.out.println("Spanish || English");
        for(int a = 0; a<col1.length; a++){
            System.out.printf("%7s || %-7s\n", col1[a], col2[a]);
        }
    }
    
}
