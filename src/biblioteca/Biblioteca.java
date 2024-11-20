package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private ArrayList<MaterialBiblioteca> listaMateriales;

	public Biblioteca(String nombre) {
		this.listaMateriales = new ArrayList<>();
		this.nombre = nombre;
	}

	public ArrayList<MaterialBiblioteca> getListaMateriales() {
		return listaMateriales;
	}

	public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
		this.listaMateriales = listaMateriales;
	}
	
	public void agregarLibros(Libro libro) {
		this.listaMateriales.add(libro);
	}
	public void agregarRevistas(Revista revista) {
		this.listaMateriales.add(revista);
	}
	
	public boolean prestarMaterial(String titulo, String nombreUsuario) {
		for (MaterialBiblioteca materialBiblioteca : listaMateriales) {
			if(materialBiblioteca.getTitulo().equals(titulo)) {
				if (materialBiblioteca instanceof Libro) {
					Libro libro = (Libro) materialBiblioteca;
					if(libro.isPrestado() == false) {
						if(libro.prestar(nombreUsuario) == false){
							return false;
						}else {
							return true;
						}
					}
				}else if(materialBiblioteca instanceof Libro) {
					Revista revista = (Revista) materialBiblioteca;
					if(revista.isPrestado() == false) {
						if(revista.isPrestado() == false) {
							if(revista.prestar(nombreUsuario) == false){
								return false;
							}else {
								return true;
							}
						}					
					}
				}
			}
		}
		return false;
	}
	public void devolverMaterial(String titulo, int diasRetraso) {
		for (MaterialBiblioteca materialBiblioteca : listaMateriales) {
			if(materialBiblioteca.getTitulo().equals(titulo)) {
				if (materialBiblioteca instanceof Libro) {
					Libro libro = (Libro) materialBiblioteca;
					libro.devolver();
					libro.calcularMultas(diasRetraso);
				}else if(materialBiblioteca instanceof Libro) {
					Revista revista = (Revista) materialBiblioteca;
					revista.devolver();
					revista.calcularMultas(diasRetraso);
				}
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
