package biblioteca;

public abstract class MaterialBiblioteca {
		private String titulo;
		private String a�oPublicacion;
		private int numeroPaginas;
		
		
		public MaterialBiblioteca(String titulo, String a�oPublicacion, int numeroPaginas) {
			this.titulo = titulo;
			this.a�oPublicacion = a�oPublicacion;
			this.numeroPaginas = numeroPaginas;
		}

		public abstract double calcularMultas(int diasRetraso);

		public String getResumen() {
			return "MaterialBiblioteca [titulo=" + titulo + ", a�oPublicacion=" + a�oPublicacion + ", numeroPaginas="
					+ numeroPaginas + "]";
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getA�oPublicacion() {
			return a�oPublicacion;
		}

		public void setA�oPublicacion(String a�oPublicacion) {
			this.a�oPublicacion = a�oPublicacion;
		}

		public int getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(int numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}
		
}
