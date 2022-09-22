
package mspaintkiller;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author efe
 */
public class MouseMovement implements MouseListener,MouseMotionListener{

    public static int oldX,oldY;
    public static int movX,movY;
    
    public MouseMovement(){  
    }
    
    public MouseMovement(Component... pns){
        for(Component panel : pns){
            panel.addMouseListener(this);
            panel.addMouseMotionListener(this);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        movX = e.getX();
        movY = e.getY();
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

    @Override
    public void mouseDragged(MouseEvent e) {
        e.getComponent().setLocation((e.getX()+e.getComponent().getX())-movX,(e.getY()+e.getComponent().getY())-movY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addComp(Component comp){
        comp.addMouseListener(this);
        comp.addMouseMotionListener(this);
    }
    
}//end of MouseMovement
