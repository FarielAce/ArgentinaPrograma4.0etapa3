
package guia2ej3.lista;

/**
 *
 * @author ferna
 */
public class Producto {
    private String tipo;
    private String descripcion;
    private String nombre;
    private Double precio;

    public Producto(String tipo, String descripcion, String nombre, Double precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
