
import Misc.BankAccount;

/**
 * Name: BankAccountTester
 * Programming Exercise: 11.
 * Write a BankAccountTester class whose main method constructs a bank account, deposits $1,000, withdraws $500, withdraws another $400, and then prints the remaining balance. also print the expected result. 
 */

public class p211 {

	public static void main(String[] args) {
            
            //construct a bank account
            BankAccount myAccount = new BankAccount();
            
            System.out.println("Deposit $1,000 to the bank account.");
            myAccount.deposit(1000.00);
//            System.out.println("Current Balance: " + myAccount.getBalance() + "\n");
            
            System.out.println("Withdraw $500");
            myAccount.withdraw(500.00);
            
            System.out.println("Withdraw $400");
            myAccount.withdraw(400.00);
            
            System.out.println("Remaining Balance after Transactions: $" + myAccount.getBalance());
            System.out.println("Expected Balance =  $100.00");
        }
}
