/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 * DATA ACCESS OBJECT
 */
public abstract class DAO {

    protected Connection conexion = null; //define variables generales
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    protected PreparedStatement ps = null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";  //"org.mariadb.jdbc.Driver" en caso de utilizar el de mariadb
    private final String URLS = "jdbc:mysql://192.168.10.6:3306/";
    private final String DATABASE = "universidadEjemplo";
    private final String USER = "test";
    private final String PASS = "1234qwer";

    protected void conectar() {
        String URL = URLS + DATABASE + "?useSSL=false";
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION CON EL SERVIDOR");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DRIVER");
        }

    }

    protected void desconectar() {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void insertar(String sql){
        try {
            conectar();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
           
        } catch (SQLException ex) {
             Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
             //conexion.rollback();
        }finally{
         desconectar();
        }
    
    
    }
    
    protected void consulta(String sql){
        try {
            conectar();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        }catch(SQLException ex){
             Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            desconectar();
        }
    
    }
}
