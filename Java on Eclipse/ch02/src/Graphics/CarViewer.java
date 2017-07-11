
package Graphics;
import javax.swing.JFrame;


public class CarViewer {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300,400);
        f.setTitle("Two cars");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CarComponent component = new CarComponent();
        f.add(component);
        
        f.setVisible(true);
        
    }
    
}
