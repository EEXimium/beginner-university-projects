
package mspaintkiller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author efe
 */
public class CreateCircle extends JPanel{
    int x, y;
    
   public void paintComponent(Graphics g) {
        
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.black);
    g2.fillOval(x, y, 50, 50);
    
    }
    
}//end of circle
