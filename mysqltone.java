package javaapplication5;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MJ
 */
public class mysqltone {

    
    public static Connection connectmysqldb() {
        
        try{
            String username = "root"; 
            String pass = "1234";
            String sql = "jdbc:mysql://localhost:3306/mysql";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sql,username,pass);
            
            return conn;
            
            
    
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
        
       
    }
    
}