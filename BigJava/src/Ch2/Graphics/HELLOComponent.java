
package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HELLOComponent extends JComponent {
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x = (getWidth() / 2) - 135;    //set right most point (accounting for the car size)
        int y = (getHeight() /2) - 25;   //set bottom most point (accounting for the car size)
        
        LetterH h = new LetterH(x, y, Color.black);
        LetterE e = new LetterE(x+55, y, Color.black);
        LetterL l1 = new LetterL(x + 110, y, Color.black);
        LetterL l2 = new LetterL(x + 165, y, Color.black);
        LetterO o = new LetterO(x+ 220, y, Color.black);
        
        h.draw(g2);
        e.draw(g2);
        l1.draw(g2);
        l2.draw(g2);
        o.draw(g2);
        
    }
}
