
package TTM;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class AddCustomer extends JFrame implements ActionListener {
    
     JTextField t0,t1,t2,t3,t4,t5,t6;
    JComboBox combo;
    Choice choice;
    JRadioButton radio1,radio2;
    JButton b1,b2;
    
      AddCustomer(String username){
          
           JLabel l0= new JLabel("Username");
           
           l0.setFont(new Font("Tahoma",Font.PLAIN,14));
           l0.setBounds(60,15,120,30);
           add(l0);
           
           t0=new JTextField();
           t0.setBounds(250,15,140,30);
           add(t0);
           
            
            ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
            Image im2=im.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(430,40,400,400);
            add(iconlabel);
            
            
            JLabel l1= new JLabel("ID");
            l1.setFont(new Font("Tahoma",Font.PLAIN,14));
            l1.setBounds(60,65,120,30);
            add(l1);
             combo=new JComboBox(new String[]{"Passport", "National_ID_Card","Driving_license"});
             combo.setBackground(Color.white);
             combo.setBounds(250,65,140,30);
             add(combo);
            
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
            
            radio1 =new JRadioButton("Male");
            radio1.setBackground(Color.white);
            radio1.setBounds(250,205,65,30);
            add(radio1);
            
             radio2 =new JRadioButton("Female");
             radio2.setBackground(Color.white);
            radio2.setBounds(315,205,70,30);
            add(radio2);
            
            
            
            
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
            
            b1=new JButton("Add Customer");
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
        
        setBounds(295,100,750,550);
        setLayout(null);
        setVisible(true);
        
          try{
              Conn c=new Conn();
              
              ResultSet rs=c.s.executeQuery("select * from account where username='"+username+"'");
              while(rs.next()){
                  t0.setText(rs.getString("username"));
                  t2.setText(rs.getString("name"));
              }
          }catch(Exception e){
              
          }
          
          
      }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        String username=t0.getText();
        String Id=(String)combo.getSelectedItem();
         String number=t1.getText();
          String name=t2.getText();
          String gender=null;
          if(radio1.isSelected()){
              gender="male";
          }else if(radio2.isSelected()){
              gender="Female";
          }
        
         String country=t3.getText();
          String address=t4.getText();
           String phone=t5.getText();
            String email=t6.getText();
            
            String query="insert into customer values('"+username+"','"+Id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Added");
                this.setVisible(false);
            }catch(Exception e){}
        }
            else if(ae.getSource()==b2){
                   this.setVisible(false);
                    }
    }     
            
    
    
    public static void main(String[] args) {
        new AddCustomer("");
    }
}
