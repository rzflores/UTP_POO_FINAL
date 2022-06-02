package utp.proyect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.vistasUtilitarios.MenuPermisos;

public class DaoMenuPermisos {

	public  ArrayList<MenuPermisos>  obtenerMenuPermisos(int id_usuario) {
		Connection conn = SingletonConexion.obtenerConexion();	
		
		ArrayList<MenuPermisos> lst = new ArrayList<MenuPermisos>();
		String sql = "SELECT mtr.orden , me.nombre, mtr.es_activo FROM usuarios as u "
				+ "inner join menus_tipo_roles as mtr "
				+ "on mtr.id_tipo_rol = u.id_tipo_rol "
				+ "inner join menus me "
				+ "ON me.id_menu = mtr.id_menu "
				+ "where id_usuario = " + id_usuario;
		
		ResultSet rs;
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.executeQuery();
			rs = stm.executeQuery();
			while(rs.next()) {
				MenuPermisos tmp = new MenuPermisos();
				tmp.setNombre(rs.getString("nombre"));
				tmp.setEsActivo(rs.getBoolean("es_activo"));
				tmp.setOrden(rs.getInt("orden"));	
				lst.add(tmp);
			}									
			SingletonConexion.cerrarConexion(conn);	
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}		
				
											
		return lst;
	
	}
}
