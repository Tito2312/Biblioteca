package biblioteca;

public class Libro extends MaterialBiblioteca implements Prestamo{
	
	private String autor;
	private String nombreUsuario;
	private boolean isPrestado;

	@Override
	public double calcularMultas(int diasRetraso){
		return diasRetraso*2000;
	}
	
	@Override
	public void prestar(String nombreUsuario) {
		this.isPrestado = true;
		this.nombreUsuario = nombreUsuario;
	}
	
	@Override
	public void devolver() {
		this.isPrestado = false;
		this.nombreUsuario = "";
		
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Libro(String titulo, String a�oPublicacion, int numeroPaginas, String autor, double multa,
			boolean isPrestado, String nombreUsuario) {
		super(titulo, a�oPublicacion, numeroPaginas);
		this.autor = autor;
		this.isPrestado = isPrestado;
		this.nombreUsuario = nombreUsuario;
	}

	public boolean isPrestado() {
		return isPrestado;
	}

	public void setPrestado(boolean isPrestado) {
		this.isPrestado = isPrestado;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


}
