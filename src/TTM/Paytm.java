
package TTM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Paytm extends JFrame implements ActionListener {
       Paytm(){
           JEditorPane j=new JEditorPane();
           j.setEditable(false);
           
           try
           {j.setPage("https://paytm.com/credit-card-bill-payment");
               
           }catch(Exception e){
               j.setContentType("text/html");
               j.setText("<html>Could not Load, Error 404</html>");
           }
           JScrollPane  js=new JScrollPane(j);
           getContentPane().add(js);
           
           JButton b1=new JButton("Back");
           b1.setBounds(590,2,80,40);
           b1.addActionListener(this);
           add(b1);
           
           setBounds(270,100,900,600);
           setLayout(null);
       }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }
}
