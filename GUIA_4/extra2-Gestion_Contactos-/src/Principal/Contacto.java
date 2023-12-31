
package Principal;

/**
 *  @autor Fernando Ariel Acevedo
 *  Clase contacto 
 */
public class Contacto {
    private int id;
    private String nombre;
    private String apellido;
    private long numero;
    private String eMail;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, long numero, String eMail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.eMail = eMail;
    }

    public Contacto(int id, String nombre, String apellido, long numero, String eMail) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.eMail = eMail;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
}
