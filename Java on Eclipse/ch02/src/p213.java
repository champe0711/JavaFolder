

/**
 * Name: BankAccountTester
 * Programming Exercise: 13.
 * 
 *  Write a class SavingAccount that is similar to the BankAccount Class, except that it has an added instance variable interest. Supply a constructor that sets both the initial balance and the interest rate. Suppy a method addInterest (with no explicit parameter) that adds interest to the account, Write a savingAccount Tester class that constructs a savings account with an initial balance of $1,000 and an interest rate of 10 compute the expected by hand and print it.
 */



import Misc.SavingsAccount;

public class p213 {

	public static void main(String[] args) {
            
            //construct a bank account
            SavingsAccount savingsAccount = new SavingsAccount(1000.00,10.00);
            System.out.println("Account Balance = "+ savingsAccount.getBalance() + "\n");
            savingsAccount.addInterest();
            System.out.println("Savings Account Balance = " + savingsAccount.getBalance());
            System.out.println("Expected balance = $1100.00");
        }
}
