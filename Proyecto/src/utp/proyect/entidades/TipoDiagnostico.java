package utp.proyect.entidades;

public class TipoDiagnostico {
	private int idTipoDiagnostico;
	private String nombre;
	private String descripcion;
	private TipoColor tipoColor;






	@Override
	public String toString() {
		return "TipoDiagnostico [idTipoDiagnostico=" + idTipoDiagnostico + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", tipoColor=" + tipoColor + "]";
	}


	public TipoDiagnostico(int idTipoDiagnostico, String nombre, String descripcion, TipoColor tipoColor) {
		super();
		this.idTipoDiagnostico = idTipoDiagnostico;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoColor = tipoColor;
	}


	public TipoDiagnostico() {};


	public TipoColor getTipoColor() {
		return tipoColor;
	}
	
	
	public void setTipoColor(TipoColor tipoColor) {
		this.tipoColor = tipoColor;
	}
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
