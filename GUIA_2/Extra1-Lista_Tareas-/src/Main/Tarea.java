package Main;

/**
 *
 * @author fernando
 */
public class Tarea implements Comparable{

    private String nombre;
    private String descripcion;
    private boolean completada;
    private boolean eliminado;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        completada = false;
        eliminado = false;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public int compareTo(Object t) {
    Tarea Comp = (Tarea) t;
        if ( completada && Comp.isCompletada()) {
            return -1;
        }else{
            return 1;
        }
    }
    
}
