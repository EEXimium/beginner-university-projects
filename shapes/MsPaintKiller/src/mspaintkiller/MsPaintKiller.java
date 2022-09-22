
package mspaintkiller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author efe
 */
public class MsPaintKiller extends JFrame{
    
    static int choice = 0;
    static JButton buttonEraser,buttonSquare,buttonTriangle,buttonBos,buttonCircle,buttonLineH,buttonLineV;
    static JLayeredPane base;
    static int objectCount;
    
    public MsPaintKiller(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//when pressed "x", program shuts down.
        setSize(1366,768);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//tam ekran başlatır
        
        base = new JLayeredPane();
        
        setVisible(true);//pencereyi görünür yapıyor
        base.setSize(getSize());
        base.setLayout(null);//this thing allows ME to do the positioning of the buttons, not any layout manager.
        add(base);
        JLabel not = new JLabel("Note");
        not.setLocation(31, 31);
        not.setVisible(true);
        not.setText("Before erasing the shapes, click once to any empty space without moving the mouse, otherwise erase button wont work");
        not.setBounds(0, 0, 200, 50);
        not.setLocation(500, 50);
        not.setFont(new Font("Verdana",1,15));
        not.setSize(990, 23);
        base.add(not);
        
        
        MouseMovement hareket = new MouseMovement(base.getComponents());
        Delete sil = new Delete();
        base.addMouseListener(sil);
        
        buttonEraser = new JButton("ERASE");
        buttonEraser.setBounds(50,100,95,30);
        buttonEraser.setFocusable(false);
        buttonEraser.addActionListener(listener);
        buttonEraser.setLocation(600,10);
        buttonEraser.setBackground(Color.white);
        base.add(buttonEraser);
        
        buttonSquare = new JButton("SQUARE");
        buttonSquare.setBounds(50,100,95,30);
        buttonSquare.setFocusable(false);
        buttonSquare.addActionListener(listener);
        buttonSquare.setLocation(700,10);
        buttonSquare.setBackground(Color.white);
        base.add(buttonSquare);
        
        buttonTriangle = new JButton("TRIANGLE");
        buttonTriangle.setBounds(50,100,95,30);
        buttonTriangle.setFocusable(false);
        buttonTriangle.addActionListener(listener);
        buttonTriangle.setLocation(800,10);
        buttonTriangle.setBackground(Color.white);
        base.add(buttonTriangle);
        
        buttonCircle = new JButton("CIRCLE");
        buttonCircle.setBounds(50,100,95,30);
        buttonCircle.setFocusable(false);
        buttonCircle.addActionListener(listener);
        buttonCircle.setLocation(900,10);
        buttonCircle.setBackground(Color.white);
        base.add(buttonCircle);
        
        buttonLineH = new JButton("LINE-H");
        buttonLineH.setBounds(50,100,95,30);
        buttonLineH.setFocusable(false);
        buttonLineH.addActionListener(listener);
        buttonLineH.setLocation(1000,10);
        buttonLineH.setBackground(Color.white);
        base.add(buttonLineH);
        
        buttonLineV = new JButton("LINE-V");
        buttonLineV.setBounds(50,100,95,30);
        buttonLineV.setFocusable(false);
        buttonLineV.addActionListener(listener);
        buttonLineV.setLocation(1100,10);
        buttonLineV.setBackground(Color.white);
        base.add(buttonLineV);
        
        Shapes sekiller = new Shapes(base);
        
        
    }//end of MsPaintKiller
    
    public static ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == buttonSquare){
                    if(choice != 1){
                        choice = 1;
                        buttonSquare.setBackground(Color.green);
                        buttonTriangle.setBackground(Color.white);
                        buttonCircle.setBackground(Color.white);
                        buttonLineH.setBackground(Color.white);
                        buttonLineV.setBackground(Color.white);
                        buttonEraser.setBackground(Color.white);
                    }else if (choice == 1) {
                        choice = 0;
                        buttonSquare.setBackground(Color.white);
                    }
                }else if(e.getSource() == buttonTriangle){
                    if(choice != 2){
                        choice = 2;
                        buttonSquare.setBackground(Color.white);
                        buttonTriangle.setBackground(Color.green);
                        buttonCircle.setBackground(Color.white);
                        buttonLineH.setBackground(Color.white);
                        buttonLineV.setBackground(Color.white);
                        buttonEraser.setBackground(Color.white);
                    }else if (choice == 2) {
                        choice = 0;
                        buttonTriangle.setBackground(Color.white);
                    }
                }else if(e.getSource() == buttonCircle){
                    if(choice != 3){
                        choice = 3;
                        buttonSquare.setBackground(Color.white);
                        buttonTriangle.setBackground(Color.white);
                        buttonCircle.setBackground(Color.green);
                        buttonLineH.setBackground(Color.white);
                        buttonLineV.setBackground(Color.white);
                        buttonEraser.setBackground(Color.white);
                    }else if (choice == 3) {
                        choice = 0;
                        buttonCircle.setBackground(Color.white);
                    }
                }else if(e.getSource() == buttonLineH){
                    if(choice != 4){
                        choice = 4;
                        buttonSquare.setBackground(Color.white);
                        buttonTriangle.setBackground(Color.white);
                        buttonLineH.setBackground(Color.green);
                        buttonCircle.setBackground(Color.white);
                        buttonLineV.setBackground(Color.white);
                        buttonEraser.setBackground(Color.white);
                    }else if (choice == 4) {
                        choice = 0;
                        buttonLineH.setBackground(Color.white);
                    }
                }else if(e.getSource() == buttonLineV){
                    if(choice != 5){
                        choice = 5;
                        buttonSquare.setBackground(Color.white);
                        buttonTriangle.setBackground(Color.white);
                        buttonLineV.setBackground(Color.green);
                        buttonCircle.setBackground(Color.white);
                        buttonLineH.setBackground(Color.white);
                        buttonEraser.setBackground(Color.white);
                    }else if (choice == 5) {
                        choice = 0;
                        buttonLineV.setBackground(Color.white);
                    }
                }else if(e.getSource() == buttonEraser){
                    if(choice != 6){
                        choice = 6;
                        buttonSquare.setBackground(Color.white);
                        buttonTriangle.setBackground(Color.white);
                        buttonLineV.setBackground(Color.white);
                        buttonCircle.setBackground(Color.white);
                        buttonLineH.setBackground(Color.white);
                        buttonEraser.setBackground(Color.green);
                    }else if (choice == 6) {
                        choice = 0;
                        buttonEraser.setBackground(Color.white);
                    }
                }
            }//void actionperformed
        };//end
    
    public static void main(String[] args) {
        
         new MsPaintKiller();
        
    }//end of main
    
}//end of class MsPaintKiller