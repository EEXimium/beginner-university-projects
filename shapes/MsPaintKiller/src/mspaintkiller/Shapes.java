
package mspaintkiller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

import static mspaintkiller.MouseMovement.movX;
import static mspaintkiller.MouseMovement.movY;
import static mspaintkiller.MsPaintKiller.base;
import static mspaintkiller.MsPaintKiller.choice;
import static mspaintkiller.MsPaintKiller.objectCount;

/**
 *
 * @author efe
 */
public class Shapes implements MouseListener{
    static boolean isOn=false;
    MouseMovement hareket = new MouseMovement();
    static int id =1;
    
    public Shapes(Component panel){
        panel.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        MouseMovement.movX = e.getX();
        MouseMovement.movY = e.getY();
        
        
        if(choice == 1){   //KARE
            isOn = false;
            JPanel panel = new JPanel();
            panel.setLocation(movX, movY);
            panel.setBackground(Color.blue);
            panel.setSize(50, 50);
            base.add(panel,++objectCount);
            hareket.addComp(panel);
            base.repaint();
            Delete listener = new Delete();
            panel.addMouseListener(listener);
            
        }
        
        if (choice == 2) {  //ÜÇGEN
           isOn = false;
           CreateTriangle panel = new CreateTriangle();
           panel.setLocation(movX, movY);
           panel.setSize(100, 100);
           base.add(panel,++objectCount);
           hareket.addComp(panel);
           panel.setVisible(true);
           base.repaint();
           Delete listener = new Delete();
           panel.addMouseListener(listener);
           
        }
        
        if (choice == 3) {  //DAİRE
           isOn = false;
           CreateCircle panel = new CreateCircle();
           panel.setLocation(movX, movY);
           panel.setSize(50, 50);
           base.add(panel,++objectCount);
           hareket.addComp(panel);
           panel.setVisible(true);
           base.repaint();
           Delete listener = new Delete();
           panel.addMouseListener(listener);
           
        }
        
        if(choice == 4){   //LINE - ÇİZGİ YATAY - HORIZONTAL
            isOn = false;
            JPanel panel = new JPanel();
            panel.setLocation(movX, movY);
            panel.setBackground(Color.magenta);
            panel.setSize(150, 2);
            base.add(panel,++objectCount);
            hareket.addComp(panel);
            base.repaint();
            Delete listener = new Delete();
            panel.addMouseListener(listener);
            
        }
        
        if(choice == 5){   //LINE - ÇİZGİ DİKEY - VERTİCAL
            isOn = false;
            JPanel panel = new JPanel();
            panel.setLocation(movX, movY);
            panel.setBackground(Color.magenta);
            panel.setSize(2, 150);
            base.add(panel,++objectCount);
            hareket.addComp(panel);
            base.repaint();
            Delete listener = new Delete();
            panel.addMouseListener(listener);
        }
        
        if (choice == 6) {
            isOn= true; 
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
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