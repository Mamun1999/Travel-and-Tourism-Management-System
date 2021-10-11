
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Forgotpassword extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4,t5;
        JButton b1,b2,b3;
      
  Forgotpassword(){
        
        setBounds(370,200,700,300);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setBounds(0,0,450,300);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(20,25,100,25);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(160,25,170,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(20,60,100,25);
        p1.add(l2);
        
         t2=new JTextField();
        t2.setBounds(160,60,170,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Your Sceurity Quetion");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(20,95,100,25);
        p1.add(l3);
        
         t3=new JTextField();
        t3.setBounds(160,95,220,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
          
        JLabel l4=new JLabel("Answer");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(20,130,125,25);
        p1.add(l4);
        
        t4=new JTextField();
        t4.setBounds(160,130,170,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
    
        JLabel l5=new JLabel("Password");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(20,165,125,25);
        p1.add(l5);
        
        t5=new JTextField();
        t5.setBounds(160,165,170,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
       
          
        
         ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image im1=im.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(im1);
        
         JLabel l6=new JLabel(im2);
         l6.setBounds(460,20,200,200);
         add(l6);
        
         b1=new JButton("Search");
        b1.setBounds(340,25,100,25);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.CYAN);
        b1.addActionListener(this);
        p1.add(b1);
        
         b2=new JButton("Restore");
        b2.setBounds(340,130,100,25);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.cyan);
        b2.addActionListener(this);
                
        p1.add(b2);
        
         b3=new JButton("Back");
        b3.setBounds(210,210,80,30);
        b3.setFont(new Font("Tahoma",Font.BOLD,14));
        b3.setBackground(Color.red);
        b3.addActionListener(this);
        p1.add(b3);
        
        
                
    }
  public void actionPerformed (ActionEvent ae){
      Conn c=new Conn();
      if(ae.getSource()==b1){
          try{
              String sql="select * from account where username='"+t1.getText()+"'";
              ResultSet rs=c.s.executeQuery(sql);
              while(rs.next()){
                  t2.setText(rs.getString("name"));
                  t3.setText(rs.getString("security"));
              }
          }catch(Exception e){
              
          }
                  
      }
      else if(ae.getSource()==b2){
          try{
          String sql="select * from account where answer='"+t4.getText()+"'AND username='"+t1.getText()+"'";
          ResultSet rs=c.s.executeQuery(sql);
          while(rs.next()){
              t5.setText(rs.getString("password"));
          }
          }
          catch(Exception e){
              
          }
      }
      else if(ae.getSource()==b3){
      this.setVisible(false);
      new Login().setVisible(true);
  }
              
               
  }
    public static void main(String[] args) {
        new Forgotpassword().setVisible(true);
    }
    

}