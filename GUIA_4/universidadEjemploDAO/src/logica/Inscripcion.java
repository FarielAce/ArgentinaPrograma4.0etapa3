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
    private int id;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idIscripcion, Alumno alumno, Materia materia, double nota) {
        this.id = idIscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdIscripcion() {
        return id;
    }

    public void setIdIscripcion(int idIscripcion) {
        this.id = idIscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idIscripcion=" + id + '}' + alumno.getApellido() + ", " + materia.getNombre();
    }

    
}
