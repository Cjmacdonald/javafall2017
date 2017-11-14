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
     
    
      public void run()
      {
        boolean isBright = false;
        
        isBright = checkifbright(6);
        Printem(isBright);
         isBright = checkifbright(4);
        Printem(isBright);
         isBright = checkifbright(10);
        Printem(isBright);
         isBright = checkifbright(2);
        Printem(isBright);
       
        
      }
      
      public boolean checkifbright(int brightness)
      {
          if(brightness > 5)
          {
          
              return true;
          }
          else
          {
           
              return false;
          }
          
      }
      public void Printem(boolean temp)
      {
           if(temp == true)
        {
                System.out.println("Damn that bright! ");
        }
        else 
        {
                System.out.println("I cant see! "); 
        }
      }
      
}
