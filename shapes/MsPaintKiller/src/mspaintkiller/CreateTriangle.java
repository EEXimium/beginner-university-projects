
package mspaintkiller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
//import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author efe
 */
public class CreateTriangle extends JPanel{
    
    public void paintComponent(Graphics g) {
        
        Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(50, 0),
                new Point2D.Double(100, 100), new Point2D.Double(0, 100));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.red);
        g2d.fill(triangleShape);
        
    }
}//end of createtriangle

class Triangle_Shape extends Path2D.Double {
    public Triangle_Shape(Point2D... points) {
        moveTo(points[0].getX(), points[0].getY());
        lineTo(points[1].getX(), points[1].getY());
        lineTo(points[2].getX(), points[2].getY());
        closePath();
        
    }
}