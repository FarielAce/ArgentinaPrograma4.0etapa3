
package main;

/**
 *  @autor Fernando Ariel Acevedo
 *  Clase contacto 
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private int numero;
    private String eMail;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, int numero, String eMail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.eMail = eMail;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
}
