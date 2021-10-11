
package TTM;

import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
     Conn(){     
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
               c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","1217660984");
               s= c.createStatement();
        }catch(Exception e){
           
        }
        
    }
     public static void main(String[] args) {
        
    }
}
