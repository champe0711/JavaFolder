package Chapter03.Classes.Supplements;


import Chapter03.Classes.PEe3_18CarModel;
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
public class Sec308CarComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_18CarModel car1 = new PEe3_18CarModel(0, 0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        PEe3_18CarModel car2 = new PEe3_18CarModel(x,y);
        
        car1.draw(g2);
        car2.draw(g2);
    }
}
