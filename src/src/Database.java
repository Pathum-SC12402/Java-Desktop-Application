/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;
import java.sql.*;

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
