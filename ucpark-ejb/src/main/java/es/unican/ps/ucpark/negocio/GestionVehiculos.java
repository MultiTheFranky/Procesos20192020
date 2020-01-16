package es.unican.ps.ucpark.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.IVehiculosDAO;
import dominio.Vehiculo;
import gestion.IGestionVehiculos;
@Stateless
public class GestionVehiculos implements IGestionVehiculos {
	
	@EJB
	IVehiculosDAO VDAO;
	
	public GestionVehiculos() {
		
	}

	public boolean registrarVehiculo(Vehiculo vehiculo) {
		return VDAO.crearVehiculo(vehiculo) != null;
	}

	public boolean eliminarVehiculo(Vehiculo vehiculo) {
		return VDAO.eliminarVehiculo(vehiculo) != null;
	}

	
}
