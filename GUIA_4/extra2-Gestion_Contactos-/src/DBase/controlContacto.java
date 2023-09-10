/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBase;

import DBase.DBCon;
import Principal.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class controlContacto {

    private Connection conexion = null;
    /* a fin de evitar conexiones y cierre repetitivos opte por abrir la 
        conexion en el constructor y cerrarla al finalizar el programa;
    */
    public controlContacto() {
        try {
            conexion = DBCon.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(controlContacto.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 

    public void insertContacto(String nombre, String apellido, int celular, String email) {
        String query = "INSERT INTO Contactos (nombre, apellido, celular, email) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            sentencia.setInt(3, celular);
            sentencia.setString(4, email);

            sentencia.executeUpdate();
            //System.out.println("Registro insertado correctamente.");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "error de conexion con el servidor");
        }
    }

    public void insertContacto(Contacto nuevo) {
        String query = "INSERT INTO Contactos (nombre, apellido, celular, email) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, nuevo.getNombre());
            sentencia.setString(2, nuevo.getApellido());
            sentencia.setInt(3, (int) nuevo.getNumero());
            sentencia.setString(4, nuevo.geteMail());

            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contacto Agregado Correctamente");
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "error de conexion con el servidor");
        }

    }

    public void deleteContacto(Contacto eliminar) {
        String query = "DELETE FROM Contactos WHERE idTabla = ?";
        int id = eliminar.getId();
        System.out.println("id = " + id);
        try {  
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, id);

            int filaAfectada = preparedStatement.executeUpdate();
            if (filaAfectada > 0) {
               JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "no se encontro contacto a eliminar");
            }
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "error de conexion con el servidor");
        }
    }
         /**Esta es otra manera de manejar las conexion con el servidor 
         utilizando el bloque "try-with-resources", introducido en Java 7, que se 
        encarga automáticamente de cerrar los recursos abiertos al finalizar el 
        bloque try. Aquí, tanto la conexión (connection) como la sentencia preparada
        (preparedStatement) se inicializan dentro del bloque try-with-resources. Una 
        vez que el bloque try termina (ya sea normalmente o debido a una excepción), 
        los recursos se cierran automáticamente sin necesidad de un bloque finally 
        para realizar la limpieza manual
        **/
    public ArrayList<Contacto> selectContactos() {
        ArrayList<Contacto> recuperado = new ArrayList();
        String query = "SELECT * FROM Contactos";
          
        try (Connection connection = DBCon.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query); 
             ResultSet resultSet = preparedStatement.executeQuery()) {
            
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("idTabla"));
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int celular = resultSet.getInt("celular");
                String email = resultSet.getString("eMail");
                
                Contacto nuevo = new Contacto(id, nombre, apellido, celular, email);
                recuperado.add(nuevo);
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "error de conexion con el servidor");
        }
        return recuperado;
    }
    /* el siguiente metodo cierra la conexion con el servidor SQl 
        
    */
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
