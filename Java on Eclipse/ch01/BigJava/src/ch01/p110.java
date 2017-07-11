/**
 * Name: DialogViewer
 * Programming Exercise: 9.
 * Description:
 * 	type in and run the following program
 */

package ch01;

import javax.swing.JOptionPane;

public class p110 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		if(name.equalsIgnoreCase("bessie")) {
			JOptionPane.showConfirmDialog(null, "hello, " + name + " sungit");
		}else {
			JOptionPane.showConfirmDialog(null, "hello, " + name + " pogi");	
		}
		System.exit(0);
	}
}
