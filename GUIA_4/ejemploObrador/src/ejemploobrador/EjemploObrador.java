
package ejemploobrador;

import Logica.Empleado;
import persistence.ControlEmpleado;

/**
 *
 * @author fernando
 */
public class EjemploObrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ControlEmpleado control = new ControlEmpleado();
       
        for (Empleado emplea : control.listarEmpleados()) {
            System.out.println(emplea.toString()); 
        }
    }
    
}
