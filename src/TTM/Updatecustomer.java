
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Updatecustomer extends JFrame implements ActionListener {
    
     JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8;
    
    
    JButton b1,b2;
    
      Updatecustomer(String username){
          
          JLabel update=new JLabel("Update Customer Details");
          update.setBounds(400,15,300,30);
          update.setFont(new Font("Tahoma",Font.BOLD,22));
          update.setForeground(Color.BLUE);
          add(update);
          
           JLabel l0= new JLabel("Username");
           
           l0.setFont(new Font("Tahoma",Font.PLAIN,14));
           l0.setBounds(60,15,120,30);
           add(l0);
           
           t0=new JTextField();
           t0.setBounds(250,15,140,30);
           add(t0);
           
            
            ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
            Image im2=im.getImage().getScaledInstance(250,320,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(430,80,200,330);
            add(iconlabel);
            
            
            JLabel l1= new JLabel("ID");
            l1.setFont(new Font("Tahoma",Font.PLAIN,14));
            l1.setBounds(60,65,120,30);
            add(l1);
            
            t7=new JTextField();
            t7.setBounds(250,65,140,30);
            add(t7);
            
            
            JLabel l2= new JLabel("Number");
            l2.setFont(new Font("Tahoma",Font.PLAIN,14));
            l2.setBounds(60,105,120,30);
            add(l2);
            
            t1=new JTextField();
            t1.setBounds(250,105,140,30);
            add(t1);
            
            JLabel l3= new JLabel("Name");
            l3.setFont(new Font("Tahoma",Font.PLAIN,14));
            l3.setBounds(60,155,120,30);
            add(l3);
            
            t2=new JTextField();
            t2.setBounds(250,155,140,30);
            add(t2);
            
            JLabel l4= new JLabel("Gender");
            l4.setFont(new Font("Tahoma",Font.PLAIN,14));
            l4.setBounds(60,205,140,30);
            add(l4);
            
            t8=new JTextField();
            t8.setBounds(250,205,140,30);
            add(t8);
            
            
            
            
            JLabel l5= new JLabel("Country");
            l5.setFont(new Font("Tahoma",Font.PLAIN,14));
            l5.setBounds(60,255,140,30);
            add(l5);
             
             t3=new JTextField();
            t3.setBounds(250,255,140,30);
            add(t3); 
            
            JLabel l6= new JLabel("Address");
            l6.setFont(new Font("Tahoma",Font.PLAIN,14));
            l6.setBounds(60,305,150,30);
            add(l6);
          
             t4=new JTextField();
            t4.setBounds(250,305,140,30);
            add(t4); 
            
           
            
            JLabel l7= new JLabel("Phone");
            l7.setFont(new Font("Tahoma",Font.PLAIN,14));
            l7.setBounds(60,355,120,30);
            add(l7);
            
            t5=new JTextField();
            t5.setBounds(250,355,140,30);
            add(t5); 
            
            
              JLabel l8= new JLabel("Email");
            l8.setFont(new Font("Tahoma",Font.PLAIN,14));
            l8.setBounds(60,405,120,30);
            add(l8);
            
            t6=new JTextField();
            t6.setBounds(250,405,140,30);
            add(t6); 
            
            b1=new JButton("Update");
            b1.setBackground(Color.green);
            b1.setBounds(65,455,140,30);
            b1.addActionListener(this);
            add(b1);
            
             b2=new JButton("Back");
            b2.setBounds(225,455,120,30);
            b2.setBackground(Color.red);
            b2.addActionListener(this);
            add(b2);
            
            
            
            
                    
            
          
            
        
        getContentPane().setBackground(Color.white);
        
        setBounds(315,100,750,550);
        setLayout(null);
        setVisible(true);
        
          try{
              Conn c=new Conn();
              
              ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
              while(rs.next()){
                  t0.setText(rs.getString("username"));
                  t1.setText(rs.getString("number"));
                  t2.setText(rs.getString("name"));
                  t3.setText(rs.getString("country"));
                  t4.setText(rs.getString("address"));
                  t5.setText(rs.getString("phone"));
                  t6.setText(rs.getString("email"));
                  t7.setText(rs.getString("Id"));
                  t8.setText(rs.getString("gender"));
                  
                  
              }
          }catch(Exception e){
             
          }
          
          
      }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
              String username=t0.getText();
              String Id=t7.getText();
              String number=t1.getText();
              String name=t2.getText();
              String gender=t8.getText();
              String country=t3.getText();
              String address=t4.getText();
              String phone=t5.getText();
              String email=t6.getText();
              
              String q="update customer set username ='"+username+"',Id='"+Id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
              try{
                  Conn c=new Conn();
                  c.s.executeUpdate(q);
                  JOptionPane.showMessageDialog(null, "Updated Successfully");
              this.setVisible(false);
              }catch(Exception e){
                   e.printStackTrace();
              }
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }  
             
    }     
            
    
    
    public static void main(String[] args) {
        new Updatecustomer("");
    }
}
