/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DBase;

/**
 *
 * @author fernando
 */
public class DBtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         controlContacto databaseOperations = new controlContacto();

        // Insertar un nuevo contacto
        databaseOperations.insertContacto("Juan", "Pérez", 1234567890, "juan@example.com");

        // Recuperar y mostrar información de contactos
        databaseOperations.selectContactos();

        // Eliminar un contacto por número de celular
        //databaseOperations.deleteContacto(1234567890);
    }
    
}
