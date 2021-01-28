package UT22;

import java.util.Scanner;

class ut221 {

	public static void main(String[] args) {
		ut22 Libro1 = new ut22("La casa de La pradera", "chiquito de la calzada", 10, 9);
		ut22 Libro2 = new ut22("\"el ultimo mohicano", "Kiko Rivera", 5, 4);
		// ut22 Libro3=new ut22;
		if (Libro1.prestado()) {
			// no me funciona el +Libro1.getEjemplares hay que darle un valor entero a
			// getEjemplares
			System.out.println("Se ha hecho el alquiler" + Libro1.getEjemplares(0));
		}
		if (Libro1.devuelto()) {
			// Lo mismo que el Libro1.getEjemplares
			System.out.println("Se ha devuelto el libro" + Libro1.getPrestamos(0));
		}
		if (Libro2.prestado()) {
			System.out.println("Se ha hecho el Alquiler" + Libro2.getEjemplares(0));
		}
		if (Libro2.devuelto()) {
			System.out.println("Se ha hecho el alquiler del libro" + Libro2.getEjemplares(0));
		}
		// Scanner pepe=new Scanner(System.in);
		// libro3.setTitulo(sc.nextString);
		//// libro3.setAutor(sc.nexString);
		// libro3.setEjemplares(sc.nextInt);
		// libro3.setPrestados(sc.nextInt);
		// pepe.close();
	}

}
