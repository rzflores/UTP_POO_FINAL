package utp.proyect.vistasUtilitarios;


public class MenuPermisos {
	private String nombre;
	private boolean esActivo;
	private int orden;
	
	public MenuPermisos() {};
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEsActivo() {
		return esActivo;
	}
	public void setEsActivo(boolean esActivo) {
		this.esActivo = esActivo;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public MenuPermisos(String nombre, boolean esActivo, int orden) {
		super();
		this.nombre = nombre;
		this.esActivo = esActivo;
		this.orden = orden;
	}
	
	
	
}

