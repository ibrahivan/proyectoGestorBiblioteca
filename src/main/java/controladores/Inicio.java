package controladores;

import java.util.Calendar;


import daos.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancio los entity
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		//Hago datos de prueba, incluido dos autores para el mismo libro
		Acceso acceso1= new Acceso("Usu","Acceso usuarios biblioteca");
		EstadoPrestamo estadopres1=new EstadoPrestamo("Activo","Esta activo del prestamo");
		Genero genero1 = new Genero("Deportes","Libro que desarrolla la vida de un fan del futbol");
		Editorial editorial1= new Editorial("FanFutbol");
		Coleccion coleccion1= new Coleccion("LaLiga");
		Autor autor1 = new Autor("Ivan","Vazquez Perez");
		Autor autor2 = new Autor("Ale","Alcerreca");
		Usuario usuario1 = new Usuario("77959838T","Ivan","Vazquez","954444648","ivan12@gmail.com","alumno!",false,Calendar.getInstance(),Calendar.getInstance(), acceso1);
		Libro libro1= new Libro("87496266D","Futboleros","3",8,editorial1, genero1, coleccion1);
		
		Prestamo prestamo1 = new Prestamo(usuario1,libro1,Calendar.getInstance(),Calendar.getInstance(),Calendar.getInstance(),estadopres1);
		
		
		//Realizo las transacciones
		em.getTransaction().begin();
		
		
		
		
		em.persist(usuario1);
		em.persist(acceso1);
		em.persist(prestamo1);
		em.persist(libro1);
		em.persist(estadopres1);
		em.persist(genero1);
		em.persist(editorial1);
		em.persist(coleccion1);
		em.persist(autor1);
		em.persist(autor2);
		
	//commit para que lo mande a la bd
		em.getTransaction().commit();
	//cierro las transacciones
		em.close();
		
	}

}
