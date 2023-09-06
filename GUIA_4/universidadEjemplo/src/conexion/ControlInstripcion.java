/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.*;
/**
 *
 * @author fernando
 */
public class ControlInstripcion {
     private String SQL;
    private PreparedStatement ps;

    public void inscribirse(Alumno alumno, Materia materia){
        SQL = "INSERT INTO `inscripciones`( `idAlumno`, `idMateria`, `nota`) VALUES ('?','?','?') ";
         try {
             ps = Conexion.getConexion().prepareStatement(SQL);
             int completado = ps.executeUpdate();
             if (completado > 0) {
                 JOptionPane.showMessageDialog(null, "Inscripcion agregada correctamente");
             }
         } catch (SQLException ex) {
             Logger.getLogger(ControlInstripcion.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    public void eliminarInscripcion(Inscripcion eliminar){
        int id  = eliminar.getIdIscripcion();
        SQL = "DELETE FROM `inscripciones` WHERE idInscripcion = ";
    }
}
