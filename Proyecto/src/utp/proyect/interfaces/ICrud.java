package utp.proyect.interfaces;

import java.util.ArrayList;

public interface ICrud<E> {

	ArrayList<E> listar();
	E buscarPorId();
	boolean crear();
	boolean eliminarPorId();
	boolean actualizarPorId();
}
