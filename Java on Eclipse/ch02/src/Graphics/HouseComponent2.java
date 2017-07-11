/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics;

import Graphics.House;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Christian Paul
 */
public class HouseComponent2 extends JComponent{
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        //get the Component Height and Width (JFRAME Height and Width
        int y = getHeight();
        int x = getWidth();
        
        
        House house1 = new House (25,60);
        House house2 = new House (25,350);
        House house3 = new House (25,650);
        House house4 = new House (925,60);
        House house5 = new House (925,350);
        House house6 = new House (925,650);
        
        house1.draw(g2);
        house2.draw(g2);
        house3.draw(g2);
        house4.draw(g2);
        house5.draw(g2);
        house6.draw(g2);
        
    }
}
