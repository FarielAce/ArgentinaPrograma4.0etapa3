/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author fernando
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://192.168.10.6:3306/universidadEjemplo";
    private static final String USER = "test";
    private static final String PASS = "1234qwer";
         
    public static Connection getConexion(){
        Connection conexion = null;   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR DE CONEXION CON EL SERVIDOR");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DRIVER");
        }
    return conexion;
    }
}
