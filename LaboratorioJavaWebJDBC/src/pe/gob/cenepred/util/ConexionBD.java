package pe.gob.cenepred.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	
	//comentario simple
	
	//comentario de varias lineas
	/*
	 * 
	 * 
	 * 
	 * 
	 * +/
	 */
	
	/*public static Connection obtenerConexion() throws SQLException {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbcenepred?autoReconnect=true&useSSL=false",
						"root", "root.2019");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}*/
	
	public static Connection obtenerConexion() throws SQLException {

		//SI ES UNO MySQL 
		//SINO Postgress
		Connection con = null;
		try {
			 
			//debemos colocar el driver de la base de datos postgres, dentro de la carpeta lib  
			Class.forName("org.postgresql.Driver");
			
			//modificar la url 
			con = DriverManager.getConnection("jdbc:postgresql://localhost/dbcenepred",
						"postgres", "root.2019");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}


}
