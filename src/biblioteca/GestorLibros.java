package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {
	static void run(Scanner scan) throws SQLException{
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Libro libro = new Libro();
		
		int id;

		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				
				libro = FormulariosDeDatos.pedirDatosLibro(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarLibro(libro);
				gestorBBDD.cerrar();
				
				break;
			
			case Menu.ELIMINAR_LIBRO:
				
				id = FormulariosDeDatos.pediridLibro(scan);
				gestorBBDD.conectar();
				gestorBBDD.eliminarLibro(id);
				gestorBBDD.cerrar();
				
				break;
			
			case Menu.MODIFICAR_LIBROS:
				
				id = FormulariosDeDatos.pediridLibro(scan);
				gestorBBDD.conectar();
				libro = FormulariosDeDatos.modificarDatosLibro(libro, scan);
				gestorBBDD.modificarLibro(libro, id);
				gestorBBDD.cerrar();
			
			case Menu.VER_LIBROS:
				gestorBBDD.conectar();
				Visor.mostrarLibros(gestorBBDD.mostrarLibros());
				gestorBBDD.cerrar();
			}
		}while (opcion!=Menu.SALIR);
	}
}
