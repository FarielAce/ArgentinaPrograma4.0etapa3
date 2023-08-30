/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaprueba;

import com.mycompany.jpaPrueba.logica.Alumno;
import com.mycompany.jpaPrueba.logica.Controladora;
import com.mycompany.jpaPrueba.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author fernando
 */
public class JpaPrueba {

    public static void main(String[] args) {
       Controladora control = new Controladora();
        Alumno alu = new Alumno(20, "Cristian", "Gonzalez",new Date() );
      control.crearAlumno(alu);
      control.elimnarAlumno(15);
    }
}
