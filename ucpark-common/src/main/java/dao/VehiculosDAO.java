package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.IVehiculosDAO;
import dominio.Vehiculo;

public class VehiculosDAO implements IVehiculosDAO {
	@PersistenceContext(unitName="ucpark")
	private EntityManager em;

	public Vehiculo crearVehiculo(Vehiculo vehiculo) {
		em.persist(vehiculo);
		return vehiculo;
	}

	public Vehiculo eliminarVehiculo(Vehiculo vehiculo) {
		em.remove(vehiculo);
		return vehiculo;
	}

	public Vehiculo vehiculo(String matricula) {
		Query q = em.createQuery("SELECT v FROM Vehiculo v WHERE v.matricula = :mat");
		q.setParameter("mat", matricula);
		return (Vehiculo)q.getSingleResult();
	}

}

