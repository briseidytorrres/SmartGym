package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {
public static Connection getConexion() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/gym";
			String usuario = "root";
			String contraseña ="";
			
			con = DriverManager.getConnection(url,usuario,contraseña);		
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error: carga de driver fallida");
		}catch(SQLException e) {
			System.out.println("Error: no hay conexion con la BD");
			e.printStackTrace();
		}
		return con;
	}
}
