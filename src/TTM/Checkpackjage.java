
package TTM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JTabbedPane;


public class Checkpackjage extends JFrame {
    
    Checkpackjage(){
        setBounds(350,100,800,600);
        
        String[] package1=new String[]{"Gold Package","6 days and  nights","Airport Assistance","Half Day City Tour","Daily Buffet","Wellcome Drinks On arrival","Full Day £ Island Cruis","English Speaking Guide","BOOK NOW","SUMMER SPECIAL","MRP 1500/-","package1.jpg"};
        //String[] package2=new String[]{"Silver Package","5 Days and 6 Nighs","Toll Free and Entrace Free tickets","Meet and  Greet at Airport","Welcome SDrinks at Arrival","Night Safary","Full Day 3 Island Cruis","BOOK NOW","WINTER SPECIAL","MRP 1300/-","package2.jpg"};
        String[] package2=new String[]{"Silver Package","5 Days and 6 Nighs","Toll Free and Entrace Free tickets","Meet and  Greet at Airport","Daily Buffet","Night Suffery","Full Day £ Island Cruis","English Speaking Guide","BOOK NOW","WINTER SPECIAL","MRP 1400/-","package2.jpg"}; 
        String[] package3=new String[]{"Bronze Package","6 days 5 nights","Return Airfare","Meet and  Greet at Airport","Daily Buffet","Night Suffery","Full Day £ Island Cruis","English Speaking Guide","BOOK NOW","WINTER SPECIAL","MRP 1300/-","package3.jpg"};
        JTabbedPane pane= new JTabbedPane();
        
        JPanel p1=createPackage(package1);
        pane.addTab("Package 1",null, p1);
        
         JPanel p2=createPackage(package2);
        pane.addTab("Package 2",null, p2);
        
        JPanel p3= createPackage(package3);
        pane.addTab("Package 3",null, p3);
        add(pane, BorderLayout.CENTER);
        
        
    }
    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,40);
        l1.setFont(new Font("Tahoma",Font.PLAIN,30));
        p1.add(l1);
        
         JLabel l2=new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);
        
        
         JLabel l3=new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);
        
        JLabel l5=new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(30,310,300,30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(30,360,300,30);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[8]);
        l9.setBounds(30,430,300,30);
        l9.setForeground(Color.blue);
        l9.setFont(new Font("Tahoma",Font.PLAIN,30));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[9]);
        l10.setBounds(300,480,300,30);
        l10.setForeground(Color.red);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l10);
        
          JLabel l11=new JLabel(pack[10]);
        l11.setBounds(630,480,300,20);
        l11.setForeground(Color.red);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l11);
        
        try{
         ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image im1=im.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(im1);
         JLabel label=new JLabel(im2);
         label.setBounds(340,35,400,300);
         p1.add(label);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return p1;
    }
    
    public static void main(String[] args) {
        new Checkpackjage().setVisible(true);
               
    }
}
