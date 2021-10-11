
package TTM;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class Loading extends JFrame implements Runnable {
    Thread t;
    private JProgressBar p;

    String username;
    
    public void run(){
        
        try{
            for(int i=1;i<=101;i++){
                int m=p.getMaximum();
                int n=p.getValue();
                if(n<m){
                    p.setValue(p.getValue()+1);
                }
                else{
                    i=101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            
                
            
            
        }
        
        
    }
    Loading(String user){
         username=user;
        t=new Thread(this);
        setBounds(430,250,470,320);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        
        JLabel l1=new JLabel("Travel and Tourism Aplicatiion");
        l1.setBounds(70,20,350,30);
        l1.setForeground(Color.darkGray);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(130,70,180,20);
        add(p);
        
        JLabel l2=new JLabel("Please wait...");
        l2.setBounds(185,100,200,25);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l2);
        
        
         JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(10,250,200,25);
        l3.setForeground(Color.red);
        l3.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l3);
        t.start();
    }
    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }
}
