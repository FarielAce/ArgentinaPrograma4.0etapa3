/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author fernando
 */
public class Inscripcion {
    private int idIscripcion;
    private int idAlumno;
    private int idMateria;
    private int nota;

    public Inscripcion() {
    }

    public Inscripcion(int idIscripcion, int idAlumno, int idMateria, int nota) {
        this.idIscripcion = idIscripcion;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public Inscripcion(int idAlumno, int idMateria, int nota) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public int getIdIscripcion() {
        return idIscripcion;
    }

    public void setIdIscripcion(int idIscripcion) {
        this.idIscripcion = idIscripcion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
