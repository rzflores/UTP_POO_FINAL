package utp.proyect.entidades;

import java.sql.Date;
import java.util.ArrayList;

public class Odontograma {
	private int idOdontograma;
	private String observacion;
	private ArrayList<NumeroPieza> listaNumeroPieza;
	private TipoOdontograma tipoOdontograma;
	private Date fecha;
		
	
	@Override
	public String toString() {
		return "Odontograma [idOdontograma=" + idOdontograma + ", observacion=" + observacion + ", listaNumeroPieza="
				+ listaNumeroPieza + ", tipoOdontograma=" + tipoOdontograma + ", fecha=" + fecha + "]";
	}
	
	
	
	public Odontograma(int idOdontograma, String observacion, ArrayList<NumeroPieza> listaNumeroPieza,
			TipoOdontograma tipoOdontograma, Date fecha) {
		super();
		this.idOdontograma = idOdontograma;
		this.observacion = observacion;
		this.listaNumeroPieza = listaNumeroPieza;
		this.tipoOdontograma = tipoOdontograma;
		this.fecha = fecha;
	}
	public Odontograma() {};



	public int getIdOdontograma() {
		return idOdontograma;
	}
	public void setIdOdontograma(int idOdontograma) {
		this.idOdontograma = idOdontograma;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ArrayList<NumeroPieza> getListaNumeroPieza() {
		return listaNumeroPieza;
	}
	public void setListaNumeroPieza(ArrayList<NumeroPieza> listaNumeroPieza) {
		this.listaNumeroPieza = listaNumeroPieza;
	}	
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	public TipoOdontograma getTipoOdontograma() {
		return tipoOdontograma;
	}
	public void setTipoOdontograma(TipoOdontograma tipoOdontograma) {
		this.tipoOdontograma = tipoOdontograma;
	}
	
}
