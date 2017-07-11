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
public class PEe1_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] translate = {
            {"Good Morning.", "Magandang Umaga"},
            {"It is a pleasure to meet you.", "Kinakagalak kong Makilala ka"},
            {"Please call me tomorrow.", "Tawagan mo ako Bukas"},
            {"Have a nice day!", "Magandang araw sayo!"}
        };
        System.out.println("                 List of Prases to Translate");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                  ENGLISH      ||      FILIPINO");
        for (int i = 0; i < translate.length; i++) {
            System.out.printf("%30s || %-30s\n" , translate[i][0], translate[i][1] );
        }
    }

}
