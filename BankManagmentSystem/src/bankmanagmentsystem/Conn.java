
package bankmanagmentsystem;

import java.sql.*;

public class Conn {
    // Catching errors block:
    // getting connection : 
    Connection c;
    Statement s;
    
    public Conn()
    {
        try {
    //importing sql file 
            
    // getting connection :   
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagersystem" , "root" , "506066983");
            s = c.createStatement();
        } catch ( Exception e){
        System.out.println(e);
    }
    }    
}
