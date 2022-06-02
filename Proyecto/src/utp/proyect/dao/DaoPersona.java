package utp.proyect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.entidades.Doctor;

public class DaoPersona {
	Connection conn = SingletonConexion.obtenerConexion();
	
	String tipo_rol = "";
	
	public  String  obtenerRol(int id_usuario) {
		Connection conn = SingletonConexion.obtenerConexion();		
		String sql = "SELECT  tr.nombre FROM USUARIOS u "
				+ " inner join tipo_roles tr "
				+ " on tr.id_tipo_rol = u.id_tipo_rol "
				+ " WHERE id_usuario = " + id_usuario;
		
		ResultSet rs;
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.executeQuery();
			rs = stm.executeQuery();
			while(rs.next()) {
				tipo_rol = rs.getString("nombre");					
			}									
			SingletonConexion.cerrarConexion(conn);	
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}		
		if( tipo_rol.length() > 0 ) 				
		{			
			return tipo_rol;
		}				
											
		return tipo_rol;
	
	}


	
}
