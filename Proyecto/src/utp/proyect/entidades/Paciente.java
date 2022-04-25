package utp.proyect.entidades;

public class Paciente extends Usuario {
	private String celularTrabajo;
	private String direccion;
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
