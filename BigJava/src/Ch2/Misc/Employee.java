/**
 * Name: Employee Class
 * Description: Class for  P216
 */

package Misc;

public class Employee {
    
    private String employee;
    private double salary;
    
    public Employee(){
        
    }
    
    public Employee(String employeeName, double currentSalary){
        this.employee = employeeName;
        this.salary = currentSalary;
    }
    
    public String getName(){
        return this.employee;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void raiseSalary(double byPercentage){
        this.salary = this.salary + (this.salary * byPercentage);
    }
}
