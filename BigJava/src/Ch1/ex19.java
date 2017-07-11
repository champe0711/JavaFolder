/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Christian Paul
 */
public class ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("  Sales Tax Rates");
        System.out.println(" -----------------");
        HashMap<String, Double> sTax = new HashMap<String, Double>();
        sTax.put("Alabama", 4.00);
        sTax.put("Arizona", 5.60);
        sTax.put("Arkansas", 6.50);
        sTax.put("California", 7.50);
        sTax.put("Colorado", 2.90);
        
        Set s = sTax.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry mEntry = (Map.Entry)it.next();
            System.out.printf("%-10s || %2.2f%n", mEntry.getKey(), mEntry.getValue());
        }
    }
    
}
