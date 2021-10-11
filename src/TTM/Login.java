
package TTM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Login extends JFrame implements ActionListener {
    
     JButton b1,b2,b3;
     JTextField t1;
     JPasswordField p1;
    Login(){
        
       
        
        setBounds(400,230,650,300);
        setLayout(null);
        
        JPanel panel=new JPanel();
        panel.setBounds(0,0,300,260);
        panel.setBackground(new Color(131,193,233));
        panel.setLayout(null);
        add(panel);
        
        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image im1=im.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(im1);
        

         JLabel l1=new JLabel(im2);
         l1.setBounds(40,35,200,200);
         panel.add(l1);
         
         JPanel panel2=new JPanel();
         panel2.setLayout(null);
         panel2.setBackground(Color.GRAY);
         panel2.setBounds(330,18,285,235);
         add(panel2);
         
         JLabel l2=new JLabel("Username");
         l2.setBounds(40,30,100,25);
         l2.setFont(new Font("SAN_SERIE",Font.PLAIN,20));
        panel2.add(l2);
        
        t1=new JTextField();
        t1.setBounds(40,60,200,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(t1);
        
        JLabel l3=new JLabel("Password");
         l3.setBounds(40,90,100,25);
         l3.setFont(new Font("SAN_SERIE",Font.PLAIN,20));
        panel2.add(l3);
        
         p1=new JPasswordField();
        p1.setBounds(40,120,200,25);
        p1.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(p1);
        
         b1=new JButton("Login");
        b1.setBounds(40,150,90,30);
        b1.setBackground(Color.CYAN);
        b1.addActionListener(this);
        panel2.add(b1);
        
         b2=new JButton("Sign-up");
        b2.setBounds(150,150,90,30);
        b2.setBackground(Color.blue);
        b2.setForeground(new Color(133,193,233));
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        b2.addActionListener(this);
        panel2.add(b2);
        
        
         b3=new JButton("Forgot Password");
        b3.setBounds(40,190,110,30);
        b3.setBackground(Color.red);
        b3.setForeground(Color.BLACK);
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        b3.addActionListener(this);
        panel2.add(b3);
        
        
         
          JLabel l4=new JLabel("Trouble in Login...");
          l4.setForeground(Color.red);
         l4.setBounds(165,197,110,20);
         
        panel2.add(l4);
         
         
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
        
        if(ae.getSource()==b1){
             try{
                String username=t1.getText();
                String password=p1.getText();
                String sql="select * from account where username='"+username+"'AND password='"+password+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }
            }catch(Exception e){
                 e.printStackTrace();
        }
            
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
            new Signup().setVisible(true);
        }
        else if(ae.getSource()==b3){
            this.setVisible(false);
            new Forgotpassword().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
