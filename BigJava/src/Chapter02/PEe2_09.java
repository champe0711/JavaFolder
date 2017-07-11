/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.awt.Color;
import javax.swing.JFrame;

public class PEe2_09 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        Color myColor = new Color(50, 100, 150);
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
