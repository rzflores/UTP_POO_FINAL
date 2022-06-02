package utp.proyect.entidades;

import java.sql.Time;
import java.util.ArrayList;

public class Turno {
	private int idTurno;
	private Time horaInicio;
	private Time horaFin;	
	private Doctor doctor;
	
	
	
	public Turno(int idTurno, Time horaInicio, Time horaFin, Doctor doctor) {
		super();
		this.idTurno = idTurno;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", doctor="
				+ doctor + "]";
	}


	public Turno() {}


	public int getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}
	public Time getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Time getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
