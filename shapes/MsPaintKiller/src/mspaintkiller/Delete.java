
package mspaintkiller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import static mspaintkiller.MsPaintKiller.base;
import static mspaintkiller.Shapes.isOn;

/**
 *
 * @author efe
 */
public class Delete implements MouseListener{

    
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
            if(source instanceof JPanel){
                JPanel panelPressed = (JPanel) source;
                if (isOn == true) {
                    base.remove(panelPressed);
                    base.repaint();
                }
            }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
