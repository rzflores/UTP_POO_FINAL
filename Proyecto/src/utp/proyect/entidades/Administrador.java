package utp.proyect.entidades;

public class Administrador extends Persona {
	private int idAdminitrador;
	
	
	
	@Override
	public String toString() {
		return "Administrador [idAdminitrador=" + idAdminitrador + "]";
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
