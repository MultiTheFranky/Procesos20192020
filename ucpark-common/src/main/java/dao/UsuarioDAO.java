package dao;

import dominio.Usuario;
import dominio.Vehiculo;

public class UsuarioDAO implements IUsuariosDAO {

	public Usuario crearUsuario(Usuario usuario) {
		return usuario;
	}

	public Usuario usuario(String email) {
		return null;
	}

	public Usuario modificar(Usuario usuario) {
		return null;
	}

	public boolean asignaVehiculo(Vehiculo vehiculo, Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean desasignarVehiculo(Vehiculo vehiculo, Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
}
