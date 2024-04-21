/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author User
 */
public class Data {
     private static Data instance;
    
     public static Data getInstance() {
        // Create the instance if it's null
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
     
     
     
}
