
package bd;

/**
 *
 * @author Wolf Cristian Fonseca
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/westbank", "root", "");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error general: " + ex.getMessage());
        }
        return connection;
    }

    public Connection obtenerConexion() {
        
        return conectar();
    }
}