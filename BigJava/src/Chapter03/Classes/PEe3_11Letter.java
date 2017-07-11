/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Classes;

/**
 *
 * @author chris
 */
public class PEe3_11Letter {
    
    private String lFrom;
    private String lTo;
    private String lBody = "";
    
    public PEe3_11Letter(String from, String to){
        lFrom = from;
        lTo = to;
    }
    
    public void addLine(String line){
        lBody = lBody.concat(line).concat("\n");
    }
    
    public void getText(){
        System.out.println("From: " + lFrom);
        System.out.println("To: " + lTo);
        System.out.println("");
        System.out.println("+-----------------+");
        System.out.println("| Letter Contents |");
        System.out.println("+-----------------+");
        System.out.println("");
        System.out.println(lBody);
    }
}
