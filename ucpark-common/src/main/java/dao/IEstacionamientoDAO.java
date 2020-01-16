package dao;

import dominio.Estacionamiento;
import dominio.Vehiculo;

public interface IEstacionamientoDAO {
	Estacionamiento crearEstacionamiento(Vehiculo v, int tiempo);
	Estacionamiento estacionamiento(Long id);
	Estacionamiento eliminarEstacionamiento(Long id);
}
