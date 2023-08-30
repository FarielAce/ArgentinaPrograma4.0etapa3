/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author fernando
 */
public class Empleado {
    private int id;
    private long dni;
    private String nombre;
    private String apellido;
    private int acceso;
    private int estado;

    public Empleado(int id, long dni, String nombre, String apellido, int acceso, int estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acceso = acceso;
        this.estado = estado;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAcceso() {
        return acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "---Empleado---" +
                "/n Id=" + id 
                +"/n dni=" + dni 
                +"/n nombre=" + nombre 
                +"/n apellido=" + apellido 
                +"/n acceso=" + acceso 
                +"/n estado=" + estado;
    }
    
    
    
}
