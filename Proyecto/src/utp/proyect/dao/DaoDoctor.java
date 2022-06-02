package utp.proyect.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.entidades.Consulta;
import utp.proyect.entidades.Doctor;
import utp.proyect.interfaces.ICrudDao;
import utp.proyect.interfaces.IListarConsultasDao;


public class DaoDoctor implements ICrudDao<Doctor> , IListarConsultasDao{

	
	
	
	
	
	
	public DaoDoctor() {
				
		
	}

	@Override
	public ArrayList<Doctor> listar() {
		Connection conn = SingletonConexion.obtenerConexion();	
		ArrayList<Doctor> lst = new ArrayList<Doctor>();
		String sql = "select * from Doctor where id_tipo_rol = 3";
		Connection cnx = conn;
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.executeQuery();
			rs = stm.executeQuery();
			while(rs.next()) {
				
				Doctor tmp = new Doctor();											
				lst.add(tmp);				
			}
			SingletonConexion.cerrarConexion(conn);			
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
					
		}
		return lst;		
	}

	@Override
	public Doctor buscarPorId(int idDoctor) {
		// TODO Auto-generated method stub
		Doctor tmp = new Doctor();	
		return tmp;
	}

	@Override
	public boolean crear(Doctor d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarPorId(int idDoctor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Doctor d) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	@Override
	public ArrayList<Consulta> listarConsultas(int parametro) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
