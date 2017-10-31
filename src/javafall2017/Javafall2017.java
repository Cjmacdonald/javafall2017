package javafall2017;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author camma
 */
public class Javafall2017 {
     public static void main(String[] args) 
     {
        Javafall2017 app = new Javafall2017();
        app.run();
    }
     
    private Connection conn = null;
     
    public Connection getConnection(){
        String url = 
"jdbc:sqlite: C:\Users\camma\Documents\NetBeansProjects\javafall2017.db";
        try{
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            Logger.getLogger(Javafall2017.class.getName()).log(Level.SEVERE, 
null, e);
        }
        return conn;
    }
      
    public void createNewDatabase(){
        try (Connection conn = getConnection()){
            if (conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Connection has been established.");
                System.out.println("The driver name is " + 
meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e){
            Logger.getLogger(Javafall2017.class.getName()).log(Level.SEVERE, 
null, e);
        }
    }
     
      public void createNewTable() 
      {
        String sql = "CREATE TABLE IF NOT EXISTS library(\n"
                + "bookName string NOT NULL,\n"
                + "pages int"
	                + ");";
        
        try (Connection conn = getConnection()) {
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("Table was created successfully.");
        } catch (SQLException e){
            Logger.getLogger(Javafall2017.class.getName()).log(Level.SEVERE, 
null, e);
        }
    }
      
      public void insert(String _bookName, int _pages) 
      {
        String sql = "INSERT INTO library(bookName,pages) VALUES(?,?)";
 
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) 
                {
                    pstmt.setString(1, _bookName);
                    pstmt.setInt(2, _pages);
                    pstmt.executeUpdate();
                } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
      
      public void PrintTable(){
        String sql = "SELECT bookName, pages FROM library";
        try (Connection conn = getConnection()){
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                System.out.println(resultSet.getString("bookName") + "\t"
                        + resultSet.getInt("pages"));
            }
        } catch (SQLException e){
            Logger.getLogger(Javafall2017.class.getName()).log(Level.SEVERE, 
null, e);
        }
    }
      
      public void run()
      {
        createNewDatabase();
        createNewTable();
        insert("Hatchet", 111);
        insert("Moby Dick", 234);
        insert("To Kill a Mocking Bird", 123);
        PrintTable();
      }
}
