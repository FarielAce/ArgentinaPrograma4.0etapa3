/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import Logica.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class ControlEmpleado {

    private Connection conexion = null;

    public ControlEmpleado() {
        try {
            conexion = DBCon.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "conexion fallida");
            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Empleado> listarEmpleados(){
        ArrayList<Empleado> todos = new ArrayList();
        try {
            String SQL = "SELECT * FROM empleado";
            PreparedStatement ps = conexion.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                int id = resultado.getInt("idEmpleado");
                long dni = resultado.getInt("dni");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                int acceso = resultado.getInt("acceso");
                int estado = resultado.getInt("estado");
                Empleado encontrado = new Empleado(id, dni, nombre, apellido, acceso, estado);
                todos.add(encontrado);
            }
            
            }catch (SQLException ex) {
            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return todos; 
    }
}
