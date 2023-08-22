/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fernando
 */
public class DBaseOperaciones {

    public void insertContacto(String nombre, String apellido, int celular, String email) {
        String query = "INSERT INTO Contactos (nombre, apellido, celular, email) VALUES (?, ?, ?, ?)";

        try (Connection connection = ConexionBaseDatos.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, celular);
            preparedStatement.setString(4, email);

            preparedStatement.executeUpdate();
            System.out.println("Registro insertado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteContacto(int celular) {
        String query = "DELETE FROM Contactos WHERE celular = ?";

        try (Connection connection = ConexionBaseDatos.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, celular);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún registro para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void selectContactos() {
        String query = "SELECT * FROM Contactos";

        try (Connection connection = ConexionBaseDatos.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                int celular = resultSet.getInt("Celular");
                String email = resultSet.getString("eMail");

                System.out.println("Nombre: " + nombre + ", Apellido: " + apellido +
                                   ", Celular: " + celular + ", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
