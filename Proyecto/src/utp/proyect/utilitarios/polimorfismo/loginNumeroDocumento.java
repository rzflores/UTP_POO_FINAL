package utp.proyect.utilitarios.polimorfismo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.entidades.Administrador;
import utp.proyect.entidades.Persona;

public class loginNumeroDocumento extends loginPolimorfismo {

	int id_usuario  = 0;
	@Override
	public int login(String numeroDocumento , String contrasenia) {
		Connection conn = SingletonConexion.obtenerConexion();		
		String sql = "SELECT * FROM USUARIOS"
				+ " WHERE numero_documento = '"+numeroDocumento+"'"
				+ " and contrasenia = '"+contrasenia+"'";
		
		ResultSet rs;
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.executeQuery();
			rs = stm.executeQuery();
			while(rs.next()) {
				id_usuario = rs.getInt("id_usuario");					
			}									
			SingletonConexion.cerrarConexion(conn);	
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}		
		if( id_usuario!= 0) 				
		{			
			return id_usuario;
		}
			
											
		return id_usuario;
	
	}

	
}
