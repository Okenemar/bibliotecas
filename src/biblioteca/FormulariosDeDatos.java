package biblioteca;

import java.util.Scanner;

public class FormulariosDeDatos extends GestorBBDD{
	public static Libro pedirDatosLibro(Scanner scan){
		Libro libro = new Libro();
		String titulo;
		String autor;
		int numPaginas;
		
		System.out.println("Introduce el titulo del libro");
		titulo= scan.nextLine(); 
		System.out.println("Introduce el autor del libro");
		autor= scan.nextLine();
		System.out.println("Introduce el número de páginas del libro");
		numPaginas= Integer.parseInt(scan.nextLine());		
		
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setNumPaginas(numPaginas);
		
		return libro;
}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		
		System.out.println("Introduce el nuevo titulo del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el nuevo autor del libro");
		libro.setTitulo(scan.nextLine()); 
		System.out.println("Introduce el nuevo número de páginas del libro");
		libro.setNumPaginas(Integer.parseInt(scan.nextLine())); 	
		
		return libro;
	}
	
	public static int pediridLibro(Scanner scan) {
		int id;
		System.out.println("Introduce el id del libro que quieres");
		id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	
}
