package controladores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import daos.*;
import servicios.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Instancio los entity
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		//Instancio los servicios
		Insert i = new Insert();
		Delete d = new Delete();
		Select s = new Select();
		Update u= new Update();
		
		//Creo las listas
		List<Libro>listaLibros = new ArrayList<Libro>();
		List<Prestamo>listaPrestamos= new ArrayList<Prestamo>();
		List<Autor>listaAutores= new ArrayList<Autor>();
		List<Usuario>listaUsuarios= new ArrayList<Usuario>();
		List<Autor>listaAutores1solo= new ArrayList<Autor>();
		
		
		//Hago datos de prueba, incluido dos autores para el mismo libro
		Acceso acceso1= new Acceso("Usu","Acceso usuarios biblioteca");
		i.insertAcceso(em, acceso1);
		
		Usuario usuario1 = new Usuario("77959838T","Ivan","Vazquez","954444648","ivan12@gmail.com","alumno!",false,Calendar.getInstance(),Calendar.getInstance(), acceso1);
		listaUsuarios.add(usuario1);
		i.insertUsuario(em, usuario1);
		
		Coleccion coleccion1= new Coleccion("LaLiga");
		i.insertColeccion(em, coleccion1);
		
		Genero genero1 = new Genero("Deportes","Libro que desarrolla la vida de un fan del futbol");
		i.insertGenero(em, genero1);
		
		Editorial editorial1= new Editorial("FanFutbol");
		i.insertEditorial(em, editorial1);
		
		Autor autor1 = new Autor("Ivan","Vazquez Perez");
		Autor autor2 = new Autor("Ale","Alcerreca");
		Autor autor3= new Autor("Ferxo","Feid");
		Autor autor4=new Autor("Paco","Pepe");
		listaAutores.add(autor1);
		listaAutores1solo.add(autor2);
		i.insertAutor(em, autor1);
		i.insertAutor(em, autor2);
		
		
		Libro libro1= new Libro("87496266D","Futboleros","3",8,editorial1, genero1, coleccion1,listaAutores);
		Libro libro2= new Libro("67416163J","Hoopers","7",10,editorial1, genero1, coleccion1,listaAutores1solo);
		listaLibros.add(libro1);
		listaLibros.add(libro2);
		
		i.insertLibro(em, libro1);
		i.insertLibro(em, libro2);
		
		
		//selectAll
		
		List<Usuario> usuarios =s.selectUsuario(em, usuario1,"SELECT u FROM Usuario u");
		
		for (Usuario aux:usuarios)
			System.out.println(aux.toString());
		
		em.close();
		emf.close();
		
		
	}

}
