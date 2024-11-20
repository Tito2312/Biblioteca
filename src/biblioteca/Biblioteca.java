package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<MaterialBiblioteca> listaMateriales;

	public Biblioteca() {
		this.listaMateriales = new ArrayList<>();
	}

	public ArrayList<MaterialBiblioteca> getListaMateriales() {
		return listaMateriales;
	}

	public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
		this.listaMateriales = listaMateriales;
	}
	
	public void agregarMateriales(MaterialBiblioteca material) {
		this.listaMateriales.add(material);
	}
	
	public void prestarMaterial(String titulo, String nombreUsuario) {
		for (MaterialBiblioteca materialBiblioteca : listaMateriales) {
			if(materialBiblioteca.getTitulo().equals(titulo)) {
				if (materialBiblioteca instanceof Libro) {
					Libro libro = (Libro) materialBiblioteca;
					if(libro.isPrestado() == false) {
						libro.prestar(nombreUsuario);						
					}
				}else if(materialBiblioteca instanceof Libro) {
					Revista revista = (Revista) materialBiblioteca;
					if(revista.isPrestado() == false) {
						revista.prestar(nombreUsuario);						
					}
				}
			}
		}
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
	
}
