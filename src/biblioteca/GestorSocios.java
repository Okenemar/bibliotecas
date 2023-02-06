package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	static void run(Scanner scan) throws SQLException{
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Socio socio = new Socio();
		
		int id;

		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				
				socio = FormulariosDeDatos.pedirDatosSocio(scan);
				gestorBBDD.conectar();
				gestorBBDD.insertarSocio(socio);
				gestorBBDD.cerrar();
				
				break;
			
			case Menu.ELIMINAR_SOCIO:
				
				id = FormulariosDeDatos.pediridSocio(scan);
				gestorBBDD.conectar();
				gestorBBDD.eliminarSocio(id);
				gestorBBDD.cerrar();
				
				break;
			
			case Menu.MODIFICAR_SOCIO:
				
				id = FormulariosDeDatos.pediridSocio(scan);
				gestorBBDD.conectar();
				socio = FormulariosDeDatos.modificarDatosSocio(socio, scan);
				gestorBBDD.modificarSocio(socio, id);
				gestorBBDD.cerrar();
			
			case Menu.VER_SOCIOS:
				gestorBBDD.conectar();
				Visor.mostrarSocios(gestorBBDD.mostrarSocios());
				gestorBBDD.cerrar();
			}
		}while (opcion!=Menu.SALIR);
	}
}