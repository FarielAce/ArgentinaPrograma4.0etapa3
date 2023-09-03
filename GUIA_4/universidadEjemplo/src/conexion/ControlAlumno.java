/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import conexion.Conexion;
import logica.Alumno;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author fernando
 */
public class ControlAlumno {
    private String SQL;
    private PreparedStatement ps;
    public void agregarAlumno(Alumno nuevo){
        Date fecha = Date.valueOf(nuevo.getFechaNac()); // se convierte de localDate a SQL date 
    SQL = "INSERT INTO `alumnos`(`dni`, `apellido`, `nombre`, `fechaNac`, `estado`) "
            + "VALUES "+ nuevo.getDni() + nuevo.getApellido() + nuevo.getNombre() 
            + fecha + nuevo.getEstado();
    
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            int estado = ps.executeUpdate();
            if (estado > 0){
                JOptionPane.showMessageDialog(null, "Se agrego correctamente al alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL" + ex);
            
            
            
          }
    
    
    }
    public void editaAlumno(Alumno editado){
         
    SQL ="UPDATE alumnos SET dni = " + editado.getDni() +
            "apellido = " + editado.getApellido()+
            "nombre = " + editado.getNombre() + 
            "fechaNac = " + Date.valueOf(editado.getFechaNac()) + 
            "estado = " + editado.getEstado() + 
            "WHERE idAlumno = "+editado.getIdAlumno();
    
        try {
            ps = Conexion.getConexion().prepareStatement(SQL);
            int resultado = ps.executeUpdate();
            if (resultado > 0){
            JOptionPane.showMessageDialog(null, "se ha editado correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public Alumno pedirAlumno(Alumno solicitar){
    SQL = "SELECT * FROM alumno WHERE "+ solicitar.getIdAlumno();
    ResultSet resultado;
    Alumno encontrado = null;
        try {
             ps = Conexion.getConexion().prepareStatement(SQL);
            resultado = ps.executeQuery();
            int id = resultado.getInt("idAlumno");
            int dni = resultado.getInt("dni");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            LocalDate fechaNac = resultado.getDate("fechaNac").toLocalDate();
            int estado = resultado.getInt("estado");
            encontrado = new Alumno(id, dni, nombre, apellido, fechaNac, estado);
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    return encontrado;
    }
    
    public List<Alumno> listarAlumno(){
             List<Alumno> listaAlumnos =new ArrayList();
            SQL = "SELECT * FROM alumnos";
            
        try {
       
            ps = Conexion.getConexion().prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
            int id = resultado.getInt("idAlumno");
            int dni = resultado.getInt("dni");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            LocalDate fechaNac = resultado.getDate("fechaNac").toLocalDate();
            int estado = resultado.getInt("estado");
           Alumno encontrado = new Alumno(id, dni, nombre, apellido, fechaNac, estado);
           listaAlumnos.add(encontrado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    return listaAlumnos;
    }
    
}
