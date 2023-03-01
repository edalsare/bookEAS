
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    public static final String url = "jdbc:mysql://localhost:3306/libreria_eas";
    public static final String usuario = "root";
    public static final String pass = "";
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexion" + e);
        }
        return conexion;
    }
    
}
