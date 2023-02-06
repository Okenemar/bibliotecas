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
	
	public static Socio pedirDatosSocio(Scanner scan){
		Socio socio = new Socio();
		String nombre;
		String apellido;
		String direccion;
		String poblacion;
		String provincia;
		String dni;
		
		System.out.println("Introduce el nombre del nuevo socio");
		nombre= scan.nextLine(); 
		System.out.println("Introduce el apellido del nuevo socio");
		apellido= scan.nextLine();
		System.out.println("Introduce la dirección del nuevo socio");
		direccion = scan.nextLine();
		System.out.println("Introduce la población del nuevo socio");
		poblacion = scan.nextLine();
		System.out.println("Introduce la provincia del nuevo socio");
		provincia = scan.nextLine();
		System.out.println("Introduce el dni del nuevo socio");
		dni = scan.nextLine();
		
		socio.setNombre(nombre);
		socio.setApellido(apellido);
		socio.setDireccion(direccion);
		socio.setPoblacion(poblacion);
		socio.setProvincia(provincia);
		socio.setDni(dni);
		
		return socio;
}
	
	public static Socio modificarDatosSocio(Socio socio, Scanner scan) {
		
		System.out.println("Introduce el nuevo nombre del socio");
		socio.setNombre(scan.nextLine()); 
		System.out.println("Introduce el nuevo apellido del socio");
		socio.setApellido(scan.nextLine()); 
		System.out.println("Introduce la nueva dirección del socio");
		socio.setDireccion(scan.nextLine()); 
		System.out.println("Introduce la nueva población del socio");
		socio.setPoblacion(scan.nextLine()); 
		System.out.println("Introduce la nueva provincia del socio");
		socio.setProvincia(scan.nextLine()); 
		System.out.println("Introduce el nuevo dni del socio");
		socio.setDni(scan.nextLine()); 
		
		return socio;
	}
	
	public static int pediridSocio(Scanner scan) {
		int id;
		System.out.println("Introduce el id del socio que quieres");
		id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	
}
