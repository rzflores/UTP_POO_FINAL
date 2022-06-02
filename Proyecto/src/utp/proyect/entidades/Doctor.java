package utp.proyect.entidades;

import java.util.ArrayList;

import utp.proyect.dao.DaoDoctor;
import utp.proyect.dao.DaoHistoriaClinica;
import utp.proyect.interfaces.IListarConsultas;

public class Doctor extends Persona implements IListarConsultas{
	private int idDoctor;
	private String codigoColegiatura;
	private double tiempoExperiencia;
	private TipoEspecialidad tipoEspecialidad;
	
	private DaoHistoriaClinica hcDao ;
	
	
	@Override
	public String toString() {
		return super.toString() + "Doctor [idDoctor=" + idDoctor + ", codigoColegiatura=" + codigoColegiatura + ", timepoExperiencia="
				+ tiempoExperiencia + ", tipoEspecialidad=" + tipoEspecialidad + "]";
	}



	public Doctor(int idDoctor, String codigoColegiatura, double tiempoExperiencia, TipoEspecialidad tipoEspecialidad) {
		super();
		this.idDoctor = idDoctor;
		this.codigoColegiatura = codigoColegiatura;
		this.tiempoExperiencia = tiempoExperiencia;
		this.tipoEspecialidad = tipoEspecialidad;
	}




	public Doctor() {
		
		hcDao = new DaoHistoriaClinica();
	};
	
	



	public int getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}	
	public String getCodigoColegiatura() {
		return codigoColegiatura;
	}
	public void setCodigoColegiatura(String codigoColegiatura) {
		this.codigoColegiatura = codigoColegiatura;
	}
	public double getTiempoExperiencia() {
		return tiempoExperiencia;
	}
	public void setTiempoExperiencia(double tiempoExperiencia) {
		this.tiempoExperiencia = tiempoExperiencia;
	}
	public TipoEspecialidad getTipoEspecialidad() {
		return tipoEspecialidad;
	}
	public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}



	@Override
	public ArrayList<Consulta> listarConsultas() {
		DaoDoctor daoD = new DaoDoctor();		
		return daoD.listarConsultas(this.idDoctor);
	}
	
	
	public boolean CrearHistoriaClinica( HistoriaClinica hc ) {
		hcDao.crear(hc);
		return true;
	}
	
	public ArrayList<HistoriaClinica> listarHistoriasClinicas(){
		return hcDao.listar();
	}
	
	public boolean editarHistoriaClinica(HistoriaClinica hc) {
		return hcDao.actualizar(hc);
	}
	
	public HistoriaClinica buscarPorIdHistoriaClinica(int idHistoriaClinica) {
		return hcDao.buscarPorId(idHistoriaClinica);
	}
	
	public boolean eliminarHistoriaClinica(int idHistoriaClinica) {
		return hcDao.eliminarPorId(idHistoriaClinica);
	}
	
	
	
}
