
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JLabel;


public class Dashboard extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    String username;
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
         
        JPanel p1=new JPanel();
        setLayout(null);
         p1.setBounds(0,0,1400,60);
         p1.setBackground(Color.BLUE);
         add(p1);
        
        JLabel l2=new JLabel("DashBoard");
        
        l2.setBounds(10,10,200,35);
        l2.setFont(new Font("Tahoma",Font.BOLD,30));
        l2.setForeground(Color.WHITE);
        p1.add(l2);
             
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,60,250,700);
        p2.setBackground(Color.BLUE);
        add(p2);
        
        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image im1=im.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(im1);
         JLabel l1=new JLabel(im2);
         l1.setBounds(0,0,1500,700);
         add(l1);
        
        b1=new JButton("Add Personel Details");
        b1.setBounds(0,20,200,35);
        b1.setFont(new Font("Tahoma",Font.PLAIN,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        p2.add(b1);
        
         b2=new JButton("Update Personal Details");
        b2.setBounds(0,50,200,35);
        b2.setFont(new Font("Tahoma",Font.PLAIN,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        p2.add(b2);
        
          b3=new JButton("View Details");
        b3.setBounds(0,80,200,35);
        b3.setFont(new Font("Tahoma",Font.PLAIN,14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        p2.add(b3);
        
          b4=new JButton("Delete Personel Details");
        b4.setBounds(0,110,200,35);
      
        b4.setFont(new Font("Tahoma",Font.PLAIN,14));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        p2.add(b4);
        
          b5=new JButton("Check Package");
        b5.setBounds(0,140,200,35);
        
        b5.setFont(new Font("Tahoma",Font.PLAIN,14));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        p2.add(b5);
        
          b6=new JButton("Book Package");
        b6.setBounds(0,170,200,35);
       
        b6.setFont(new Font("Tahoma",Font.PLAIN,14));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        p2.add(b6);
        
          b7=new JButton("View Package");
        b7.setBounds(0,200,200,35);
       
        b7.setFont(new Font("Tahoma",Font.PLAIN,14));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        p2.add(b7);
        
          b8=new JButton("View Hotels");
        b8.setBounds(0,230,200,35);
       
        b8.setFont(new Font("Tahoma",Font.PLAIN,14));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.addActionListener(this);
        p2.add(b8);
        
          b9=new JButton("Book Hotel");
        b9.setBounds(0,260,200,35);
        b9.setFont(new Font("Tahoma",Font.PLAIN,14));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.addActionListener(this);
        p2.add(b9);
        
          b10=new JButton("View booked Hotel");
        b10.setBounds(0,290,200,35);
        b10.setFont(new Font("Tahoma",Font.PLAIN,14));
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.addActionListener(this);
        p2.add(b10);
        
        b11=new JButton("Destinations");
        b11.setBounds(0,320,200,35);
        b11.setFont(new Font("Tahoma",Font.PLAIN,14));
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.addActionListener(this);
        p2.add(b11);
        
        b12=new JButton("Payment ");
        b12.setBounds(0,350,200,35);
        b12.setFont(new Font("Tahoma",Font.PLAIN,14));
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.addActionListener(this);
        p2.add(b12);
        
        b13=new JButton("Calculator");
        b13.setBounds(0,380,200,35);
        b13.setFont(new Font("Tahoma",Font.PLAIN,14));
        b13.setBackground(Color.BLACK);
        b13.setForeground(Color.WHITE);
        b13.addActionListener(this);
        p2.add(b13);
        
        b14=new JButton("Notpad");
        b14.setBounds(0,410,200,35);
        b14.setFont(new Font("Tahoma",Font.PLAIN,14));
        b14.setBackground(Color.BLACK);
        b14.setForeground(Color.WHITE);
        b14.addActionListener(this);
        p2.add(b14);
        
        b15=new JButton("About");
        b15.setBounds(0,440,200,35);
        b15.setFont(new Font("Tahoma",Font.PLAIN,14));
        b15.setBackground(Color.BLACK);
        b15.setForeground(Color.WHITE);
        b15.addActionListener(this);
        p2.add(b15);
        
       JLabel l3=new JLabel("Travel and Tourism Management System");
       l3.setBounds(430,80,800,50);
       l3.setForeground(Color.BLUE);
       l3.setFont(new Font("Tahoma",Font.BOLD,35));
       l1.add(l3);
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                
            }
           
        }
        else if(ae.getSource()==b14){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true);
        }
        else if(ae.getSource()==b2){
            new Updatecustomer(username).setVisible(true);
        }
        else if(ae.getSource()==b3){
            new Viewdetails(username).setVisible(true);
            //this.setVisible(false);
        }
         else if(ae.getSource()==b5){
            new Checkpackjage().setVisible(true);
        }
        else if(ae.getSource()==b6){
            new Bookpackage(username).setVisible(true);
        }
         else if(ae.getSource()==b7){
            new Packagedetails(username).setVisible(true);
        }
         else if(ae.getSource()==b11){
            new Destination().setVisible(true);
        }
        else if(ae.getSource()==b8){
            new Checkhotels().setVisible(true);
            
        }
        else if(ae.getSource()==b9){
            new Bookhotel(username).setVisible(true);
            
        }
         else if(ae.getSource()==b10){
            new Bookedhotel(username).setVisible(true);
            
        }
        else if(ae.getSource()==b12){
            new Payments().setVisible(true);
            
        }
        else if(ae.getSource()==b4){
            new Deletecustomer(username).setVisible(true);
            
        }
        else if(ae.getSource()==b15){
            new About().setVisible(true);
            
        }
    }
       
    
    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
}
