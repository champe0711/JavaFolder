/**
 * Name: EmployeeTester
 * Programming Exercise: 16.
 * 
 * Implement a class Employee. an employee has a name (a String) and a salary (a double). Provide a constructor with two parameters and methods.
 * 
 * These methods return the name and salary, and raise the employee's salary by certain percentage. Suppy an employeeTester class that tests all methods
 */



import Misc.Employee;

public class p216 {

	public static void main(String[] args) {
        
            //constructor
            Employee e = new Employee("Christian Domingo", 50000.00);
            
            //get name
            System.out.println(e.getName());
            //raise salary
            e.raiseSalary(1.00);
            //get salary
            System.out.println(e.getSalary());
        }
}
