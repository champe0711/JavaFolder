package Chapter03.Components;


import Chapter03.Classes.PEe3_20Hello;
import Chapter03.Classes.PEe3_21OlympicRings;
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
public class PEe3_21OlympicRingsComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        PEe3_21OlympicRings blueRing = new PEe3_21OlympicRings(0, 0, Color.blue);
        PEe3_21OlympicRings yellowRing = new PEe3_21OlympicRings(20, 20, Color.yellow);
        PEe3_21OlympicRings blackRing = new PEe3_21OlympicRings(40, 0, Color.black);
        PEe3_21OlympicRings greenRing = new PEe3_21OlympicRings(60, 20, Color.green);
        PEe3_21OlympicRings redRing = new PEe3_21OlympicRings(80, 0, Color.red);
        
        blueRing.draw(g2);
        yellowRing.draw(g2);
        blackRing.draw(g2);
        greenRing.draw(g2);
        redRing.draw(g2);
    }
}
