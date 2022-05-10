package utp.proyect.patrones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonConexion {
	
	
	private static Connection instancia = null;
	private String driver;
	private String url;
	private String usuario;
	private String password;

	private SingletonConexion() 
	{
		String url = "jdbc:postgresql://127.0.0.1:5432/dbOdonto";
		String usuario = "postgres";
		String clave = "123456";
		String driver = "org.postgresql.Driver";
		
		try
		{
			Class.forName(driver);
			instancia = DriverManager.getConnection(url, usuario, clave);
			System.out.println("conectado ala bd");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("Error=" + e);
		}
		
	};
	
	public static Connection obtenerConexion() 
	{
		 if(instancia == null) {					
			 new SingletonConexion();
		 }
		 return instancia; 
	}	
}
		      	
	
	
	
	
	

