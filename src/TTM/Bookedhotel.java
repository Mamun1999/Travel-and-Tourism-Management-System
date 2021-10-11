
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Bookedhotel extends JFrame implements ActionListener{
JLabel l21,l22,l23,l24,l25,l26,l27,l28,l29,l210;
    JButton b1,b2,b3;
    Bookedhotel(String username){
        
        setBounds(270,100,900,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
            JLabel l1=new JLabel("VIEW BOOKED HOTEL");
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
            
            JLabel l3=new JLabel(" Hotel Name");
            l3.setBounds(20,115,150,25);
            l3.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l3);
            
            l22=new JLabel();
            l22.setBounds(170,115,200,25);
            add(l22);
            
            JLabel l4=new JLabel("Total Person");
            l4.setBounds(20,155,150,25);
            l4.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l4);
            
    
            l23=new JLabel();
            l23.setBounds(170,155,200,25);
            add(l23);
            
            
             JLabel l5=new JLabel("Total Days");
            l5.setBounds(20,195,150,25);
            l5.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l5);
            
            l24=new JLabel();
            l24.setBounds(170,195,200,25);
            add(l24);
            
             JLabel l6=new JLabel("Food Included?");
            l6.setBounds(20,235,150,25);
            l6.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l6);
            
             l25=new JLabel();
            l25.setBounds(170,235,200,25);
            add(l25);
            
             JLabel l7=new JLabel("ID");
            l7.setBounds(20,275,150,25);
            l7.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l7);
            
             l26=new JLabel();
            l26.setBounds(170,275,200,25);
            add(l26);
            
            JLabel l8=new JLabel("Number");
            l8.setBounds(20,315,150,25);
            l8.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l8);
            
            l27=new JLabel();
            l27.setBounds(170,315,200,25);
            add(l27);
            
            
             JLabel l9=new JLabel("Phone");
            l9.setBounds(20,355,150,25);
            l9.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l9);
            
            l28=new JLabel();
            l28.setBounds(170,355,200,25);
            add(l28);
            
             JLabel l10=new JLabel("Ac");
            l10.setBounds(20,395,150,25);
            l10.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l10);
            
            l210=new JLabel();
            l210.setBounds(170,395,200,25);
            add(l210);
            
            JLabel l11=new JLabel("Total Cost");
            l11.setBounds(20,435,150,25);
            l11.setFont(new Font("Tahoma",Font.PLAIN,14));
            add(l11);
            
            l29=new JLabel();
            l29.setBounds(170,435,200,25);
            add(l29);
            
            ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
            Image im2=im.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT);
            ImageIcon im3=new ImageIcon(im2);
            JLabel iconlabel=new JLabel(im3);
            iconlabel.setBounds(440,60,500,450);
            add(iconlabel);
            
            b1=new JButton("Back");
            b1.setBounds(60,500,120,30);
            b1.setBackground(Color.red);
            b1.setForeground(Color.white);
            b1.addActionListener(this);
            add(b1);
            try{
                Conn c=new Conn();
               ResultSet rs=c.s.executeQuery("select * from bookhotel where username='"+username+"'");
               while(rs.next()){
                   l21.setText(rs.getString("username"));
            
                   l22.setText(rs.getString("hotel"));
                   l23.setText(rs.getString("person"));
                   l24.setText(rs.getString("days"));
                   l25.setText(rs.getString("food"));
            
                   l26.setText(rs.getString("Id"));
                   l27.setText(rs.getString("number"));
                   l28.setText(rs.getString("phone"));
                   l29.setText(rs.getString("cost"));
                    l210.setText(rs.getString("ac"));
               }
            }catch(Exception e){}
            
}
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        new Bookedhotel("").setVisible(true);
    }
    
}
