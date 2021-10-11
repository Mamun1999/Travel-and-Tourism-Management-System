
package TTM;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class splash {
    
    
    public static void main(String[] args) {
        
        splashFrame frame=new splashFrame();
        frame.setVisible(true);
        int x=1;
        for(int i=1; i<=500;i+=6, x+=7){
            frame.setLocation(700-(x+i)/2,370-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
       
            frame.setVisible(true);
    }
    
    
}
 class splashFrame extends JFrame implements Runnable {
     Thread tr;
     splashFrame(){
     ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
     Image im1=im.getImage().getScaledInstance(1080, 520, Image.SCALE_DEFAULT);
     ImageIcon im2=new ImageIcon(im1);

     JLabel l1=new JLabel(im2);
     add(l1);
     //setBounds(75,90,1200,600);
      
     tr =new Thread(this);
     tr.start();
     
 }
     
     
     @Override
     public void run(){
         try{
            Thread.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);
            
         }catch(Exception e){
             
         }
     }
 }