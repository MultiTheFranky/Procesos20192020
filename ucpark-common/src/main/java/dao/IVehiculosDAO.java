package dao;

import dominio.Vehiculo;

public interface IVehiculosDAO {
	Vehiculo crearVehiculo(Vehiculo vehiculo);
	Vehiculo vehiculo(String matricula);
	Vehiculo eliminarVehiculo(Vehiculo vehiculo);
}
