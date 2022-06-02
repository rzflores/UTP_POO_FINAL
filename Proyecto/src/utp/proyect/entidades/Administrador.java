package utp.proyect.entidades;

import java.util.ArrayList;

import utp.proyect.dao.DaoConsulta;
import utp.proyect.dao.DaoDoctor;
import utp.proyect.dao.DaoPaciente;
import utp.proyect.dao.DaoPresupuesto;
import utp.proyect.dao.DaoTurno;

public class Administrador extends Persona {
	private int idAdminitrador;
	
	
	

	@Override
	public String toString() {
		return super.toString() + "Administrador [idAdminitrador=" + idAdminitrador + "]";
	}
	
	
	public ArrayList<Paciente> listarPacientes()  {
		DaoPaciente daoP = new DaoPaciente(); 
		return daoP.listar();
	}
	
	public Paciente buscarPorIdPaciente(int idPaciente)  {
		DaoPaciente daoP = new DaoPaciente(); 
		return daoP.buscarPorId(idPaciente);
	}
	
	public boolean crearPaciente(Paciente p ) {
		DaoPaciente daoP = new DaoPaciente(); 
		return daoP.crear(p);		
	}
	
	public boolean EliminarPaciente(int idPaciente ) {
		DaoPaciente daoP = new DaoPaciente(); 
		return daoP.eliminarPorId(idPaciente);		
	}

	public boolean EditarPaciente(Paciente p) {
		DaoPaciente daoP = new DaoPaciente(); 
		return daoP.actualizar(p);
	}

	
	public ArrayList<Doctor> listarDoctores()  {
		DaoDoctor daoD = new DaoDoctor(); 
		return daoD.listar();
	}
	public Doctor buscarPorIdidDoctor(int idDoctor)  {
		DaoDoctor daoD = new DaoDoctor(); 
		return daoD.buscarPorId(idDoctor);
	}
	
	public boolean crearDocto(Doctor d) {
		DaoDoctor daoD = new DaoDoctor(); 
		return daoD.crear(d);		
	}
	
	public boolean EliminarDoctor(int idDoctor) {
		DaoDoctor daoP = new DaoDoctor(); 
		return daoP.eliminarPorId(idDoctor);		
	}

	public boolean EditarDoctor(Doctor d) {
		DaoDoctor daoP = new DaoDoctor(); 
		return daoP.actualizar(d);
	}

	public ArrayList<Turno> listarTurnos()  {
		DaoTurno daoT = new DaoTurno(); 
		return daoT.listar();
	}
	
	public Turno buscarPorIdidTurno (int idTurno)  {
		DaoTurno daoT = new DaoTurno(); 
		return daoT.buscarPorId(idTurno);
	}
	
	public boolean crearTurno(Turno t) {
		DaoTurno daoT = new DaoTurno(); 
		return daoT.crear(t);		
	}
	
	public boolean eliminarTurno(int idTurno) {
		DaoTurno daoT = new DaoTurno(); 
		return daoT.eliminarPorId(idTurno);		
	}

	public boolean editarTurno(Turno d) {
		DaoTurno daoT = new DaoTurno(); 
		return daoT.actualizar(d);
	}

	
	public ArrayList<Presupuesto> listarPresuspuestos()  {
		DaoPresupuesto daoPre = new DaoPresupuesto(); 
		return daoPre.listar();
	}
	
	public Presupuesto buscarPorIdPresupuesto (int idPresupuesto)  {
		DaoPresupuesto daoPre = new DaoPresupuesto(); 
		return daoPre.buscarPorId(idPresupuesto);
	}
	
	public boolean crearPresupuesto(Presupuesto pre) {
		DaoPresupuesto daoPre = new DaoPresupuesto(); 
		return daoPre.crear(pre);		
	}
	
	public boolean eliminarPresupuesto(int idPresupuesto) {
		DaoPresupuesto daoPre = new DaoPresupuesto(); 
		return daoPre.eliminarPorId(idPresupuesto);		
	}

	public boolean editarPresupuesto(Presupuesto pre) {
		DaoPresupuesto daoPre = new DaoPresupuesto(); 
		return daoPre.actualizar(pre);
	}
	
	
	public ArrayList<Consulta> listarConsulta()  {
		DaoConsulta daoC = new DaoConsulta(); 
		return daoC.listar();
	}
	
	public Consulta buscarPorIdConsulta (int idConsulta)  {
		DaoConsulta daoC = new DaoConsulta(); 
		return daoC.buscarPorId(idConsulta);
	}
	
	public boolean crearConsulta (Consulta c) {
		DaoConsulta daoC = new DaoConsulta(); 
		return daoC.crear(c);		
	}
	
	public boolean eliminarConsulta(int idConsulta) {
		DaoConsulta daoC = new DaoConsulta(); 
		return daoC.eliminarPorId(idConsulta);		
	}

	public boolean editarConsulta(Consulta c) {
		DaoConsulta daoC = new DaoConsulta(); 
		return daoC.actualizar(c);
	}
	

	public Administrador(int idAdminitrador) {
		super();
		this.idAdminitrador = idAdminitrador;
	}










	public Administrador(){};

	public int getIdAdminitrador() {
		return idAdminitrador;
	}

	public void setIdAdminitrador(int idAdminitrador) {
		this.idAdminitrador = idAdminitrador;
	} 
}
