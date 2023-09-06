/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.*;
/**
 *
 * @author fernando
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sql = "INSERT INTO alumnos(dni, apellido, nombre, fechaNac, estado )"
                + " VALUES ('?', '?', '?', '?', '?'),";
        
        Connection conexion;
        PreparedStatement ps;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://192.168.10.6:3306/construir", "test", "1234qwer");
            
            ps = conexion.prepareStatement(sql);
            ps.setInt(0, 29785365);
            ps.setString(1, "Masa");
            ps.setString(2, "Gonzalo");
            ps.setDate(3, Date.valueOf("1999-02-14"));
            ps.setInt(4, 1);
            
            int correcto = ps.executeUpdate();
           if(correcto > 0){
               System.out.println("se agrego correctamente");
           }else{
               System.out.println("no se agrego");
           }
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
//        ControlAlumno cAlum = new ControlAlumno();
//        
//        Alumno alu1 = new Alumno(29985354, "Fernando ", "Acevedo", LocalDate.of(1983, 4, 28), 1);
//        Alumno alu2 = new Alumno(29987678, "Cristina ", "Perez", LocalDate.of(1983, 4, 28), 1);
//        Alumno alu3 = new Alumno(23876098, "Alejandro ", "Conzales", LocalDate.of(1983, 4, 28), 1);
//        
//        cAlum.agregarAlumno(alu1);
//        cAlum.agregarAlumno(alu2);
//        cAlum.agregarAlumno(alu3);
//        mostrarLista(cAlum.listarAlumno());
//        
//        Alumno aluedit = new Alumno(23876099, "Alejandro ", "Conzales", LocalDate.of(1983, 4, 28), 1);
//        cAlum.editaAlumno(aluedit);
//        cAlum.pedirAlumno(aluedit);
    }
    
public static void mostrarLista(List mostrar){

    for (Object object : mostrar) {
        if (object instanceof Alumno) {
            Alumno ver= (Alumno) object;
            System.out.println("----/n"+ver.toString());
            
        }
    }
}
}
