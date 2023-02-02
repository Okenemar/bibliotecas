package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca  {
	
		static Scanner scan = new Scanner(System.in);
		
		public static void run() throws SQLException {
			int opcion;
			
			do {
				Menu.mostrarMenuPrincipal();
				
				opcion = Integer.parseInt(scan.nextLine());
				
				switch (opcion) {
				case Menu.GESTIONAR_LIBROS:
					GestorLibros.run(scan);
					break;
				
				case Menu.GESTIONAR_SOCIOS:
					GestorSocios.run(scan);
					break;
				
				case Menu.GESTIONAR_PRESTAMOS:
					System.out.println("No disponible");
					break;
				
				case Menu.SALIR:
					
				}
				
			}while (opcion != Menu.SALIR); 			
			
		}
}

