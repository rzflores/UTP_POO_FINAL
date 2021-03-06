package utp.proyect.entidades;

import java.sql.Time;
import java.util.Date;

public class Consulta {
	
	private int idConsulta;
	private Date fecha;
	private Time horaIncio;
	private Time horaFin;
	private double costo;
	private Paciente paciente;

	
	public Consulta(int idConsulta, Date fecha, Time horaIncio, Time horaFin, double costo, Paciente paciente) {
		super();
		this.idConsulta = idConsulta;
		this.fecha = fecha;
		this.horaIncio = horaIncio;
		this.horaFin = horaFin;
		this.costo = costo;
		this.paciente = paciente;
	}
	
	public Consulta() {};
	
	@Override
	public String toString() {
		return "Consulta [idConsulta=" + idConsulta + ", fecha=" + fecha + ", horaIncio=" + horaIncio + ", horaFin="
				+ horaFin + ", costo=" + costo + ", paciente=" + paciente + "]";
	}
	


	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	public Time getHoraIncio() {
		return horaIncio;
	}
	public void setHoraIncio(Time horaIncio) {
		this.horaIncio = horaIncio;
	}
	public Time getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
}
