package utp.proyect.entidades;

public class TipoDocumento {
	private int idTipoDocumento;
	private String nombre;
	private String nombreCorto;
	
	
	public TipoDocumento(int idTipoDocumento, String nombre, String nombreCorto) {
		super();
		this.idTipoDocumento = idTipoDocumento;
		this.nombre = nombre;
		this.nombreCorto = nombreCorto;
	}
	
	public TipoDocumento() {}	
			
	@Override
	public String toString() {
		return "TipoDocumento [idTipoDocumento=" + idTipoDocumento + ", nombre=" + nombre + ", nombreCorto="
				+ nombreCorto + "]";
	}
	
	



	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
