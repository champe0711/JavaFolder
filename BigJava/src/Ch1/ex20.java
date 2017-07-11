/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch1;

/**
 *
 * @author Christian Paul
 */
public class ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] greetings = new String[][]{
            {"Good Morning","Magandang Umaga"},
            {"Good Evening","Magandaing Gabi"},
            {"Goodbye","Paalam"},
            {"How are you?","Kamusta ka?"},
            {"Take care","Ingat!"},
            {"Whats up?","Balita?"},
            {"Hello","Hello"},
            {"See ya","Sige"}
        };
        System.out.println("  List of Phrases to Translate");        
        System.out.println("  ----------------------------");

        for(int i = 0; i < greetings.length; i++){
            System.out.printf("%-13s || %15s%n",greetings[i][0], greetings[i][1]);
        }
    }
    
}
