/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import persistencia.DAO;
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
public final class ControlAlumno extends DAO{

    private String SQL;
   
    public void agregarAlumno(Alumno nuevo) {
      //  Date fecha = Date.valueOf(nuevo.getFechaNac()); // se convierte de localDate a SQL date 
        SQL = "INSERT INTO `alumnos`(`dni`, `apellido`, `nombre`, `fechaNac`, `estado`) "
                + "VALUES (`?`,`?`,`?`,`?`,`?`)";

        try {
            conectar();
            ps = conexion.prepareStatement(SQL);
            ps.setInt(0, nuevo.getDni());
            ps.setString(1, nuevo.getApellido());
            ps.setString(2, nuevo.getNombre());
            ps.setDate(3, Date.valueOf(nuevo.getFechaNac()));
            ps.setBoolean(4, nuevo.isEstado());
            int estado = ps.executeUpdate();
                     
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Se agrego correctamente al alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL" + ex);

        }finally{
        desconectar();
        }

    }

    public void editaAlumno(Alumno editado) {

        SQL = "INSERT INTO `alumnos`(`idAlumno`,`dni`, `apellido`, `nombre`, `fechaNac`, `estado`) "
                + "VALUES (`?`,`?`,`?`,`?`,`?`,`?`)";

        try {
            conectar();
            ps = conexion.prepareStatement(SQL);
            ps.setInt(0, editado.getIdAlumno());
            ps.setInt(1, editado.getDni());
            ps.setString(2, editado.getApellido());
            ps.setString(3, editado.getNombre());
            ps.setDate(4, Date.valueOf(editado.getFechaNac()));
            ps.setBoolean(5, editado.isEstado());

            int resul = ps.executeUpdate();
            if (resul > 0) {
                JOptionPane.showMessageDialog(null, "se ha editado correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        desconectar();
        }

    }

    public Alumno pedirAlumno(Alumno solicitar) {
        SQL = "SELECT * FROM alumno WHERE " + solicitar.getIdAlumno();
        
        Alumno encontrado = null;
        
        try {
            conectar();
            insertar(SQL);
            int id = resultado.getInt("idAlumno");
            int dni = resultado.getInt("dni");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            LocalDate fechaNac = resultado.getDate("fechaNac").toLocalDate();
            boolean estado = resultado.getBoolean("estado");
            encontrado = new Alumno(id, dni, nombre, apellido, fechaNac, estado);
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        desconectar();
        }
        return encontrado;
    }

    public List<Alumno> listarAlumno() {
        List<Alumno> listaAlumnos = new ArrayList();
        SQL = "SELECT * FROM alumnos";

        try {

            conectar();
            insertar(SQL);

            while (resultado.next()) {
                int id = resultado.getInt("idAlumno");
                int dni = resultado.getInt("dni");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                LocalDate fechaNac = resultado.getDate("fechaNac").toLocalDate();
                boolean estado = resultado.getBoolean("estado");
                Alumno encontrado = new Alumno(id, dni, nombre, apellido, fechaNac, estado);
                listaAlumnos.add(encontrado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
        desconectar();
        }
        return listaAlumnos;
    }

}
