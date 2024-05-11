
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
    public Connection con;
    private Database() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/wildlifedatabase","root","bbw@8138");
            System.out.println("Connection Successfully...");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static Database getInstance(){
        if(instance == null)
            instance = new Database();
        return instance;
    }
    
    public Connection getConnection(){
        return con;
    }       
}
