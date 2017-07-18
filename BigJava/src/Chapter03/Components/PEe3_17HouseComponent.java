/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Components;

import Chapter03.Classes.PEe3_16House;
import Chapter03.Classes.PEe3_17House;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PEe3_17HouseComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_17House house = new PEe3_17House(0, 0, 150, 150);
        PEe3_17House house2 = new PEe3_17House(160, 0, 150, 150);
        PEe3_17House house3 = new PEe3_17House(320, 0, 150, 150);
        PEe3_17House house4 = new PEe3_17House(0, 175, 150, 150);
        PEe3_17House house5 = new PEe3_17House(160, 175, 150, 150);
        PEe3_17House house6 = new PEe3_17House(320, 175, 150, 150);
        
        house.draw(g2);
        house2.draw(g2);
        house3.draw(g2);
        house4.draw(g2);
        house5.draw(g2);
        house6.draw(g2);
        
    }
}
