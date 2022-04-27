package utp.proyect.entidades;

public class TipoAmenesis {
	private String nombreCorto;
	private String descripcion;
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "TipoAmenesis [nombreCorto=" + nombreCorto + ", descripcion=" + descripcion + "]";
	}
	public TipoAmenesis(String nombreCorto, String descripcion) {
		super();
		this.nombreCorto = nombreCorto;
		this.descripcion = descripcion;
	}
	public TipoAmenesis() {
		
	}
	
	
	
	
}
