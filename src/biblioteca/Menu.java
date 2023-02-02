package biblioteca;
public class Menu {
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	public static final int SALIR = 0;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int VER_LIBROS = 3;
	public static final int MODIFICAR_LIBROS = 4;
	
	public static final int VER_SOCIOS = 1;
	
	public static final int REALIZAR_PRESTAMO = 1;
	
	static void mostrarMenuPrincipal() {
			System.out.println("------MENU-------");
			System.out.println(GESTIONAR_LIBROS + ". Gestionar libros");
			System.out.println(GESTIONAR_SOCIOS + ". Gestionar socios");
			System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}
	
	static void mostrarMenuLibros(){
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_LIBRO + ". Insertar libro");
			System.out.println(ELIMINAR_LIBRO + ". Eliminar libro");
			System.out.println(VER_LIBROS + ". Ver libros");
			System.out.println(MODIFICAR_LIBROS + ". Modificar libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}
	static void mostrarMenuSocios(){
			System.out.println("------MENU-------");
			System.out.println(VER_SOCIOS + ". Ver socios");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
		
	}
	static void mostrarMenuPrestamos() {
			System.out.println("------MENU-------");
			System.out.println(REALIZAR_PRESTAMO + ". Realizar préstamo");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}
}
