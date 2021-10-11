
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JLabel;


public class Bookhotel extends JFrame implements ActionListener {
    Choice c1,c2,c3;
    JTextField t1, t2,t3,t4;
    JLabel l21,l22,l23,l24,l25;
    JButton b1,b2,b3;
    Bookhotel(String username){
        
        setBounds(270,100,900,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
            JLabel l1=new JLabel("BOOK HOTEL");
            l1.setBounds(75,15,330,30);
            l1.setForeground(Color.BLUE);
            l1.setFont(new Font("Tahoma",Font.BOLD,24));
            add(l1);
            
             JLabel l2=new JLabel("Username");
            l2.setBounds(20,75,150,25);
            l2.setFont(new Font("Tahoma",Font.BOLD,14));
            add(l2);
            
             l21=new JLabel();
            l21.setBounds(170,75,200,25);
            l21.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l21);
            
            JLabel l3=new JLabel("Select Hotel");
            l3.setBounds(20,115,150,25);
            l3.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l3);
            
            c1=new Choice();
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from hotel");
                while(rs.next()){
                    c1.add(rs.getString("name"));
                }
            }catch(Exception e){}
            
            
            c1.setBounds(170,115,200,25);
            add(c1);
            
             JLabel l4=new JLabel("Total Person");
            l4.setBounds(20,155,150,25);
            l4.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l4);
            
            t1=new JTextField();
            t1.setBounds(170,155,200,25);
            add(t1);
            
             JLabel l5=new JLabel("No of Days");
            l5.setBounds(20,195,150,25);
            l5.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l5);
            
            t2=new JTextField();
            t2.setBounds(170,195,200,25);
            add(t2);
            
            JLabel l6=new JLabel("Ac/ Non-Ac");
            l6.setBounds(20,235,150,25);
            l6.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l6);
            
            c2=new Choice();
            c2.add("Yes");
            c2.add("No");
            c2.setBounds(170,235,200,25);
            add(c2);
            
            JLabel l7=new JLabel("Food Included");
            l7.setBounds(20,275,150,25);
            l7.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l7);
            
            c3=new Choice();
            c3.add("Yes");
            c3.add("No");
            c3.setBounds(170,275,200,25);
            add(c3);
            
            JLabel l8=new JLabel("ID");
            l8.setBounds(20,315,150,25);
            l8.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l8);
            
            l22=new JLabel();
            l22.setBounds(170,315,200,25);
            add(l22);
            
             JLabel l9=new JLabel("Number");
            l9.setBounds(20,355,150,25);
            l9.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l9);
            
            l23=new JLabel();
            l23.setBounds(170,355,200,25);
            add(l23);
            
             JLabel l10=new JLabel("Phone");
            l10.setBounds(20,395,150,25);
            l10.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l10);
            
            l24=new JLabel();
            l24.setBounds(170,395,200,25);
            add(l24);
            
            JLabel l11=new JLabel("Total Price");
            l11.setBounds(20,435,150,25);
            l11.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l11);
            
            l25=new JLabel();
            l25.setBounds(170,435,200,25);
            l25.setForeground(Color.red);
            add(l25);
            
            try{
                Conn c=new Conn();
               ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
               while(rs.next()){
                   l21.setText(rs.getString("username"));
                   
                           
                   l22.setText(rs.getString("Id"));
                   l23.setText(rs.getString("number"));
                   l24.setText(rs.getString("phone"));
               }
            }catch(Exception e){}
            
            b1=new JButton("Check Price");
            b1.setBounds(20,485,120,30);
            b1.setBackground(Color.cyan);
            b1.setForeground(Color.white);
            b1.addActionListener(this);
            add(b1);
            
             b2=new JButton("Book");
            b2.setBounds(158,485,90,30);
            b2.setBackground(Color.GREEN);
            b2.setForeground(Color.white);
            b2.addActionListener(this);
            add(b2);
            
             b3=new JButton("Back");
            b3.setBounds(270,485,90,30);
            b3.setBackground(Color.red);
            b3.setForeground(Color.white);
           b3.addActionListener(this);
            add(b3);
            
             ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
            Image im2=im.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(440,60,500,450);
            add(iconlabel);
            
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
          try{
             Conn c=new Conn();
             ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"' ");
              while(rs.next()){
                  int cost=Integer.parseInt(rs.getString("cost_per_day"));
                  int food=Integer.parseInt(rs.getString("food_charges"));
                  int ac=Integer.parseInt(rs.getString("ac_charges"));
                 int person=Integer.parseInt(t1.getText());
                 int days=Integer.parseInt(t2.getText());
                 
                 String acprice=c2.getSelectedItem();
                 String foodprice=c3.getSelectedItem();
                 
                 if(person * days>0){
                     int total=0;
                     total +=acprice.equals("Yes") ? ac:0;
                     total+= foodprice.equals("Yes")? food:0;
                     total+=cost;
                     total= total*person*days;
                     l25.setText(""+total);
                 }else{
                     l25.setText("Please enter a valid Number");
                 }
              }
          }catch(Exception e){}
       }
       else if(ae.getSource()==b2){
           try{
               Conn c=new Conn();
               c.s.executeUpdate("insert into bookhotel values('"+l21.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l22.getText()+"','"+l23.getText()+"','"+l24.getText()+"','"+l25.getText()+"')");
               JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
               this.setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
       }
       else if(ae.getSource()==b3){
           this.setVisible(false);
       }
   }  
        
    
    
    public static void main(String[] args) {
        new Bookhotel("").setVisible(true);
    }
}
