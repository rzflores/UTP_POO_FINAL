package utp.proyect.entidades;

import java.util.ArrayList;


public class Doctor extends Usuario{
	private String numeroColegiatura;
	private int aniosExperiencia;
	private ArrayList<Especialidad> ListaEspecialidad;
	public String getNumeroColegiatura() {
		return numeroColegiatura;
	}
	public void setNumeroColegiatura(String numeroColegiatura) {
		this.numeroColegiatura = numeroColegiatura;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public List<Especialidad> getListaEspecialidad() {
		return ListaEspecialidad;
	}
	public void setListaEspecialidad(ArrayList<Especialidad> listaEspecialidad) {
		ListaEspecialidad = listaEspecialidad;
	}
	
}
