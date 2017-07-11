

/**
 * Name: BankAccountTester
 * Programming Exercise: 12.
 * Add a method
 *      public void addInterest(double rate)
 * to the bankAccount class that adds interest at the given rate. For example, after the statemnts
 *      BankAccount momsSavings = new BankAccount(1000);
 *      momsSavings.addInterest(10); // 10 percent Interest
 * 
 * the balance in momsSavings is $1,100. Also supply a BankAccountTester class that prints the actual and expected balance
 */

import Misc.BankAccount;

public class p212 {

	public static void main(String[] args) {
            
            //construct a bank account
            BankAccount savingsAccount = new BankAccount(1000.00);
            System.out.println("Account Balance = "+ savingsAccount.getBalance() + "\n");
            savingsAccount.addInterest(10.00);
            
            System.out.println("Savings Account Balance = " + savingsAccount.getBalance());
        }
}
