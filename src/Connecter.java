
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Connecter {
    Connection con;
    
    public Connecter(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.err.println(e);
        }
         try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books_change","root","");
        }catch(SQLException e){System.err.println(e);}
    }
    
    Connection obtenirconnexion(){
        return con;
    }
   
}
