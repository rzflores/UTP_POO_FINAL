package utp.proyect.interfaces;

import java.util.ArrayList;

public interface ICrudDao<E> {

	ArrayList<E> listar();
	E buscarPorId(int parametro);
	boolean crear(E parametro);
	boolean eliminarPorId(int parametro);
	boolean actualizar (E parametro);
}
