
package src;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Database {
     private static Database instance;
    
     public static Database getInstance() {
        // Create the instance if it's null
        if (instance == null) {
            instance = new Database();
            
            String url = "jdbc:sql6.freesqldatabase.com:3306/sql6702245";
            String user = "sql6702245";
            String pass = "5EjAx8cGNr";
            
            try {
                instance.connect(url, user, pass);
                System.out.println("connected to database");
            } catch (java.lang.Exception ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                instance.con = null;
            }
        }
        return instance;
    }
    
    private Database(){}
    
    public Connection con;
    
    public void connect(String url, String username, String pass) throws java.lang.Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, pass);
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw Exception("Connection error");
        }
    }
    
    
//    public void runSql(String q){
//        
//    }

    private Exception Exception(String connection_error) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     
}
