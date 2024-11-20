package biblioteca;

public abstract class MaterialBiblioteca {
		private String titulo;
		private String aņoPublicacion;
		private int numeroPaginas;
		
		
		public MaterialBiblioteca(String titulo, String aņoPublicacion, int numeroPaginas) {
			this.titulo = titulo;
			this.aņoPublicacion = aņoPublicacion;
			this.numeroPaginas = numeroPaginas;
		}

		public abstract double calcularMultas(int diasRetraso);

		public String getResumen() {
			return "MaterialBiblioteca [titulo=" + titulo + ", aņoPublicacion=" + aņoPublicacion + ", numeroPaginas="
					+ numeroPaginas + "]";
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAņoPublicacion() {
			return aņoPublicacion;
		}

		public void setAņoPublicacion(String aņoPublicacion) {
			this.aņoPublicacion = aņoPublicacion;
		}

		public int getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(int numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}
		
}
