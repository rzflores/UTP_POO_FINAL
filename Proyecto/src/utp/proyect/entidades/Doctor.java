package utp.proyect.entidades;



public class Doctor extends Persona{
	private int idDoctor;
	private String codigoColegiatura;
	private double tiempoExperiencia;
	private TipoEspecialidad tipoEspecialidad;
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Doctor [idDoctor=" + idDoctor + ", codigoColegiatura=" + codigoColegiatura + ", timepoExperiencia="
				+ tiempoExperiencia + ", tipoEspecialidad=" + tipoEspecialidad + "]";
	}





	public Doctor(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad,
			String numeroDocumento, String correoElectronico, String contrasenia, String celular,
			TipoDocumento tipoDocumento, int idDoctor, String codigoColegiatura, double timepoExperiencia,
			TipoEspecialidad tipoEspecialidad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, numeroDocumento, correoElectronico,
				contrasenia, celular, tipoDocumento);
		this.idDoctor = idDoctor;
		this.codigoColegiatura = codigoColegiatura;
		this.tiempoExperiencia = timepoExperiencia;
		this.tipoEspecialidad = tipoEspecialidad;
	}





	public Doctor() {};
	
	



	public int getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}	
	public String getCodigoColegiatura() {
		return codigoColegiatura;
	}
	public void setCodigoColegiatura(String codigoColegiatura) {
		this.codigoColegiatura = codigoColegiatura;
	}
	public double getTiempoExperiencia() {
		return tiempoExperiencia;
	}
	public void setTiempoExperiencia(double tiempoExperiencia) {
		this.tiempoExperiencia = tiempoExperiencia;
	}
	public TipoEspecialidad getTipoEspecialidad() {
		return tipoEspecialidad;
	}
	public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}
	
	
	
}
