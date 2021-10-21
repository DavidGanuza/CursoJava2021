package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static	Connection conexion;

	public ConnectionManager() {	}
	
	public static void conectar() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inetum", "root", "D*2021uza");
	}
	
	public static Connection getConexion() {
		return conexion;
	}
	
	public static void desconectar() throws SQLException {
		conexion.close();
	}
}
