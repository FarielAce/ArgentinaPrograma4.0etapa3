/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import logica.Alumno;
import logica.Materia;
import logica.Inscripcion;

/**
 *
 * @author fernando
 */
public final class ControlInstripcion extends DAO{
    private String SQL;
    private PreparedStatement ps;
    
    private void inscribir(Alumno alumno, Materia materia, int nota){
    int idAlu = alumno.getIdAlumno();
    int idMat = materia.getIdMateria();
    
    SQL = "INSERT INTO `inscripciones`( `idAlumno`, `idMateria`, `nota`) VALUES ('?','?','?')";
        try {
            conectar();
            ps = conexion.prepareStatement(SQL);
            ps.setInt(0, idAlu);
            ps.setInt(1, idMat);
            ps.setInt(1, nota);
            int estado = ps.executeUpdate();
            if (estado>0) {
                JOptionPane.showMessageDialog(null, "Inscripcion correcta");
            }
        } catch (Exception e) {
            
        }finally{
        desconectar();
        }
    
    }
 
    private void eliminarInscripcion(Inscripcion eliminar){
        int id = eliminar.getIdIscripcion();
        SQL = "DELETE FROM `inscripciones` WHERE idInscripcion = ?";
        try {
            conectar();
            ps = conexion.prepareStatement(SQL);
            ps.setInt(0, id);
            int estado = ps.executeUpdate();
            if (estado>0) {
                JOptionPane.showMessageDialog(null, "se ha eliminado la inscripcion");
            }
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
    }
    private void editarInscripcion(Inscripcion editar){
        int idInscri = editar.getIdIscripcion();
        int 
        
    }
    private void borrarInscripcion(Inscripcion eliminar){
        int id = eliminar.getIdIscripcion();
        SQL = "UPDATE `inscripciones` SET  FROM `inscripciones` WHERE idInscripcion = ?";
        try {
            conectar();
            ps = conexion.prepareStatement(SQL);
            ps.setInt(0, id);
            int estado = ps.executeUpdate();
            if (estado>0) {
                JOptionPane.showMessageDialog(null, "se ha eliminado la inscripcion");
            }
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
    }
}
