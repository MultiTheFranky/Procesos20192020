package gestion;

import javax.ejb.Remote;

import dominio.Vehiculo;

@Remote
public interface IGestionEstacionamiento {
	boolean nuevoEstacionamiento(Vehiculo vehiculo, int tiempoEstacionamiento);
	boolean ampliarTiempoEstacionamiento(Vehiculo vehiculo, int tiempo);
	boolean cancelarEstacionamiento(Vehiculo vehiculo);
	boolean finalizarEstacionamiento(Vehiculo vehiculo);
	boolean comprobarEstacionamiento(Vehiculo vehiculo);
}
