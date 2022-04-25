package utp.proyect.entidades;

import java.util.ArrayList;

public class Odontograma {
	private int id;
	private String observacion;
	private ArrayList<NumeroPieza> listaNumeroPieza;
	public ArrayList<NumeroPieza> getListaNumeroPieza() {
		return listaNumeroPieza;
	}
	public void setListaNumeroPieza(ArrayList<NumeroPieza> listaNumeroPieza) {
		this.listaNumeroPieza = listaNumeroPieza;
	}
	private TipoOdontograma tipoOdontograma;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
