package servicios;

import daos.*;
import jakarta.persistence.EntityManager;

public class Update {

public void updateUsuario(EntityManager em,Usuario usuario){
		
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		
	}
	public void updateAcceso(EntityManager em,Acceso acceso){
		em.getTransaction().begin();
		em.merge(acceso);
		em.getTransaction().commit();
	}
	public void updateLibro(EntityManager em,Libro libro){
		em.getTransaction().begin();
		em.merge(libro);
		
		em.getTransaction().commit();
	}
	public void updateColeccion(EntityManager em,Coleccion coleccion){
		em.getTransaction().begin();
		em.merge(coleccion);
		em.getTransaction().commit();
	}
	public void updatePrestamos(EntityManager em,Prestamo prestamo){
		em.getTransaction().begin();
		em.merge(prestamo);
		em.getTransaction().commit();
	}
	public void updateEditorial(EntityManager em,Editorial editorial){
		em.getTransaction().begin();
		em.merge(editorial);
		em.getTransaction().commit();
	}
	public void updateGenero(EntityManager em,Genero genero){
		em.getTransaction().begin();
		em.merge(genero);
		em.getTransaction().commit();
	}
	public void updateEstadoPrestamo(EntityManager em,EstadoPrestamo estaprestamo){
		em.getTransaction().begin();
		em.merge(estaprestamo);
		em.getTransaction().commit();
	}
}
