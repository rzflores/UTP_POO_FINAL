package utp.proyect.entidades;

public class TipoAlergiaMedicamento extends TipoAmenesis {
	private int idTipoAlergiaMedicamento;
	private String nombreMedicamento;
	
	
	
	@Override
	public String toString() {
		return super.toString() +  "TipoAlergiaMedicamento [idTipoAlergiaMedicamento=" + idTipoAlergiaMedicamento + ", nombreMedicamento="
				+ nombreMedicamento + "]";
	}
	
	
	
	public TipoAlergiaMedicamento(String nombreCorto, String descripcion, int idTipoAlergiaMedicamento,
			String nombreMedicamento) {
		super(nombreCorto, descripcion);
		this.idTipoAlergiaMedicamento = idTipoAlergiaMedicamento;
		this.nombreMedicamento = nombreMedicamento;
	}
	
	



	public TipoAlergiaMedicamento() {}



	public int getIdTipoAlergiaMedicamento() {
		return idTipoAlergiaMedicamento;
	}
	public void setIdTipoAlergiaMedicamento(int idTipoAlergiaMedicamento) {
		this.idTipoAlergiaMedicamento = idTipoAlergiaMedicamento;
	}
	public String getNombreMedicamento() {
		return nombreMedicamento;
	}
	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}
	
	
}
