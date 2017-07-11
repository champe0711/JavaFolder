/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

import Chapter03.Classes.PEe3_08Employee;

/**
 *
 * @author chris
 */
public class PEe3_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PEe3_08Employee harry = new PEe3_08Employee("Hacker, Harry", 50000.0);
        harry.raiseSalary(10.0);
        
        System.out.println(harry.getName() + " Salary: " + harry.getSalary());
    }
    
}
