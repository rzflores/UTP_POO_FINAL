package utp.proyect.entidades;

public class TipoDiagnostico {
	private int idTipoDiagnostico;
	private String nombre;
	private String descripcion;
	
	
	@Override
	public String toString() {
		return "TipoDiagnostico [idTipoDiagnostico=" + idTipoDiagnostico + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
	}
	
	
	public TipoDiagnostico(int idTipoDiagnostico, String nombre, String descripcion) {
		super();
		this.idTipoDiagnostico = idTipoDiagnostico;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public TipoDiagnostico() {};


	public int getIdTipoDiagnostico() {
		return idTipoDiagnostico;
	}
	public void setIdTipoDiagnostico(int idTipoDiagnostico) {
		this.idTipoDiagnostico = idTipoDiagnostico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
