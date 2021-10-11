
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Bookpackage extends JFrame implements ActionListener {
       Choice c1; 
       JTextField t1;
       JLabel l11,l12,l13,l14,lusername;
       JButton b1,b2,b3;
    Bookpackage(String username){
        
        setBounds(330,110,850,480);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
         
            ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
            Image im2=im.getImage().getScaledInstance(350,270,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(430,45,350,270);
            add(iconlabel);
          
        JLabel l1=new JLabel("BOOK PACKAGE");
        l1.setBounds(65,15,230,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,26));
        add(l1);
        
        JLabel l2=new JLabel("Username");
        l2.setBounds(20,80,150,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l2);
        lusername=new JLabel();
        lusername.setBounds(170,80,200,25);
        add(lusername);
        
        JLabel l3=new JLabel("Select Package");
        l3.setBounds(20,120,150,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l3);
        
        c1=new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(170,120,200,25);
        
        add(c1);
        
        JLabel l4=new JLabel("Total Person");
        l4.setBounds(20,160,150,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l4);
        
        t1=new JTextField();
        t1.setBounds(170,160,200,25);
        add(t1);
        
        JLabel l5=new JLabel("ID:");
        l5.setBounds(20,200,150,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l5);
        
         l11 =new JLabel();
        l11.setBounds(170,200,150,25);
        l11.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l11);
        
        JLabel l6=new JLabel("Number");
        l6.setBounds(20,240,150,25);
        l6.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l6);
        
         l12 =new JLabel();
        l12.setBounds(170,240,150,25);
        l12.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l12);
       
        JLabel l7=new JLabel("Phone");
        l7.setBounds(20,280,150,25);
        l7.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l7);
        
         l13 =new JLabel();
        l13.setBounds(170,280,150,25);
        l13.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l13);
        
        JLabel l8=new JLabel("Total Price");
        l8.setBounds(20,320,150,25);
        l8.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l8);
        
         l14 =new JLabel();
        l14.setBounds(170,320,150,25);
        l14.setForeground(Color.red);
        l14.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l14);
       
        try{
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
           while(rs.next()){
               l11.setText(rs.getString("Id"));
               lusername.setText(rs.getString("username"));
               l12.setText(rs.getString("number"));
               l13.setText(rs.getString("phone"));
           }
        }catch(Exception e){
            
        }
        b1=new JButton("Check Price");
        b1.setBounds(30,370,110,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("Book Package");
        b2.setBounds(170,370,120,30);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
         b3=new JButton("Back");
        b3.setBounds(310,370,100,30);
        b3.setBackground(Color.red);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
                
        add(b3);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String p=c1.getSelectedItem();
            int cost=0;
            if(p.equals("Gold Package")){
                cost+=1500;
            }
            else if(p.equals("Silver Package")){
                cost+=1400;
            }
            else if(p.equals("Bronze Package")){
                cost+=1200;
            }
            
            int person=Integer.parseInt(t1.getText());
            cost*=person;
            l14.setText("Rs "+cost);
        }
        else if(ae.getSource()==b2){
            try{
                Conn c=new Conn();
                 c.s.executeUpdate("insert into bookPackage values('"+lusername.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l11.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"')");
                 JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                 this.setVisible(false);
                 
            }catch(Exception e){}
        }
         else if(ae.getSource()==b3){
            
        }
        
    }
    public static void main(String[] args) {
       new Bookpackage("").setVisible(true);
       
    }
}
