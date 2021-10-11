
package TTM;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Payments extends JFrame implements ActionListener {
    JButton b1,b2;
    Payments(){
        
        setBounds(270,100,900,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
         ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
            Image im2=im.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds((0),0,900,600);
            add(iconlabel);
            
             b1=new JButton("Pay");
            b1.setBounds(500,2,80,40);
            b1.setBackground(Color.red);
            b1.addActionListener(this);
                    
            iconlabel.add(b1);
            
           b2=new JButton("Back");
            b2.setBounds(600,2,90,40);
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.white);
            b2.addActionListener(this);
            iconlabel.add(b2);
            
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }
        
    }
    public static void main(String[] args) {
        new Payments().setVisible(true);
    }
}
