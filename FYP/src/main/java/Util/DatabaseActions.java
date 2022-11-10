/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LukeF
 */
public class DatabaseActions {
    
    public Connection connectDB(){
        Connection dbConn = null;
        String url = "jdbc:sqlite:C:\\Users\\LukeF\\Documents\\NetBeansProjects\\FYP\\MyDatabase.db";
        
        try{
            Class.forName("org.sqlite.JDBC");
            System.out.println("Connection to database");
            dbConn = DriverManager.getConnection(url,"LukeF","password");
            System.out.println("Database Connected");
           
            PreparedStatement stmt = dbConn.prepareStatement("SELECT * FROM Patients");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                System.out.println(rs.getString(1));
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }return dbConn;
    }
}
