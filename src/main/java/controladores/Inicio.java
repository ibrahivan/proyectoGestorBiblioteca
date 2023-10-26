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
		Accesos acceso1= new Accesos("Usu","Acceso usuarios biblioteca");
		EstadosPrestamos estadopres1=new EstadosPrestamos("Activo","Esta activo del prestamo");
		Generos genero1 = new Generos("Deportes","Libro que desarrolla la vida de un fan del futbol");
		Editoriales editorial1= new Editoriales("FanFutbol");
		Colecciones coleccion1= new Colecciones("LaLiga");
		Autores autor1 = new Autores("Ivan","Vazquez Perez");
		Autores autor2 = new Autores("Ale","Alcerreca");
		Usuarios usuario1 = new Usuarios("77959838T","Ivan","Vazquez","954444648","ivan12@gmail.com","alumno!",false,Calendar.getInstance(),Calendar.getInstance(), acceso1);
		Libros libro1= new Libros("87496266D","Futboleros","3",8,editorial1, genero1, coleccion1);
		RelAutoresLibros relAutoresLib1= new RelAutoresLibros(autor1,libro1);
		RelAutoresLibros relAutoresLib2 = new RelAutoresLibros(autor2,libro1);
		Prestamos prestamo1 = new Prestamos(usuario1,libro1,Calendar.getInstance(),Calendar.getInstance(),Calendar.getInstance(),estadopres1);
		
		
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
		em.persist(relAutoresLib1);
		em.persist(relAutoresLib2);
		em.persist(autor1);
		em.persist(autor2);
	//commit para que lo mande a la bd
		em.getTransaction().commit();
	//cierro las transacciones
		em.close();
		
	}

}
