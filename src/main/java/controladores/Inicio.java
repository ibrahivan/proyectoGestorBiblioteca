package controladores;

import java.util.Calendar;

import daos.Accesos;
import daos.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Usuarios usuario1 = new Usuarios("77959838T","Ivan","Vazquez","954444648","alumno!","ivan12@gmail.com",false,Calendar.getInstance());
		Accesos acceso1= new Accesos("Usuario","Acceso usuarios biblioteca");
		em.persist(usuario1);
		em.persist(acceso1);
		em.getTransaction().commit();
		em.close();
		
	}

}
