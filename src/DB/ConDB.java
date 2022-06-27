package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDB {
    Connection con;
    String controlador = "com.mysql.jdbc.Driver";
    String db = "reciclajedb";
    String url="jdbc:mysql://localhost:3306/"+db;
    String user="root";
    String pass="";
    
    private final String driver = "com.mysql.jdbc.Driver";
    
    
    public Connection conectardb(){
        try {
            Class.forName(controlador);
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("error al activar DB: " + e);
        }
        return con;
    }
    
     public Connection getConexion() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error 1: " + e.getMessage());
        }
        
        return null;
    }   
    
    
}
