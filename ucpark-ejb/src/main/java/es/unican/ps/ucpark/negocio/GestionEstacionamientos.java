package es.unican.ps.ucpark.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.IEstacionamientoDAO;
import dominio.Estacionamiento;
import dominio.Vehiculo;
import gestion.IGestionEstacionamiento;
@Stateless
public class GestionEstacionamientos implements IGestionEstacionamiento {
	
	@EJB
	IEstacionamientoDAO EDAO;
	
	public GestionEstacionamientos() {
		
	}

	public boolean nuevoEstacionamiento(Vehiculo vehiculo, int tiempoEstacionamiento) {
		vehiculo.setEstacionamientoEnVigor(EDAO.crearEstacionamiento(vehiculo, tiempoEstacionamiento));
		return comprobarEstacionamiento(vehiculo);
	}

	public boolean ampliarTiempoEstacionamiento(Vehiculo vehiculo, int tiempo) {
		Estacionamiento estacionamiento = vehiculo.getEstacionamientoEnVigor();
		EDAO.eliminarEstacionamiento(estacionamiento.getId());
		vehiculo.setEstacionamientoEnVigor(EDAO.crearEstacionamiento(vehiculo, tiempo+estacionamiento.getMinutos()));
		return comprobarEstacionamiento(vehiculo);
	}

	public boolean cancelarEstacionamiento(Vehiculo vehiculo) {
		Estacionamiento e = vehiculo.getEstacionamientoEnVigor();
		vehiculo.setEstacionamientoEnVigor(null);
		return EDAO.eliminarEstacionamiento(e.getId()) != null;
		
	}

	public boolean finalizarEstacionamiento(Vehiculo vehiculo) {
		Estacionamiento e = vehiculo.getEstacionamientoEnVigor();
		vehiculo.setEstacionamientoEnVigor(null);
		return EDAO.eliminarEstacionamiento(e.getId()) != null;
	}

	public boolean comprobarEstacionamiento(Vehiculo vehiculo) {
		int tiempoRestante = EDAO.estacionamiento(vehiculo.getEstacionamientoEnVigor().getId()).getMinutos();
		return tiempoRestante > 0 && tiempoRestante < 120;
		
	}
}
