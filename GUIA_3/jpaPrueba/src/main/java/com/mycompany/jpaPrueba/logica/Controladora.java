
package com.mycompany.jpaPrueba.logica;

import com.mycompany.jpaPrueba.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    public void elimnarAlumno(int id){
        controlPersis.elimnarAlumno(id);
    }
}
