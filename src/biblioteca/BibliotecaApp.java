package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class BibliotecaApp {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Scanner scan =new Scanner(System.in);
		GestorLibros.run(scan);
		GestorSocios.run(scan);
}
}
