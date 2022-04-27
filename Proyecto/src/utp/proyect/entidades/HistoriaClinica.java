package utp.proyect.entidades;

import java.util.ArrayList;
import java.util.Date;

public class HistoriaClinica {
	private int idHistoriaClinica;
	private Date fechaCreado;	
	private Date fechaModificado;	
	private ArrayList<Consulta> listaConsultas;
	private ArrayList<Observacion> listaObservaciones;
	private ArrayList<Odontograma> listaOdontogramas;
	private Paciente paciente;
	private Administrador administrador;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "HistoriaClinica [idHistoriaClinica=" + idHistoriaClinica + ", fechaCreado=" + fechaCreado
				+ ", fechaModificado=" + fechaModificado + ", listaConsultas=" + listaConsultas
				+ ", listaObservaciones=" + listaObservaciones + ", listaOdontogramas=" + listaOdontogramas
				+ ", paciente=" + paciente + ", administrador=" + administrador + "]";
	}
	

	public HistoriaClinica(int idHistoriaClinica, Date fechaCreado, Date fechaModificado,
			ArrayList<Consulta> listaConsultas, ArrayList<Observacion> listaObservaciones,
			ArrayList<Odontograma> listaOdontogramas, Paciente paciente, Administrador administrador) {
		super();
		this.idHistoriaClinica = idHistoriaClinica;
		this.fechaCreado = fechaCreado;
		this.fechaModificado = fechaModificado;
		this.listaConsultas = listaConsultas;
		this.listaObservaciones = listaObservaciones;
		this.listaOdontogramas = listaOdontogramas;
		this.paciente = paciente;
		this.administrador = administrador;
	}
	
	public HistoriaClinica() {};
	
	
	public int getIdHistoriaClinica() {
		return idHistoriaClinica;
	}
	public void setIdHistoriaClinica(int idHistoriaClinica) {
		this.idHistoriaClinica = idHistoriaClinica;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public Date getFechaCreado() {
		return fechaCreado;
	}
	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}
	
	public Date getFechaModificado() {
		return fechaModificado;
	}
	public void setFechaModificado(Date fechaModificado) {
		this.fechaModificado = fechaModificado;
	}
	
	public ArrayList<Consulta> getListaConsultas() {
		return listaConsultas;
	}
	public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}
	public ArrayList<Observacion> getListaObservaciones() {
		return listaObservaciones;
	}
	public void setListaObservaciones(ArrayList<Observacion> listaObservaciones) {
		this.listaObservaciones = listaObservaciones;
	}
	public ArrayList<Odontograma> getListaOdontogramas() {
		return listaOdontogramas;
	}
	public void setListaOdontogramas(ArrayList<Odontograma> listaOdontogramas) {
		this.listaOdontogramas = listaOdontogramas;
	}
	
}
