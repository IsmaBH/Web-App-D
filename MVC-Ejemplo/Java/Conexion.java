import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Conexion {
    private static Connection cn = null;
    //Es importante poner en el url el tipo de zona horaria usada de lo contrario
    //Al correr la aplicacion mandara un splException de la zona horaria
    private static String url = "jdbc:mysql://localhost/test?useUnicode=true"
    +"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //El usuario y contraseña cambiarlos por los que se esten utilizando
    private static String usuario = "root";
    private static String contrasena = "root";
   
    public static Connection getConexion() throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection(url, usuario, contrasena);
        return cn;
    }
}