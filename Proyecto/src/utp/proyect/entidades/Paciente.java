package utp.proyect.entidades;

public class Paciente extends Persona {
	private int idPaciente;
	private String celularTrabajo;
	private String direccion;
	private boolean esPrimeraVisita;
	

	public Paciente(int idPaciente , String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad,
			String numeroDocumento, String correoElectronico, String contrasenia, String celular,
			TipoDocumento tipoDocumento, String celularTrabajo, String direccion, boolean esPrimeraVisita) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, numeroDocumento, correoElectronico,
				contrasenia, celular, tipoDocumento);
		this.idPaciente = idPaciente;
		this.celularTrabajo = celularTrabajo;
		this.direccion = direccion;
		this.esPrimeraVisita = esPrimeraVisita;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + "Paciente [celularTrabajo=" + celularTrabajo + ", direccion=" + direccion + ", esPrimeraVisita="
				+ esPrimeraVisita + "]";
	}



	public Paciente() {};
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public boolean isEsPrimeraVisita() {
		return esPrimeraVisita;
	}
	
	
	public void setEsPrimeraVisita(boolean esPrimeraVisita) {
		this.esPrimeraVisita = esPrimeraVisita;
	}
	
	
	public String getCelularTrabajo() {
		return celularTrabajo;
	}
	public void setCelularTrabajo(String celularTrabajo) {
		this.celularTrabajo = celularTrabajo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
