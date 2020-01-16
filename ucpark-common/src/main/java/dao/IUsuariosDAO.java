package dao;

import dominio.Usuario;
import dominio.Vehiculo;

public interface IUsuariosDAO {
	Usuario crearUsuario(Usuario usuario);
	Usuario usuario(String email);
	Usuario modificar(Usuario usuario);
	boolean asignaVehiculo(Vehiculo vehiculo, Usuario usuario);
	boolean desasignarVehiculo(Vehiculo vehiculo, Usuario usuario);
}
