package servicios;

import java.util.List;

import daos.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Select {

	public List<Usuario> selectUsuario(EntityManager em,Usuario usuario,String query){
		TypedQuery<Usuario> consulta = em.createQuery(query,Usuario.class);
		consulta.setParameter("dni", usuario.getDni_usuario());
		List<Usuario> usuarios = consulta.getResultList();
		return usuarios;
		
	}
	public List<Acceso> selectAcceso(EntityManager em,Acceso acceso,String query){
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);
		consulta.setParameter("codigo", acceso.getCodigo_acceso());
		List<Acceso> listaAcceso = consulta.getResultList();
		return listaAcceso;
	}
	public List<Libro> selectLibro(EntityManager em,Libro libro,String query){
		TypedQuery<Libro> consulta = em.createQuery(query,Libro.class);
		consulta.setParameter("isbnLibro", libro.getIsbn_libro());
		List<Libro> listaLibro = consulta.getResultList();
		return listaLibro;
	}
	public List<Coleccion> selectColeccion(EntityManager em,Coleccion coleccion,String query){
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		consulta.setParameter("nombreColeccion", coleccion.getNombre_coleccion());
		List<Coleccion> listaColeccion = consulta.getResultList();
		return listaColeccion;
	}
	public List<Prestamo> selectPrestamos(EntityManager em,Prestamo prestamo,String query){
		TypedQuery<Prestamo> consulta = em.createQuery(query,Prestamo.class);
		consulta.setParameter("fechaPrestamo", prestamo.getFch_fin_prestamo());
		List<Prestamo> listaPrestamos = consulta.getResultList();
		return listaPrestamos;
	}
	public List<Editorial> selectEditorial(EntityManager em,Editorial editorial,String query){
		TypedQuery<Editorial> consulta = em.createQuery(query,Editorial.class);
		consulta.setParameter("nombreEditorial", editorial.getNombre_editorial());
		List<Editorial> listaEditorial = consulta.getResultList();
		return listaEditorial;
	}
	public List<Genero> selectGenero(EntityManager em,Genero genero,String query){
		TypedQuery<Genero> consulta = em.createQuery(query,Genero.class);
		consulta.setParameter("nombreGenero", genero.getNombre_genero());
		List<Genero> listaGenero = consulta.getResultList();
		return listaGenero;
	}
	public List<EstadoPrestamo> selectEstadoPrestamo(EntityManager em,EstadoPrestamo estapres,String query){
		TypedQuery<EstadoPrestamo> consulta = em.createQuery(query,EstadoPrestamo.class);
		consulta.setParameter("fechapresta", estapres.getCodigo_estado_prestamo());
		List<EstadoPrestamo> listaEstadoPrestamo = consulta.getResultList();
		return listaEstadoPrestamo;
	}
	public List<Autor> selectAutores(EntityManager em,Autor autor,String query){
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		consulta.setParameter("nombre", autor.getNombre_autor());
		List<Autor> listaAutor = consulta.getResultList();
		return listaAutor;
	}
}
