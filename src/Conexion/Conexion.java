package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kelly
 */
public class Conexion {
    public static Connection getConection(){
            String URL = "jdbc:sqlserver://localhost:1433;"+"database=BibliotecaMusical;"
            +"user=sa;"+"password=P@ssw0rd;"+ "encrypt=false;" + "trustServerCertificate=false;"+
            "driverFile=./mysql-connector-java-8.0.29.jar";
            Connection con = null;
            try{
                con = (Connection)DriverManager.getConnection(URL);
                System.out.println("Conectado");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return con;
    }
}
