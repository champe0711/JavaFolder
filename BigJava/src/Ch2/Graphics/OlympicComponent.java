
package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OlympicComponent extends JComponent {
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = (getWidth() / 2) - 75;    //set right most point (accounting for the car size)
        int y = (getHeight() /2) - 37;   //set bottom most point (accounting for the car size)
        
        OlympicCircle o1 = new OlympicCircle(x, y, Color.BLUE);
        OlympicCircle o2 = new OlympicCircle(x+25, y+25, Color.YELLOW);
        OlympicCircle o3 = new OlympicCircle(x+55, y, Color.BLACK);
        OlympicCircle o4 = new OlympicCircle(x+80, y+25, Color.GREEN);
        OlympicCircle o5 = new OlympicCircle(x+110, y, Color.red);
        OlympicCircle o6 = new OlympicCircle(x+135, y+25, Color.WHITE);
        
        o1.draw(g2);
        o3.draw(g2);
        o5.draw(g2);
        o2.draw(g2);
        o4.draw(g2);
//        o6.draw(g2);
    }
}
