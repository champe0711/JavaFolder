
package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent2 extends JComponent {
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Car2 car1 = new Car2(0, 0, Color.BLUE);
        Car2 car2 = new Car2(x, 0, Color.YELLOW);
        Car2 car3 = new Car2(0, y, Color.RED);
        Car2 car4 = new Car2(x, y, Color.GREEN);
        
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
    }
}
