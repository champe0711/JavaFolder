package Chapter03.Components;


import Chapter03.Classes.PEe3_19CarModel;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class PEe3_19CarModelComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_19CarModel car1 = new PEe3_19CarModel(0, 0, 1.0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        PEe3_19CarModel car2 = new PEe3_19CarModel(10, 10, 3.0);
//        PEe3_18CarModel car3 = new PEe3_18CarModel(0,y,Color.BLUE);
//        PEe3_18CarModel car4 = new PEe3_18CarModel(x,0,Color.yellow);

        car1.draw(g2);
        car2.draw(g2);
//        car3.draw(g2);
//        car4.draw(g2);
    }
}
