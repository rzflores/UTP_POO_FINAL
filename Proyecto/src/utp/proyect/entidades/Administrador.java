package utp.proyect.entidades;

public class Administrador extends Persona {
	private int idAdminitrador;
	
	
	

	@Override
	public String toString() {
		return super.toString() + "Administrador [idAdminitrador=" + idAdminitrador + "]";
	}
	
	

	public Administrador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			int edad, String numeroDocumento, String correoElectronico, String contrasenia, String celular,
			TipoDocumento tipoDocumento, int idAdminitrador) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, numeroDocumento, correoElectronico,
				contrasenia, celular, tipoDocumento);
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
