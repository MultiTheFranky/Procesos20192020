package gestion;

import javax.ejb.Remote;

import dominio.Vehiculo;
@Remote
public interface IGestionVehiculos {
	boolean registrarVehiculo(Vehiculo vehiculo);
	boolean eliminarVehiculo(Vehiculo vehiculo);
}
