/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import conexion.*;
import java.time.LocalDate;
import java.util.List;
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
        ControlAlumno cAlum = new ControlAlumno();
        
        Alumno alu1 = new Alumno(29985354, "Fernando ", "Acevedo", LocalDate.of(1983, 4, 28), 1);
        Alumno alu2 = new Alumno(29987678, "Cristina ", "Perez", LocalDate.of(1983, 4, 28), 1);
        Alumno alu3 = new Alumno(23876098, "Alejandro ", "Conzales", LocalDate.of(1983, 4, 28), 1);
        
        cAlum.agregarAlumno(alu1);
        cAlum.agregarAlumno(alu2);
        cAlum.agregarAlumno(alu3);
        mostrarLista(cAlum.listarAlumno());
        
        Alumno aluedit = new Alumno(23876099, "Alejandro ", "Conzales", LocalDate.of(1983, 4, 28), 1);
        cAlum.editaAlumno(aluedit);
        cAlum.pedirAlumno(aluedit);
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
