package utp.proyect.entidades;

public class Paciente extends Persona {
	private String celularTrabajo;
	private String direccion;
	
	
	
	public Paciente(String celularTrabajo, String direccion) {
		super();
		this.celularTrabajo = celularTrabajo;
		this.direccion = direccion;
	}
	
	
	@Override
	public String toString() {
		return "Paciente [celularTrabajo=" + celularTrabajo + ", direccion=" + direccion + "]";
	}


	public Paciente() {};
	
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
