package controladores;

import java.util.Calendar;

import dtos.Accesos;
import dtos.Usuarios;
import servicios.AccesosRepository;
import servicios.ImplAccesos;
import servicios.ImplUsuarios;
import servicios.UsuariosRepository;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuariosRepository usuarios = new ImplUsuarios();
		AccesosRepository accesos = new ImplAccesos();
		Usuarios usuario1 = new Usuarios("77959838T","Ivan","Vazquez","954444648","alumno!","ivan12@gmail.com",false,Calendar.getInstance());
		Accesos acceso1= new Accesos("web","Acceso mediante pagina web");
		
		usuarios.save(usuario1);
		accesos.save(acceso1);
	}

}
