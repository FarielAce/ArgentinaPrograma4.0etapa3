package construirsa.ej2.guia4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 2 de la guia 4
 * base de datos construirSA se realiza un CRUD (Create (Crear), Read (Leer), 
 *                                              Update (Actualizar) y Delete (Borrar))
 * Nota: el borrado es logico, es decir se da de baja mediante el cambio de estado de la variable;
 * @author Fernando Ariel Acevedo
 */
public class ConstruirSAEj2Guia4 {

    public static void main(String[] args) {
        //  insertarHerramientas();
        //  listarHerramientas();
        darBaja();
    }
 /**
     * cambia el estado logico de la variable estado a 0 para hacer un borrado
     * logico del empleado con el id 1
     */
    public static void darBaja(){
     String SQL = "UPDATE `empleado` SET `Estado`='0' WHERE idEmpleado = 1";
     PreparedStatement ps;
     
        try {
            ps = conecta().prepareStatement(SQL);
            int estado = ps.executeUpdate();
            if (estado > 0 ) {
                System.out.println("se ha actualizado correctamente");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConstruirSAEj2Guia4.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
 /**
  * lista las herramientas con stock mayor a 10
  */
   public static void listarHerramientas(){
   String SQL = "SELECT * FROM `herramienta` WHERE Stock > 10";
   PreparedStatement ps;
   ResultSet resultado;
        try {
            ps = conecta().prepareStatement(SQL);
            resultado = ps.executeQuery();
            while(resultado.next()){
                System.out.println(" "+
                        "\n Nombre: " + resultado.getString("Nombre")+
                        "\n Descripcion:  " + resultado.getString("Descripción")+
                        "\n Stock: " + resultado.getString("Stock"));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConstruirSAEj2Guia4.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   
   
   }
/**
 * inserta una herramienta en la base de datos
 */
    public static void insertarHerramientas() {
        String SQL = "INSERT INTO `herramienta`(`Nombre`, `Descripción`, `Stock`, `Estado`) "
                + "VALUES ('Taladro','Con percutor','10','1')";
        PreparedStatement ps;
        try {
            ps = conecta().prepareStatement(SQL);
            int conseguido = ps.executeUpdate();
            if (conseguido > 0) {
                System.out.println("Se agrego correctamente la herramienta");
            } else {
                System.out.println("no se realizaron modificaciones");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConstruirSAEj2Guia4.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
/**
 * agrega un empleado por paramentro utilizando la conexion que se realiza en conecta();
 */
    public static void agregarEmpleado() {
        String SQL = "INSERT INTO empleado(`DNI`, `Nombre`, `Apellido`, `Acceso`, `Estado`)"
                + "VALUES (25638956,'Gerardo', 'Gonzales', 1 , 1)";
        PreparedStatement ps;
        try {
            ps = conecta().prepareStatement(SQL);
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                System.out.println("se Agrego correctamente");
            } else {
                System.out.println("no se agrego el dato");
            }
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }

    }
 /**
  * retorna la conexion para los demas metodos estaticos
  * @return 
  */
    public static Connection conecta() {
        Connection conexion = null;
        try {

            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mariadb://192.168.10.6:3306/construirsa", "test", "1234qwer");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConstruirSAEj2Guia4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConstruirSAEj2Guia4.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
