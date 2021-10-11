
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class About extends JFrame implements ActionListener {
   
    JButton b1;
    String s;
    About(){
        
        
        setBounds(270,100,600,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
            JLabel l1=new JLabel("Tourism and Hotel Management System");
            l1.setBounds(60,15,500,30);
            l1.setForeground(Color.BLUE);
            l1.setFont(new Font("Tahoma",Font.BOLD,24));
            add(l1);
            
         s="About Project    \n"+"\n"+
                 
            "This is Travel and Tourism Management system project.\n"+
                 "For this project we had used Netbeans IDE \n";
        
       TextArea t1=new TextArea(s,10,40,Scrollbar.VERTICAL);
       t1.setEditable(false);                                                                                                                                                                                                                                                                                                                                                                
        t1.setBounds(90,80,400,300);
        t1.setBackground(Color.LIGHT_GRAY);
        add(t1);                                                                                                    
        
        b1=new JButton("Back");
        b1.setBounds(260,400,80,30);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
