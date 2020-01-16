package gestion;

import javax.ejb.Remote;

import dominio.Usuario;
import dominio.Vehiculo;

@Remote
public interface IGestionUsuario {
	boolean registrarVehiculo(Vehiculo vehiculo, Usuario u);
	boolean desasignarVehiculo(Vehiculo vehiculo, Usuario u);
}
