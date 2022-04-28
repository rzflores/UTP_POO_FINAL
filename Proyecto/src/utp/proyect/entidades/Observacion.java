package utp.proyect.entidades;

import java.sql.Date;
import java.util.ArrayList;

public class Observacion {
	private int idObservacion;
	private String descripcion;
	private ArrayList<TipoEmfermedad> listaEmfermedades;
	private ArrayList<TipoAlergiaMedicamento> listaTipoAlergiaMedicamentos;
	private Date fechaRegistro; 
	private Doctor doctor;
	
	
	
	public Observacion(int idObservacion, String descripcion, ArrayList<TipoEmfermedad> listaEmfermedades,
			ArrayList<TipoAlergiaMedicamento> listaTipoAlergiaMedicamentos, Date fechaRegistro, Doctor doctor) {
		super();
		this.idObservacion = idObservacion;
		this.descripcion = descripcion;
		this.listaEmfermedades = listaEmfermedades;
		this.listaTipoAlergiaMedicamentos = listaTipoAlergiaMedicamentos;
		this.fechaRegistro = fechaRegistro;
		this.doctor = doctor;
	}


	public Observacion() {}


	@Override
	public String toString() {
		return "Observacion [idObservacion=" + idObservacion + ", descripcion=" + descripcion + ", listaEmfermedades="
				+ listaEmfermedades + ", listaTipoAlergiaMedicamentos=" + listaTipoAlergiaMedicamentos
				+ ", fechaRegistro=" + fechaRegistro + ", doctor=" + doctor + "]";
	}


	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public ArrayList<TipoEmfermedad> getListaEmfermedades() {
		return listaEmfermedades;
	}
	public void setListaEmfermedades(ArrayList<TipoEmfermedad> listaEmfermedades) {
		this.listaEmfermedades = listaEmfermedades;
	}
	public ArrayList<TipoAlergiaMedicamento> getListaTipoAlergiaMedicamentos() {
		return listaTipoAlergiaMedicamentos;
	}
	public void setListaTipoAlergiaMedicamentos(ArrayList<TipoAlergiaMedicamento> listaTipoAlergiaMedicamentos) {
		this.listaTipoAlergiaMedicamentos = listaTipoAlergiaMedicamentos;
	}
	public int getIdObservacion() {
		return idObservacion;
	}
	public void setIdObservacion(int idObservacion) {
		this.idObservacion = idObservacion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
