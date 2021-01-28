package UT22;

public class ut22 {
	private String Titulo;
	private String Autor;
	private int Ejemplares;
	private int Prestados;
	private int prestado;
	private int devuelto;

	public void Libro(int ejemplares, int prestados) {
	}

	public String getTitulo(String Titulo) {
		return Titulo;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public String getAutor(String Autor) {
		return Autor;
	}

	public void setAutor(String Autor) {
		this.Autor = Autor;
	}

	public int getEjemplares(int Ejemplares) {
		return Ejemplares;
	}

	public void setEjemplares(int Ejemplares) {
		this.Ejemplares = Ejemplares;
	}

	public int getPrestamos(int Prestados) {
		return Prestados;
	}

	public void setPrestamos(int Prestados) {
		this.Prestados = Prestados;
	}

	public void Vuelta() {
		if (Prestados != 0) {
			Ejemplares++;
			System.out.println("Se ha dado el libro");
		}
	}

	public void Alquiler() {
		if (Prestados < Ejemplares) {
			Prestados++;
			System.out.println("si hay libros");
		} else if (Prestados == 0) {
			Prestados--;
			System.out.println("no hay libros");
		}
	}

	public ut22(String string, String string2, int i, int j) {
	}

	public boolean prestado() {
		if (this.prestado > 0) {
			this.prestado--;
		} else {
			this.prestado++;
		}
		return false;
	}

	public boolean devuelto() {
		if (this.devuelto<0) {
			this.devuelto++;
		} else {
			return true;
		}
		return false;
	}

}
