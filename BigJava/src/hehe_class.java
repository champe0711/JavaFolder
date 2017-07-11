/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Paul
 */
public class hehe_class {
    //vars
    double interest = 0.0, money = 0.0; 
    int year = 0;
    String name = "";
    
    //constructor
    public hehe_class(){       
    }
    
    public hehe_class(String name){
        this.name = name;
    }
        
    //setter mutator
    public void setName(String s){
        name = s;
    }
    
    public void setMoney(double d){
        money = d;
    }
    
    public void setInterest(double d){
        interest = d;
    }
    
    //getters
    public double getMoney(){
        return money;
    }
    
    //mutator
    public double computeInterest(){
        year++;
        return money += interest * money;
    }
    
    //optional tostring
    @Override
    public String toString(){
        return String.format("Money = %.2f || Year = %2d || Interest = %.2f%n", money, year, interest);
    }
}
