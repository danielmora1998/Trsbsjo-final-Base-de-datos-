package capeonato;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danielmora
 */

public class Conexion {
    
    public static final String URL ="jdbc:mysql://localhost:8889/Campeonato"; // para evitar que me salga los mensajes de error ?autoReconnet=true&useSSL=false
    public static final String usuario= "root";
    public static final String contraseña="root";
    
    public Connection getConnection(){
        
        Connection conexion=null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
           conexion= DriverManager.getConnection(URL,usuario,contraseña);
           
        }
        catch(Exception ex){
            
            System.err.println("Error,"+ex);
        }

        return conexion;
}
    
    
    
}


