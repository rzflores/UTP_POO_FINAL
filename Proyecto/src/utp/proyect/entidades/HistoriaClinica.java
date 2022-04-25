package utp.proyect.entidades;

import java.util.ArrayList;
import java.util.Date;

public class HistoriaClinica {
	private int id;
	private Date fechaCreado;
	private String autorCreado;
	private Date fechaModificado;
	private String autorModificado;
	private ArrayList<Consulta> listaConsultas;
	private ArrayList<Observacion> listaObservaciones;
	private ArrayList<Odontograma> listaOdontogramas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaCreado() {
		return fechaCreado;
	}
	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}
	public String getAutorCreado() {
		return autorCreado;
	}
	public void setAutorCreado(String autorCreado) {
		this.autorCreado = autorCreado;
	}
	public Date getFechaModificado() {
		return fechaModificado;
	}
	public void setFechaModificado(Date fechaModificado) {
		this.fechaModificado = fechaModificado;
	}
	public String getAutorModificado() {
		return autorModificado;
	}
	public void setAutorModificado(String autorModificado) {
		this.autorModificado = autorModificado;
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
