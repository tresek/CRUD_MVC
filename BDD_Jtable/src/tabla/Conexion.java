
package tabla;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/almacen?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "Aabb123456";
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
           
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            System.err.print("Error, " + ex);
        }
        return conexion;

    }
    
}
