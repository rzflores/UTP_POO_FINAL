package utp.proyect.entidades;

import java.util.ArrayList;

import utp.proyect.dao.DaoDoctor;
import utp.proyect.dao.DaoPaciente;
import utp.proyect.interfaces.IListarConsultas;

public class Paciente extends Persona implements IListarConsultas{
	private int idPaciente;
	private String celularTrabajo;
	private String direccion;
	private boolean esPrimeraVisita;
	

	
	


	public Paciente(int idPaciente, String celularTrabajo, String direccion, boolean esPrimeraVisita) {
		super();
		this.idPaciente = idPaciente;
		this.celularTrabajo = celularTrabajo;
		this.direccion = direccion;
		this.esPrimeraVisita = esPrimeraVisita;
	}



	@Override
	public String toString() {
		return  super.toString() + "Paciente [celularTrabajo=" + celularTrabajo + ", direccion=" + direccion + ", esPrimeraVisita="
				+ esPrimeraVisita + "]";
	}



	public Paciente() {};
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public boolean isEsPrimeraVisita() {
		return esPrimeraVisita;
	}
	
	
	public void setEsPrimeraVisita(boolean esPrimeraVisita) {
		this.esPrimeraVisita = esPrimeraVisita;
	}
	
	
	public String getCelularTrabajo() {
		return celularTrabajo;
	}
	public void setCelularTrabajo(String celularTrabajo) {
		this.celularTrabajo = celularTrabajo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public ArrayList<Consulta> listarConsultas() {
		DaoPaciente daoP = new DaoPaciente();		
		return daoP.listarConsultas(this.idPaciente);
	}
	
	
	
	
}
