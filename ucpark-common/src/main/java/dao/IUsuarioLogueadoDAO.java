package dao;

import dominio.Denuncia;
import dominio.Vehiculo;

public interface IUsuarioLogueadoDAO {
	Vehiculo registrarVehiculo(String matricula, String marca, String modelo);
	void eliminarVehiculo(Vehiculo vehiculo);
	void nuevoEstacionamiento(Vehiculo vehiculo, int minutosEstacionamiento);
	void ampliarEstacionamiento(Vehiculo vehiculo, int minutosAAmpliar);
	void cancelarEstacionamiento(Vehiculo vehiculo);
	void anularDenuncia(Denuncia denuncia);
	void consultar();
	
}
