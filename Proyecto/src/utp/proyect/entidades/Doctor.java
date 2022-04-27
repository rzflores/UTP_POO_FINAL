package utp.proyect.entidades;



public class Doctor extends Persona{
	private int idDoctor;
	private String codigoColegiatura;
	private double timepoExperiencia;
	private TipoEspecialidad tipoEspecialidad;
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Doctor [idDoctor=" + idDoctor + ", codigoColegiatura=" + codigoColegiatura + ", timepoExperiencia="
				+ timepoExperiencia + ", tipoEspecialidad=" + tipoEspecialidad + "]";
	}





	public Doctor(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad,
			String numeroDocumento, String correoElectronico, String contrasenia, String celular,
			TipoDocumento tipoDocumento, int idDoctor, String codigoColegiatura, double timepoExperiencia,
			TipoEspecialidad tipoEspecialidad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, numeroDocumento, correoElectronico,
				contrasenia, celular, tipoDocumento);
		this.idDoctor = idDoctor;
		this.codigoColegiatura = codigoColegiatura;
		this.timepoExperiencia = timepoExperiencia;
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
	public double getTimepoExperiencia() {
		return timepoExperiencia;
	}
	public void setTimepoExperiencia(double timepoExperiencia) {
		this.timepoExperiencia = timepoExperiencia;
	}
	public TipoEspecialidad getTipoEspecialidad() {
		return tipoEspecialidad;
	}
	public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}
	
	
	
}
