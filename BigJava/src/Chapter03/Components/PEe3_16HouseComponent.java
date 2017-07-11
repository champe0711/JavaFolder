/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03.Components;

import Chapter03.Classes.PEe3_16House;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class PEe3_16HouseComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_16House house = new PEe3_16House(getWidth(),getHeight());
        house.draw(g2);
    }
}
