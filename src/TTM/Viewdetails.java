
package TTM;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Viewdetails extends JFrame implements ActionListener {
    
     JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8;
    
    
    JButton b2;
             
    
      Viewdetails(String username){
          
          
          
           JLabel l0= new JLabel("Username");
           
           l0.setFont(new Font("Tahoma",Font.PLAIN,14));
           l0.setBounds(60,15,120,30);
           add(l0);
           
            JLabel l10= new JLabel();
           l10.setFont(new Font("Tahoma",Font.PLAIN,14));
           l10.setBounds(180,15,210,30);
           add(l10);
           
        
            
            ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
            Image im2=im.getImage().getScaledInstance(380,250,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(2,300,380,250);
            add(iconlabel);
            
             ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
            Image i2=i1.getImage().getScaledInstance(380,250,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel iconlabel2=new JLabel(i3);
            iconlabel2.setBounds(390,300,380,250);
            add(iconlabel2);
            
            
            JLabel l1= new JLabel("ID");
            l1.setFont(new Font("Tahoma",Font.PLAIN,14));
            l1.setBounds(60,65,120,30);
            add(l1);
            
              JLabel l11= new JLabel();
           l11.setFont(new Font("Tahoma",Font.PLAIN,14));
           l11.setBounds(180,65,210,30);
           add(l11);
           
            
            
            JLabel l2= new JLabel("Number");
            l2.setFont(new Font("Tahoma",Font.PLAIN,14));
            l2.setBounds(60,115,120,30);
            add(l2);
            
            JLabel l12= new JLabel();
           l12.setFont(new Font("Tahoma",Font.PLAIN,14));
           l12.setBounds(180,115,210,30);
           add(l12);
            
            JLabel l3= new JLabel("Name");
            l3.setFont(new Font("Tahoma",Font.PLAIN,14));
            l3.setBounds(60,165,120,30);
            add(l3);
            
            JLabel l13= new JLabel();
           l13.setFont(new Font("Tahoma",Font.PLAIN,14));
           l13.setBounds(180,165,210,30);
           add(l13);
            
            
            
            JLabel l4= new JLabel("Gender");
            l4.setFont(new Font("Tahoma",Font.PLAIN,14));
            l4.setBounds(60,215,140,30);
            add(l4);
            
             JLabel l14= new JLabel();
           l14.setFont(new Font("Tahoma",Font.PLAIN,14));
           l14.setBounds(180,215,210,30);
           add(l14);
            
                
            
            
            JLabel l5= new JLabel("Country");
            l5.setFont(new Font("Tahoma",Font.PLAIN,14));
            l5.setBounds(400,15,140,30);
            add(l5);
             
           JLabel l15= new JLabel();
           l15.setFont(new Font("Tahoma",Font.PLAIN,14));
           l15.setBounds(550,15,210,30);
           add(l15);
            
             JLabel l6= new JLabel("Address");
            l6.setFont(new Font("Tahoma",Font.PLAIN,14));
            l6.setBounds(400,65,150,30);
            add(l6);
          
             JLabel l16= new JLabel();
           l16.setFont(new Font("Tahoma",Font.PLAIN,14));
           l16.setBounds(550,65,210,30);
           add(l16);
            
            
           
            
            JLabel l7= new JLabel("Phone");
            l7.setFont(new Font("Tahoma",Font.PLAIN,14));
            l7.setBounds(400,115,120,30);
            add(l7);
            
              JLabel l17= new JLabel();
           l17.setFont(new Font("Tahoma",Font.PLAIN,14));
           l17.setBounds(550,115,210,30);
           add(l17);
            
           
            
              JLabel l8= new JLabel("Email");
            l8.setFont(new Font("Tahoma",Font.PLAIN,14));
            l8.setBounds(400,155,120,30);
            add(l8);
            
             JLabel l18= new JLabel();
           l18.setFont(new Font("Tahoma",Font.PLAIN,14));
           l18.setBounds(550,155,210,30);
           add(l18);
          
            
             b2=new JButton("Back");
            b2.setBounds(240,280,120,30);
            b2.setBackground(Color.red);
            b2.addActionListener(this);
            add(b2);
            
            
            
            
                    
            
          
            
        
        getContentPane().setBackground(Color.white);
        
        setBounds(315,100,800,550);
        setLayout(null);
        setVisible(true);
        
          try{
              Conn c=new Conn();
              
              ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
              while(rs.next()){
                  l10.setText(rs.getString("username"));
                  l12.setText(rs.getString("number"));
                  l13.setText(rs.getString("name"));
                  l15.setText(rs.getString("country"));
                  l16.setText(rs.getString("address"));
                  l17.setText(rs.getString("phone"));
                  l18.setText(rs.getString("email"));
                  l11.setText(rs.getString("Id"));
                  l14.setText(rs.getString("gender"));
                  
                  
              }
          }catch(Exception e){
             
          }
          
          
      }
    
    public void actionPerformed(ActionEvent ae){
        
         if(ae.getSource()==b2){
            this.setVisible(false);
        }  
             
    }     
            
    
    
    public static void main(String[] args) {
        new Viewdetails("");
    }
}

