package es.unican.ps.ucpark.negocio;

import javax.ejb.EJB;

import dao.IUsuariosDAO;
import dominio.Usuario;
import dominio.Vehiculo;
import gestion.IGestionUsuario;
import gestion.IRegistrar;

public class GestionUsuarios implements IGestionUsuario, IRegistrar {
	
	@EJB
	IUsuariosDAO UDAO;
	
	public GestionUsuarios() {
		
	}

	public boolean registrarVehiculo(Vehiculo vehiculo, Usuario u) {
		return UDAO.asignaVehiculo(vehiculo, u);
	}

	public boolean desasignarVehiculo(Vehiculo vehiculo, Usuario u) {
		return UDAO.desasignarVehiculo(vehiculo,u);
	}

	public boolean registrar(String email, String contrasena) {
		return UDAO.crearUsuario(new Usuario(email,contrasena)) != null;	
	}

}
