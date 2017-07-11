/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02.Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PPp2_02Component extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle r1 = new Rectangle(0, 0, 100, 200);
        System.out.println(r1);
        g2.draw(r1);

        g2.translate(r1.width, r1.height);
        r1.grow(100, 200);
        System.out.println(r1);
        g2.draw(r1);

        //move whole g2
//        g2.translate(100, 50);
        //draw components
//        g2.draw(r1);
    }

}
