
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener {
   JTextField t1,t2,t3,t4;
        JButton b1,b2;
        Choice c1;
    Signup(){
        
        setBounds(370,200,700,300);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.CYAN);
        p1.setBounds(0,0,400,300);
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
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(20,95,100,25);
        p1.add(l3);
        
         t3=new JTextField();
        t3.setBounds(160,95,170,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
          
        JLabel l4=new JLabel("Security Question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(20,130,125,25);
        p1.add(l4);
        
         c1=new Choice();
        c1.add("Your Fav Game?");
        c1.add("Midway or John Wick ");
        c1.add("Your Fav Player?");
        c1.add("Your fav LALIGA Team?");
        c1.setBounds(160,130,170,25);
        p1.add(c1);
        
         JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(20,165,125,25);
        p1.add(l5);
        
         t4=new JTextField();
        t4.setBounds(160,165,170,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
         ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image im1=im.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(im1);
        
         JLabel l6=new JLabel(im2);
         l6.setBounds(430,20,200,200);
         add(l6);
        
         b1=new JButton("Create");
        b1.setBounds(45,210,80,30);
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.green);
        b1.addActionListener(this);
        p1.add(b1);
        
         b2=new JButton("Back");
        b2.setBounds(180,210,80,30);
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.red);
        b2.addActionListener(this);
        p1.add(b2);
        
        setVisible(true);
                
    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
          String username= t1.getText();
          String name= t2.getText();
          String password= t3.getText();
          String security= c1.getSelectedItem();
          String answer= t4.getText();
        
        String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
          try{
              Conn con=new Conn();
               con.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "Account created Successfully");
              
              this.setVisible(false);
              new Login().setVisible(true);
          }catch(Exception e)
             
           {

              e.printStackTrace();

          }
        }
        else if(ae.getSource()==b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
            
   
    public static void main(String[] args) {
        
        new Signup();
        
    }
    
    
}
