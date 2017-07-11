
package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent3 extends JComponent {
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth() - 60;    //set right most point (accounting for the car size)
        int y = getHeight() - 30;   //set bottom most point (accounting for the car size)
        
        Car3 c1 = new Car3(0, 0, Color.BLUE,1.0);
        Car3 c2 = new Car3(0, 0, Color.red, 2.0);
        Car3 c3 = new Car3(0, 0, Color.red, 3.0);
        
        c1.draw(g2);
        c2.draw(g2);
        c3.draw(g2);
    }
}
