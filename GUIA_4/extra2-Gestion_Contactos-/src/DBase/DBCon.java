package DBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fernando
 */
public class DBCon {

    private static final String URL = "jdbc:mysql://192.168.10.6:3306/testContacto";
    private static final String USER = "test"; // Cambiar por tu nombre de usuario
    private static final String PASSWORD = "1234qwer"; // Cambiar por tu contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    
}


