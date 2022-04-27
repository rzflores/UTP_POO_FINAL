package utp.proyect.entidades;

public class NumeroPieza {
	private int idNumeroPieza;
	private int numero;
	private String observacion;
	private TipoDiagnostico tipoDiagnostico;
	
		
	@Override
	public String toString() {
		return "NumeroPieza [idNumeroPieza=" + idNumeroPieza + ", numero=" + numero + ", observacion=" + observacion
				+ ", tipoDiagnostico=" + tipoDiagnostico + "]";
	}
	
	public NumeroPieza(int idNumeroPieza, int numero, String observacion, TipoDiagnostico tipoDiagnostico) {
		super();
		this.idNumeroPieza = idNumeroPieza;
		this.numero = numero;
		this.observacion = observacion;
		this.tipoDiagnostico = tipoDiagnostico;
	}
	
	public NumeroPieza() {};
	
	
	public int getIdNumeroPieza() {
		return idNumeroPieza;
	}
	public void setIdNumeroPieza(int idNumeroPieza) {
		this.idNumeroPieza = idNumeroPieza;
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
