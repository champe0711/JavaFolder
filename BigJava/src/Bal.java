/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Paul
 */

import java.util.Scanner;

public class Bal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        hehe_class interestCalc = new hehe_class("Darl");
        
        System.out.println("Creating new account");
        System.out.println("Add value to account: >");
        interestCalc.setMoney(in.nextDouble());
        
        System.out.println("addint 0.05 interest to the account");
        interestCalc.setInterest(0.05);
        
        
        for(int a = 1; a <=10; a++){
            interestCalc.computeInterest();
            System.out.println(interestCalc.toString());
        }
        
        System.out.println("Money :" + interestCalc.getMoney());
        
//        
//        final double interest = 0.05;
//        double money = 10000.00;
//        int year = 0;
//        
//        while (money <= 20000){
//            money += interest * money;
//            year++;
//            System.out.printf("Money = %f || Year = %d || Interest = %f%n", money, year, interest);
        }
    }
    

