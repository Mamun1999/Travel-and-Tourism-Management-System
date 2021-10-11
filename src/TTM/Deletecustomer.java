
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Deletecustomer extends JFrame implements ActionListener{
    JButton b1,b2;
    String username;
    Deletecustomer(String user){
        this.username=user;
         getContentPane().setBackground(Color.white);
        
        setBounds(315,100,750,550);
        setLayout(null);
        
        
         JLabel l1=new JLabel("Delete Customer Details");
          l1.setBounds(190,15,300,30);
          l1.setFont(new Font("Tahoma",Font.BOLD,22));
          l1.setForeground(Color.BLUE);
          add(l1);
          
           JLabel l2= new JLabel("username");
           
           l2.setFont(new Font("Tahoma",Font.PLAIN,14));
           l2.setBounds(50,80,120,30);
           add(l2);
           
            JLabel l21= new JLabel();
           l21.setFont(new Font("Tahoma",Font.PLAIN,14));
           l21.setBounds(200,80,180,30);
           add(l21);
           
           JLabel l3= new JLabel("Name");
           
           l3.setFont(new Font("Tahoma",Font.PLAIN,14));
           l3.setBounds(50,120,120,30);
           add(l3);
           
            JLabel l22= new JLabel();
           l22.setFont(new Font("Tahoma",Font.PLAIN,14));
           l22.setBounds(200,120,180,30);
           add(l22);
           
           JLabel l4= new JLabel("Id");
           
           l4.setFont(new Font("Tahoma",Font.PLAIN,14));
           l4.setBounds(50,160,120,30);
           add(l4);
           
            JLabel l23= new JLabel();
           l23.setFont(new Font("Tahoma",Font.PLAIN,14));
           l23.setBounds(200,160,180,30);
           add(l23);
           
            JLabel l5= new JLabel("Number");
           
           l5.setFont(new Font("Tahoma",Font.PLAIN,14));
           l5.setBounds(50,200,120,30);
           add(l5);
           
            JLabel l24= new JLabel();
           l24.setFont(new Font("Tahoma",Font.PLAIN,14));
           l24.setBounds(200,200,180,30);
           add(l24);
           
            JLabel l6= new JLabel("Gender");
           
           l6.setFont(new Font("Tahoma",Font.PLAIN,14));
           l6.setBounds(50,240,120,30);
           add(l6);
           
            JLabel l25= new JLabel();
           l25.setFont(new Font("Tahoma",Font.PLAIN,14));
           l25.setBounds(200,240,180,30);
           add(l25);
           
           JLabel l7= new JLabel("Country");
           
           l7.setFont(new Font("Tahoma",Font.PLAIN,14));
           l7.setBounds(50,280,120,30);
           add(l7);
           
            JLabel l26= new JLabel();
           l26.setFont(new Font("Tahoma",Font.PLAIN,14));
           l26.setBounds(200,280,180,30);
           add(l26);
           
            JLabel l8= new JLabel("Address");
           
           l8.setFont(new Font("Tahoma",Font.PLAIN,14));
           l8.setBounds(50,320,120,30);
           add(l8);
           
            JLabel l27= new JLabel();
           l27.setFont(new Font("Tahoma",Font.PLAIN,14));
           l27.setBounds(200,320,180,30);
           add(l27);
           
           JLabel l9= new JLabel("Phone");
           
           l9.setFont(new Font("Tahoma",Font.PLAIN,14));
           l9.setBounds(50,360,120,30);
           add(l9);
           
            JLabel l28= new JLabel();
           l28.setFont(new Font("Tahoma",Font.PLAIN,14));
           l28.setBounds(200,360,180,30);
           add(l28);
           
            JLabel l10= new JLabel("Email");
           
           l10.setFont(new Font("Tahoma",Font.PLAIN,14));
           l10.setBounds(50,400,120,30);
           add(l10);
           
            JLabel l29= new JLabel();
           l29.setFont(new Font("Tahoma",Font.PLAIN,14));
           l29.setBounds(200,400,180,30);
           add(l29);
           
           try{
              Conn c=new Conn();
              ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
              while(rs.next()){
                 l21.setText(rs.getString("username"));
                  l22.setText(rs.getString("name"));
                  l23.setText(rs.getString("Id"));
                  l24.setText(rs.getString("number"));
                  l25.setText(rs.getString("gender"));
                  l26.setText(rs.getString("country"));
                  l27.setText(rs.getString("address"));
                  l28.setText(rs.getString("phone"));
                  l29.setText(rs.getString("email")); 
              }
                      
           }catch(Exception e){
               
           }
          b1=new JButton("Delete");
            b1.setBackground(Color.green);
            b1.setBounds(65,445,140,30);
            b1.addActionListener(this);
            add(b1);
            
             b2=new JButton("Back");
            b2.setBounds(225,445,100,30);
            b2.setBackground(Color.red);
            b2.addActionListener(this);
            add(b2);
        
             ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
            Image im2=im.getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(340,75,350,300);
            add(iconlabel);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("delete from account where username='"+username+"'");
                c.s.executeUpdate("delete from bookhotel where username='"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username='"+username+"'");
                c.s.executeUpdate("delete from customer where username='"+username+"'");
                
                JOptionPane.showMessageDialog(null,"Customer details deleted successfully");
                System.exit(0);
            }catch(Exception e){}
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Deletecustomer("").setVisible(true);
    }
}
