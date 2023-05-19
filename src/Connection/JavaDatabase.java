
package Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class JavaDatabase {
    Connection conn;
//conn objecteka la type connection ka la package java.sql da haya
    
   public static Connection connecrDp(){
       try{
           Class.forName("org.sqlite.JDBC");
          //create  connection to data base
           Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\LibraryDatabase.sqlite");
           return conn;
       }catch (Exception e){
        
           JOptionPane.showMessageDialog(null, e);
           //bo pishandani error basheway dialogue message
       return null;
       }
   } 
}
