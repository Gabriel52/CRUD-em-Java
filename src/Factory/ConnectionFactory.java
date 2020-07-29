/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author gabri
 */
public class ConnectionFactory {
    
    public static Connection getConnection(){
        final String myServer = "jdbc:mysql://127.0.0.1:3307/mercado";
        final String user = "root";
        final String psw = "";
        
        try{
            return DriverManager.getConnection(myServer, user, psw);
            
        }catch(SQLException error){
            throw new RuntimeException(error);
            
        }
    }
}
