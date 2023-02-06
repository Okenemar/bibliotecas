package biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestorBBDD extends Conector{
	PreparedStatement preparedSt;
	
	public void insertarLibro(Libro libro) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("INSERT INTO libros VALUES (null, ?,?,?)");

		preparedSt.setString(1, libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNumPaginas());
		
		preparedSt.execute();
		
	}
	public void eliminarLibro(int id) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("DELETE FROM libros WHERE id = (?)");
		
		preparedSt.setInt(1, id);
		
		preparedSt.execute();
		
	}
	public Libro getLibro(int id) {
		return null;
	}
	
	public void modificarLibro(Libro libro, int id) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("UPDATE libros SET titulo=?, autor=?, num_pag=? WHERE id=?");
		
		preparedSt.setString(1, libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNumPaginas());
		preparedSt.setInt(4, id);
		
		preparedSt.executeUpdate();
	}		

	public ArrayList<Libro> mostrarLibros() throws SQLException {
		Statement st = con.createStatement();
		
		String sentenciaSelect = "SELECT * FROM libros";
		ResultSet resultado = st.executeQuery(sentenciaSelect);
		ArrayList<Libro> libros = new ArrayList<Libro>();
		while(resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNumPaginas(resultado.getInt("num_pag"));
			
			libros.add(libro);
		}

		return libros;	
	}
	public void insertarSocio(Socio socio) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("INSERT INTO socios VALUES (null, ?,?,?,?,?,?)");

		preparedSt.setString(1, socio.getNombre());
		preparedSt.setString(2, socio.getApellido());
		preparedSt.setString(3, socio.getDireccion());
		preparedSt.setString(4, socio.getPoblacion());
		preparedSt.setString(5, socio.getProvincia());
		preparedSt.setString(6, socio.getDni());
		
		preparedSt.execute();
		
	}
	public void eliminarSocio(int id) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("DELETE FROM socios WHERE id = (?)");
		
		preparedSt.setInt(1, id);
		
		preparedSt.execute();
		
	}
	public Socio getSocio(int id) {
		return null;
	}
	
	public void modificarSocio(Socio socio, int id) throws SQLException {
		
		PreparedStatement preparedSt = con.prepareStatement("UPDATE socios SET nombre=?, apellido=?, direccion=?, poblacion=?, provincia=?, dni=? WHERE id=?");
		
		preparedSt.setString(1, socio.getNombre());
		preparedSt.setString(2, socio.getApellido());
		preparedSt.setString(3, socio.getDireccion());
		preparedSt.setString(4, socio.getPoblacion());
		preparedSt.setString(5, socio.getProvincia());
		preparedSt.setString(6, socio.getDni());
		preparedSt.setInt(7, id);

		preparedSt.executeUpdate();
	}		

	public ArrayList<Socio> mostrarSocios() throws SQLException {
		Statement st = con.createStatement();
		
		String sentenciaSelect = "SELECT * FROM socios";
		ResultSet resultado = st.executeQuery(sentenciaSelect);
		ArrayList<Socio> socios = new ArrayList<Socio>();
		while(resultado.next()) {
			Socio socio = new Socio();
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
			
			socios.add(socio);
		}

		return socios;	
	}
}
	
