/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            
            String url = "jdbc:mysql://159.65.12.91:3306/elephant";
            String user = "suka";
            String pass = "sukapass";
            
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
