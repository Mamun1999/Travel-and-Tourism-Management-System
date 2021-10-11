
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Packagedetails extends JFrame implements ActionListener {
    
    
    JLabel lusername,pack,tp,id,num,ph,price;
    JButton b1;
    Packagedetails(String username){
        
         setBounds(330,110,900,450);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
            Image im2=im.getImage().getScaledInstance(350,270,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(460,35,400,310);
            add(iconlabel);
        
            JLabel l1=new JLabel("VIEW PACKAGE DETAILS");
            l1.setBounds(55,15,330,30);
            l1.setFont(new Font("Tahoma",Font.BOLD,24));
            add(l1);
            
             JLabel l2=new JLabel("Username");
        l2.setBounds(20,80,150,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l2);
        lusername=new JLabel();
        lusername.setBounds(170,80,200,25);
        add(lusername);
        
        JLabel l3=new JLabel("Package");
        l3.setBounds(20,120,150,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l3);
        
        pack =new JLabel();
        pack.setBounds(170,120,200,25);
        pack.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(pack);
        
         JLabel l4=new JLabel("Total Person");
        l4.setBounds(20,160,150,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l4);
        
        tp =new JLabel();
        tp.setBounds(170,160,200,25);
        tp.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tp);
        
         JLabel l5=new JLabel("ID:");
        l5.setBounds(20,200,150,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l5);
        
         id=new JLabel();
        id.setBounds(170,200,150,25);
        id.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(id);
        
        JLabel l6=new JLabel("Number");
        l6.setBounds(20,240,150,25);
        l6.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l6);
        
         num =new JLabel();
        num.setBounds(170,240,150,25);
        num.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(num);
       
        JLabel l7=new JLabel("Phone");
        l7.setBounds(20,280,150,25);
        l7.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l7);
        
         ph=new JLabel();
        ph.setBounds(170,280,150,25);
        ph.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(ph);
        
        JLabel l8=new JLabel("Price");
        l8.setBounds(20,320,150,25);
        l8.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l8);
        
         price =new JLabel();
        price.setBounds(170,320,150,25);
        price.setForeground(Color.red);
        price.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(price);
       
         b1=new JButton("Back");
        b1.setBounds(130,370,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from bookpackage where username='"+username+"'");
           while(rs.next()){
               lusername.setText(rs.getString("username"));
               pack.setText(rs.getString("package"));
               tp.setText(rs.getString("person"));
               id.setText(rs.getString("Id"));
               num.setText(rs.getString("number"));
               ph.setText(rs.getString("phone"));
               price.setText(rs.getString("price"));
                       
               
           }
        }catch(Exception e){}
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Packagedetails("").setVisible(true);
    }
 
}
