/**
 * Name: Project1
 * Description:
 * 	This project builds on Exercises P1.9 and P1.10 Your program should read the user's name, then show a sequence of two dialog boxes:
 * 		- First, an input dialog box that asks: "what would you like me to do?"
 * 		- Then a message dialog box that says: "I'm sorry, yourname. I'm afraid I can't do that."
 */

package Chapter01.others;

import javax.swing.JOptionPane;

public class Project1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + name +"\nI'm sorry. I'm afraid I can't do that.");
		
		System.out.println("hello, " + name);
		System.exit(0);
	}
}
