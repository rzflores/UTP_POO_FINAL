package utp.proyect.entidades;

public class TipoEspecialidad {
	private int idTipoEspecialidad;
	private String nombre;
	private String nombreCorto;
	private String descripcion;
	
	
	@Override
	public String toString() {
		return "TipoEspecialidad [idTipoEspecialidad=" + idTipoEspecialidad + ", nombre=" + nombre + ", nombreCorto="
				+ nombreCorto + ", descripcion=" + descripcion + "]";
	}
	
	public TipoEspecialidad(int idTipoEspecialidad, String nombre, String nombreCorto, String descripcion) {
		super();
		this.idTipoEspecialidad = idTipoEspecialidad;
		this.nombre = nombre;
		this.nombreCorto = nombreCorto;
		this.descripcion = descripcion;
	}
	public TipoEspecialidad() {}

	public int getIdTipoEspecialidad() {
		return idTipoEspecialidad;
	}
	public void setIdTipoEspecialidad(int idTipoEspecialidad) {
		this.idTipoEspecialidad = idTipoEspecialidad;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
