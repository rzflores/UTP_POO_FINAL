package utp.proyect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.entidades.Consulta;
import utp.proyect.entidades.Doctor;
import utp.proyect.entidades.Paciente;
import utp.proyect.interfaces.ICrudDao;
import utp.proyect.interfaces.IListarConsultasDao;

public class DaoPaciente implements ICrudDao<Paciente> , IListarConsultasDao  {

	@Override
	public ArrayList<Paciente> listar() {
		Connection conn = SingletonConexion.obtenerConexion();
		ArrayList<Paciente> lst = new ArrayList<Paciente>();
		String sql = "select * from Doctor where id_tipo_rol = 3";
		Connection cnx = conn;
		ResultSet rs;
		try {
			PreparedStatement stm = cnx.prepareStatement(sql);
			stm.executeQuery();
			rs = stm.executeQuery();
			while(rs.next()) {
				
				Paciente tmp = new Paciente();											
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
	public Paciente buscarPorId(int idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean crear(Paciente p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarPorId(int idPaciente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Paciente p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Consulta> listarConsultas(int parametro) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	

}
