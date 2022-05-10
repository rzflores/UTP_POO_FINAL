package utp.proyect.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utp.proyect.entidades.Doctor;
import utp.proyect.interfaces.ICrud;
import utp.proyect.patrones.SingletonConexion;


public class DaoDoctor implements ICrud<Doctor>{

	Connection conn = SingletonConexion.obtenerConexion();
	
	
	
	
	
	public DaoDoctor() {
				
		
	}

	@Override
	public ArrayList<Doctor> listar() {
		
		ArrayList<Doctor> lst = new ArrayList<Doctor>();
		String sql = "select * from Doctor";
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
			cnx.close();		
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return lst;		
	}

	@Override
	public Doctor buscarPorId() {
		// TODO Auto-generated method stub
		Doctor tmp = new Doctor();	
		return tmp;
	}

	@Override
	public boolean crear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarPorId() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarPorId() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
