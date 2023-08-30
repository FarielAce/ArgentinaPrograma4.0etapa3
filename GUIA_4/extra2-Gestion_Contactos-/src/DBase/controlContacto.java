/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBase;

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

    public controlContacto() {// el el constructor del control se inicializa la conexion 
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
            System.out.println("Registro insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        }

    }

    public void deleteContacto(Contacto eliminar) {
        String query = "DELETE FROM Contactos WHERE idTabla = ?";
        int id = eliminar.getId();
        try {  
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
               JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "no se encontro contacto a eliminar");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Contacto> selectContactos() {
        ArrayList<Contacto> recuperado = new ArrayList();
        String query = "SELECT * FROM Contactos";

        try (Connection connection = DBCon.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {
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
            e.printStackTrace();
        }
        return recuperado;
    }
}
