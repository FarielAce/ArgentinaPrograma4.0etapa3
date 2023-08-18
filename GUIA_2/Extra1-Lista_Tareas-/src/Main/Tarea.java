
package Main;

/**
 *
 * @author fernando
 */
public class Tarea implements Comparable{
    private String nombre;
    private String descripcion;
    private Estado estado;

    public Tarea(String nombre, String descripcion, Estado enCurso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = enCurso;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Object T) {
        Tarea t = (Tarea) T;
   if(estado.equals(t.getEstado())){
       return 0;
   }else if (estado.equals(Estado.EnCurso)){
       return -1;
   }else{
       return 1;
   }
    }

    
    
    
}
