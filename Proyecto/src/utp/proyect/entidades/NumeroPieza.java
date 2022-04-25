package utp.proyect.entidades;

public class NumeroPieza {
	private int id;
	private int numero;
	private String observacion;
	private TipoDiagnostico tipoDiagnostico;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public TipoDiagnostico getTipoDiagnostico() {
		return tipoDiagnostico;
	}
	public void setTipoDiagnostico(TipoDiagnostico tipoDiagnostico) {
		this.tipoDiagnostico = tipoDiagnostico;
	}
}
