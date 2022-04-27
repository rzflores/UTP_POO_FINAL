package utp.proyect.entidades;

public class Persona {	
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private int edad;
	private String numeroDocumento;	
	private String correoElectronico;
	private String contrasenia;
	private String celular;
	private TipoDocumento tipoDocumento;
	
	
		
	public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad,
			String numeroDocumento, String correoElectronico, String contrasenia, String celular,
			TipoDocumento tipoDocumento) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.numeroDocumento = numeroDocumento;
		this.correoElectronico = correoElectronico;
		this.contrasenia = contrasenia;
		this.celular = celular;
		this.tipoDocumento = tipoDocumento;
	}
	
	public Persona() {};

	@Override
	public String toString() {
		return "Persona [primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", edad=" + edad + ", numeroDocumento="
				+ numeroDocumento + ", correoElectronico=" + correoElectronico + ", contrasenia=" + contrasenia
				+ ", celular=" + celular + ", tipoDocumento=" + tipoDocumento + "]";
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
}
