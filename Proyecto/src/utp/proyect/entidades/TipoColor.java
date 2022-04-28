package utp.proyect.entidades;

public class TipoColor {
		private int idTipoColor;
		private String nombre;
		private String nombreCorto;
		
		
		
		public TipoColor(int idTipoColor, String nombre, String nombreCorto) {
			super();
			this.idTipoColor = idTipoColor;
			this.nombre = nombre;
			this.nombreCorto = nombreCorto;
		}
		
		
		@Override
		public String toString() {
			return "TipoColor [idTipoColor=" + idTipoColor + ", nombre=" + nombre + ", nombreCorto=" + nombreCorto
					+ "]";
		}


		public TipoColor() {}
		public int getIdTipoColor() {
			return idTipoColor;
		}
		public void setIdTipoColor(int idTipoColor) {
			this.idTipoColor = idTipoColor;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNombreCorto() {
			return nombreCorto;
		}
		public void setNombreCorto(String nombreCorto) {
			this.nombreCorto = nombreCorto;
		}
}
