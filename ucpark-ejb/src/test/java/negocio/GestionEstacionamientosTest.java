package negocio;

import es.unican.ps.ucpark.negocio.GestionEstacionamientos;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import dao.EstacionamientoDAO;
import dao.VehiculosDAO;
import dominio.Estacionamiento;
import dominio.Vehiculo;

/**
 * 
 * @author Francisco Alamo Garcia y Alvaro Lamadrid Agudo
 *
 */
public class GestionEstacionamientosTest {

	GestionEstacionamientos sut = new GestionEstacionamientos();
	
	EstacionamientoDAO eDAO;
	VehiculosDAO vDAO;
	
	Estacionamiento e;
	Vehiculo v;
	
	@Before
	public void setUP() {
		// mock de estacionamiento
		eDAO = mock(EstacionamientoDAO.class);
		e = new Estacionamiento();
		// mock de vehiculo
		vDAO = mock(VehiculosDAO.class);
		v = new Vehiculo();
		e.setId(1L);
		e.setVehiculo(v); // 'aparcamos' el vehiculo
		when(eDAO.estacionamiento(1L)).thenReturn(e);
	}
	
	
	@Test
	public void nuevoEstacionamientoTest() {
		// se deja en un solo try/catch ya que todos devuelven
		// booleano y los assertFalse no saltaran el fail()
		try {
			assertTrue(sut.nuevoEstacionamiento(v, 10));
			// comprobamos que no se puede meter tiempo negativo
			assertFalse(sut.nuevoEstacionamiento(v, -10));
			// comprobamos que no puede estar mas de 120 minutos
			assertFalse(sut.nuevoEstacionamiento(v, 130));
		}catch (Exception e) {
			fail();
		}
	}
}
