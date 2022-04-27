package utp.proyect.entidades;

import java.util.ArrayList;


public class Doctor extends Persona{
	private int idDoctor;
	private String codigoColegiatura;
	private double timepoExperiencia;
	private TipoEspecialidad tipoEspecialidad;
	
	
	public Doctor(int idDoctor, String codigoColegiatura, double timepoExperiencia, TipoEspecialidad tipoEspecialidad) {
		super();
		this.idDoctor = idDoctor;
		this.codigoColegiatura = codigoColegiatura;
		this.timepoExperiencia = timepoExperiencia;
		this.tipoEspecialidad = tipoEspecialidad;
	}
	
	public Doctor() {};
	
	
	@Override
	public String toString() {
		return "Doctor [idDoctor=" + idDoctor + ", codigoColegiatura=" + codigoColegiatura + ", timepoExperiencia="
				+ timepoExperiencia + ", tipoEspecialidad=" + tipoEspecialidad + "]";
	}




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
