package utp.proyect.interfaces;

import java.util.ArrayList;

import utp.proyect.entidades.Consulta;

public interface IListarConsultasDao {
	ArrayList<Consulta> listarConsultas(int parametro);
}
