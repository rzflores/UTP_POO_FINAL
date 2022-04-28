package utp.proyect.entidades;

public class TipoEmfermedad extends TipoAmenesis{
	private int idTipoEmfermedad;
	private String nombre;
		
	@Override
	public String toString() {
		return  super.toString() +  "TipoEmfermedad [idTipoEmfermedad=" + idTipoEmfermedad + ", nombre=" + nombre + "]";
	}

	public TipoEmfermedad(String nombreCorto, String descripcion, int idTipoEmfermedad, String nombre) {
		super(nombreCorto, descripcion);
		this.idTipoEmfermedad = idTipoEmfermedad;
		this.nombre = nombre;
	}
	
	public TipoEmfermedad() {}
	

	public int getIdTipoEmfermedad() {
		return idTipoEmfermedad;
	}
	public void setIdTipoEmfermedad(int idTipoEmfermedad) {
		this.idTipoEmfermedad = idTipoEmfermedad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
