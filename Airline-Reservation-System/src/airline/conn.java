package airline;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_reservation_system","root","123456");
            s = c.createStatement();
            
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  