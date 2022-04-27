package utp.proyect.entidades;

public class TipoOdontograma {
	private int idTipoOdontograma;
	private String nombre;
	private String nombreCorto;
	
	
	
	@Override
	public String toString() {
		return "TipoOdontograma [idTipoOdontograma=" + idTipoOdontograma + ", nombre=" + nombre + ", nombreCorto="
				+ nombreCorto + "]";
	}
		

	public TipoOdontograma(int idTipoOdontograma, String nombre, String nombreCorto) {
		super();
		this.idTipoOdontograma = idTipoOdontograma;
		this.nombre = nombre;
		this.nombreCorto = nombreCorto;
	}
	
	public TipoOdontograma() {};



	public int getIdTipoOdontograma() {
		return idTipoOdontograma;
	}
	public void setIdTipoOdontograma(int idTipoOdontograma) {
		this.idTipoOdontograma = idTipoOdontograma;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	
	

}
