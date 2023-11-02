package servicios;

import daos.*;
import jakarta.persistence.EntityManager;

public class Delete {

	public void deteleUsuario(EntityManager em,Usuario usuario){
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		
	}
	public void deteleAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.remove(acceso);
		em.getTransaction().commit();
	}
	public void deteleLibro(EntityManager em,Libro libro){
		em.getTransaction().begin();
		em.remove(libro);
		em.getTransaction().commit();
	}
	public void deteleColeccion(EntityManager em,Coleccion coleccion){
		em.getTransaction().begin();
		em.remove(coleccion);
		em.getTransaction().commit();
	}
	public void detelePrestamos(EntityManager em,Prestamo prestamo){
		em.getTransaction().begin();
		em.remove(prestamo);
		em.getTransaction().commit();
	}
	public void deteleEditorial(EntityManager em,Editorial editorial){
		em.getTransaction().begin();
		em.remove(editorial);
		em.getTransaction().commit();
	}
	public void deteleGenero(EntityManager em,Genero genero){
		em.getTransaction().begin();
		em.remove(genero);
		em.getTransaction().commit();
	}
	public void deteleEstadoPrestamo(EntityManager em,EstadoPrestamo estaprestamo){
		em.getTransaction().begin();
		em.remove(estaprestamo);
		em.getTransaction().commit();
	}
}
