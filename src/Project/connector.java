/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nikit
 */
public class connector {
   public static Connection getConnection() throws Exception
   {
       Class.forName("com.mysql.jdbc.Driver");
        Connection con;
       con = (Connection)  
               DriverManager.getConnection("jdbc:mysql://localhost:3306/bcadatabase","root","9823449060");
           return con;
   }
    
    
}
