package Chapter03;

import Chapter03.Classes.PEe3_11Letter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PEe3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_11Letter letter = new PEe3_11Letter("Mary", "John");
        letter.addLine("Dear John:");
        letter.addLine("");
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");
        letter.addLine("Sincerely,");
        letter.addLine("");
        letter.addLine("Mary");
        
        letter.getText();
    }
    
}
