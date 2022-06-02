package utp.proyect.vistas;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import utp.proyect.conexion.SingletonConexion;
import utp.proyect.dao.DaoDoctor;
import utp.proyect.entidades.*;
import utp.proyect.utilitarios.polimorfismo.loginEmail;
import utp.proyect.utilitarios.polimorfismo.loginNumeroDocumento;
import utp.proyect.utilitarios.polimorfismo.loginPolimorfismo;

public class main {

	public static void main(String[] args)  {
		
		/*----------dbconec---------*/
		/*
		loginPolimorfismo obj;
		
		obj = new loginNumeroDocumento();
		boolean result1 = obj.login("ca-1235f", "123456");
		System.out.println(result1);
		obj = new loginEmail();
		boolean result2 =  obj.login("admin@odonto.com", "123456");
		System.out.println(result2);
		
		/*DaoAdministrador da = new DaoAdministrador();
		boolean result = da.login("admin@odonto.com", "1234567");
		System.out.println(result);
		
		
		
		
		
		/*-----------------Tipo Documento-----------------*/
		
		TipoDocumento tdD = new TipoDocumento();
		tdD.setIdTipoDocumento(1);
		tdD.setNombre("Dni");
		tdD.setNombreCorto("D");
		
		TipoDocumento tdCE = new TipoDocumento();
		tdCE.setIdTipoDocumento(1);
		tdCE.setNombre("Carnet de extranjeria");
		tdCE.setNombreCorto("CE");
		
		/*------------------------------------------------*/
	
		
		/*-----------------Tipo Especialidad-----------------*/
		/*TipoEspecialidad teORT =  new TipoEspecialidad();
		teORT.setIdTipoEspecialidad(1);
		teORT.setNombre("Ortodoncia");
		teORT.setDescripcion("aplicacion de brakets");
		teORT.setNombreCorto("ORT");
		/*---------------------------------------------------*/
				
		/*-----------------Doctor-----------------*/
		Doctor d = new Doctor();
		d.setIdDoctor(1);
		d.setPrimerNombre("Jose");
		d.setPrimerApellido("Lopez");
		d.setSegundoApellido("Pacheco");
		d.setCelular("976137689");
		d.setCodigoColegiatura("DC-1026");
		d.setEdad(32);
		d.setTiempoExperiencia(3.5);
		d.setNumeroDocumento("44332211");
		d.setCorreoElectronico("doctor1@odontodent.com");
		d.setContrasenia("123adwqe");
		d.setTipoDocumento(tdD);		
//		d.setTipoEspecialidad(teORT);
		System.out.println("----------Doctor--------");
		System.out.println(d.toString());
		System.out.println("------------------------");
		/*----------------------------------------*/
		
		/*-----------------Paciente-----------------*/
		
		Paciente p = new Paciente();
		p.setIdPaciente(1);
		p.setPrimerNombre("Paco");
		p.setPrimerApellido("Cobeñas");
		p.setSegundoApellido("Gaitan");
		p.setCelular("123453221");		
		p.setEdad(24);		
		p.setNumeroDocumento("12344321");
		p.setCorreoElectronico("paco@hola.com");
		p.setContrasenia("112312s");
		p.setTipoDocumento(tdD);
		p.setCelularTrabajo("12345678");
		p.setEsPrimeraVisita(true);
		p.setDireccion("avenida de prueba 87");
		
		Paciente p2 = new Paciente();
		p2.setIdPaciente(1);
		p2.setPrimerNombre("Marcos");
		p2.setPrimerApellido("Pachecho");
		p2.setSegundoApellido("Cardenas");
		p2.setCelular("123453221");		
		p2.setEdad(24);		
		p2.setNumeroDocumento("1111111");
		p2.setCorreoElectronico("prueba@hola.com");
		p2.setContrasenia("112312s");
		p2.setTipoDocumento(tdD);
		p2.setCelularTrabajo("12345678");
		p2.setEsPrimeraVisita(true);
		p2.setDireccion("avenida de prueba 87");
		System.out.println("------Pacientes-------");
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println("----------------------");
		
		/*----------------------------------------*/
		
		
		/*--------------Consulta-------------------*/
		/*Consulta c1 = new Consulta();
		Date fechaC1 = new Date(2022,04,25);
		Time inicioConsultaC1 = new Time(11,30,50);
        Time finConsultaC1 = new Time(12,30,50);
		c1.setIdConsulta(1);
		c1.setFecha(fechaC1);
		c1.setHoraIncio(inicioConsultaC1);
		c1.setHoraFin(finConsultaC1);
		c1.setCosto(20.50);
		c1.setPaciente(p);
		
		Consulta c2 = new Consulta();
		Date fechaC2 = new Date(2022,04,25);
		Time inicioConsultaC2 = new Time(15,30,50);
        Time finConsultaC2 = new Time(17,30,50);
        c2.setIdConsulta(2);
        c2.setFecha(fechaC2);
        c2.setHoraIncio(inicioConsultaC2);
        c2.setHoraFin(finConsultaC2);
        c2.setCosto(20.50);
        c2.setPaciente(p);
        
        Consulta c3 = new Consulta();
		Date fechaC3 = new Date(2022,04,25);
		Time inicioConsultaC3 = new Time(15,30,50);
        Time finConsultaC3 = new Time(17,30,50);
        c3.setIdConsulta(2);
        c3.setFecha(fechaC2);
        c3.setHoraIncio(inicioConsultaC2);
        c3.setHoraFin(finConsultaC2);
        c3.setCosto(20.50);
        c3.setPaciente(p2);
        /*-----------------------------------------*/
        
		
        /*--------------Turno--------------*/
        /*Turno tu1 = new Turno();		       
        Time tiempoInicio = new Time(10,30,50);
        Time tiempoFin = new Time(18,30,50);
        ArrayList<Consulta> listaConsultas =new ArrayList<Consulta>();
        listaConsultas.add(c1);
        listaConsultas.add(c2);
		tu1.setIdTurno(1);
		tu1.setHoraInicio(tiempoInicio);
		tu1.setHoraFin(tiempoFin);
		tu1.setDoctor(d);
		tu1.setListaConsultas(listaConsultas);
		System.out.println("--------Turno-Doctor-Consulta-----");
		System.out.println(tu1.toString());
		System.out.println("----------------------------------");
		
		/*---------------------------------*/
				
		
		/*-----------------Tipo Odontograma-----------------*/
		TipoOdontograma tpA = new TipoOdontogramaAdulto();
		tpA.setIdTipoOdontograma(1);
		tpA.setNombre("Adulto");
		tpA.setNombreCorto("A");
		tpA.setCantidadPiezas(38);
		
		
		TipoOdontograma tpI = new TipoOdontogramaMenor();
		tpI.setIdTipoOdontograma(1);
		tpI.setNombre("Infantil");
		tpI.setNombreCorto("I");
		tpI.setCantidadPiezas(20);
		/*--------------------------------------------------*/
		
		
		/*-----------------Tipo Color-----------------*/ 
		/*TipoColor tcA = new TipoColor();
		tcA.setIdTipoColor(1);
		tcA.setNombre("Azul");
		tcA.setNombreCorto("Az");
		
		TipoColor tcR = new TipoColor();
		tcR.setIdTipoColor(1);
		tcR.setNombre("Rojo");
		tcR.setNombreCorto("Rj");
		/*--------------------------------------------*/
		
	
		
		/*-----------------Tipo Diagnostico-----------------*/ 
		/*TipoDiagnostico td1 = new TipoDiagnostico();
		td1.setIdTipoDiagnostico(1);
		td1.setNombre("SE");
		td1.setDescripcion("con sellador");
		td1.setTipoColor(tcA);		
		TipoDiagnostico td2 = new TipoDiagnostico();
		td1.setIdTipoDiagnostico(1);
		td1.setNombre("MDP");
		td1.setDescripcion("mala posicion dentaria");
		td1.setTipoColor(tcR);
		/*---------------------------------------------------*/
		/*-----------------Numero Pieza-----------------*/
		/*NumeroPieza np1 = new NumeroPieza();
		np1.setIdNumeroPieza(1);
		np1.setNumero(32);
		np1.setTipoDiagnostico(td1);
		
		NumeroPieza np2 = new NumeroPieza();
		np2.setIdNumeroPieza(2);
		np2.setNumero(14);
		np2.setTipoDiagnostico(td2);
		/*----------------------------------------------*/
		
		/*-----------------Odontograma-----------------*/
		
		
		
		Odontograma odt = new Odontograma();
		odt.setDoctor(d);
		odt.setIdOdontograma(1);
		odt.setTipoOdontograma(tpA);					
		odt.setObservacion("tiene 2 piezas con problemas");
		Date fechaOdonto = new Date(27,04,2022);
		odt.setFecha(fechaOdonto);
		System.out.println("--------------Odontograma---------------");
		System.out.println(odt.toString());
		System.out.println("----------------------------------------");
		
		
		Odontograma odt2 = new Odontograma();
		odt.setDoctor(d);
		odt.setIdOdontograma(1);
		odt.setTipoOdontograma(tpI);					
		odt.setObservacion("tiene 2 piezas con problemas");
		Date fechaOdonto2 = new Date(27,04,2022);
		odt.setFecha(fechaOdonto2);
		System.out.println("--------------Odontograma---------------");
		System.out.println(odt.toString());
		System.out.println("----------------------------------------");
		
		/*-------------------------------------------*/
		
		
		/*-----------------Tipo Emfermedad----------------*/
//		TipoEmfermedad te = new TipoEmfermedad();
//		te.setIdTipoEmfermedad(1);
//		te.setNombre("diabetes");
//		te.setDescripcion("diabetes tipo 1");
//		te.setNombreCorto("dibet1");
//		ArrayList<TipoEmfermedad> listaTipoEmfermedad = new ArrayList<TipoEmfermedad>();
//		
//		System.out.println(te.toString());
		
		/*----------------------------------------------*/
		
		/*-----------------Tipo Alergia Medicamento----------------*/
		/*TipoAlergiaMedicamento tam = new TipoAlergiaMedicamento();
		tam.setIdTipoAlergiaMedicamento(1);
		tam.setNombreMedicamento("Ab broncol");
		ArrayList<TipoAlergiaMedicamento> listaTipoAlergiaMedicamento = new ArrayList<TipoAlergiaMedicamento>();
		listaTipoAlergiaMedicamento.add(tam);
		
		/*---------------------------------------------------------*/
		
		/*-----------------Observacion----------------*/
		/*Observacion ob1 = new Observacion();
		ob1.setIdObservacion(1);
		ob1.setDoctor(d);
		Date fechaObservacion = new Date(28,04,2022);
		ob1.setFechaRegistro(fechaObservacion);
		ob1.setDescripcion("paciente con emfermedad y alergia");
		ob1.setListaEmfermedades(listaTipoEmfermedad);
		ob1.setListaTipoAlergiaMedicamentos(listaTipoAlergiaMedicamento);
		ArrayList<Observacion> listaObservaciones = new ArrayList<Observacion>();
		listaObservaciones.add(ob1);
		System.out.println("----------Observaciones----------");
		System.out.println(ob1.toString());
		System.out.println("---------------------------------");
		
		/*--------------------------------------------*/
		
		/*-----------------historia clinica----------------*/
		/*HistoriaClinica hc1 = new HistoriaClinica();
		Date fechaCreado = new Date(2022,04,25);
		Date fechaModificado = new Date(2022,04,25);
		ArrayList<Consulta> listaConsultasPaciente =new ArrayList<Consulta>();
		listaConsultas.stream()
		.filter( c -> c.getPaciente().getNumeroDocumento() == p.getNumeroDocumento() )
		.forEach( c -> listaConsultasPaciente.add(c));
		hc1.setIdHistoriaClinica(1);
		hc1.setFechaCreado(fechaCreado);
		hc1.setFechaModificado(fechaModificado);
		hc1.setPaciente(p);
		hc1.setListaConsultas(listaConsultasPaciente);
		hc1.setListaObservaciones(listaObservaciones);
		ArrayList<Odontograma> listaOdontogramas = new ArrayList<Odontograma>();
		hc1.setListaOdontogramas(listaOdontogramas);				
		System.out.println("----------Historia clinica - Odontograma - Observaciones ----------");
		System.out.println(hc1.toString());
		System.out.println("-------------------------------------------------------------------");
	
		/*--------------------------------------------------*/
		
		

	}

}
