package utp.proyect.entidades;

import java.sql.Date;

public class Presupuesto {
	private int idPresupuesto;
	private Date fechaPago;
	private double couta;
	private Administrador administrador;
	private TipoEspecialidad tipoEspecialidad;
	private Paciente paciente;
		
	public Presupuesto(int idPresupuesto, Date fechaPago, double couta, Administrador administrador,
			TipoEspecialidad tipoEspecialidad, Paciente paciente) {
		super();
		this.idPresupuesto = idPresupuesto;
		this.fechaPago = fechaPago;
		this.couta = couta;
		this.administrador = administrador;
		this.tipoEspecialidad = tipoEspecialidad;
		this.paciente = paciente;
	}
	
	public Presupuesto() {}
	
	@Override
	public String toString() {
		return "Presupuesto [idPresupuesto=" + idPresupuesto + ", fechaPago=" + fechaPago + ", couta=" + couta
				+ ", administrador=" + administrador + ", tipoEspecialidad=" + tipoEspecialidad + ", paciente="
				+ paciente + "]";
	}
	public int getIdPresupuesto() {
		return idPresupuesto;
	}
	public void setIdPresupuesto(int idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getCouta() {
		return couta;
	}
	public void setCouta(double couta) {
		this.couta = couta;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public TipoEspecialidad getTipoEspecialidad() {
		return tipoEspecialidad;
	}
	public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}
