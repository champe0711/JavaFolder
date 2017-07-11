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
public class HouseComponent extends JComponent{
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        //get the Component Height and Width (JFRAME Height and Width
        int y = getHeight();
        int x = getWidth();
        
        
        House house1 = new House (25,150);
        
        house1.draw(g2);
        
    }
}
