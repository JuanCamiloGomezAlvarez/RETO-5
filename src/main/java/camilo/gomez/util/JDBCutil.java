
package camilo.gomez.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
    private static final String BASEDATOS = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:" + BASEDATOS;

        return DriverManager.getConnection(url);
    }

    
}
