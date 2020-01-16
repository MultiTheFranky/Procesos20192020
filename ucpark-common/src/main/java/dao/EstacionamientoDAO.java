package dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.Estacionamiento;
import dominio.Vehiculo;

public class EstacionamientoDAO implements IEstacionamientoDAO {
	
	@PersistenceContext(unitName="ucpark")
	private EntityManager em;

	public Estacionamiento crearEstacionamiento(Vehiculo v, int tiempo) {
		Estacionamiento e = new Estacionamiento();
		e.setHoraInicio(new Date());
		e.setMinutos(tiempo);
		e.setVehiculo(v);
		e.setId(Math.round(Math.random()) * 999999999);
		em.persist(e);
		return e;
	}

	public Estacionamiento estacionamiento(Long id) {
		Query q = em.createQuery("SELECT e from Estacionamiento e WHERE e.id = :idEstacionamiento");
		q.setParameter("idEstacionamiento", id);
		return (Estacionamiento)q.getSingleResult();
	}

	public Estacionamiento eliminarEstacionamiento(Long id) {
		Estacionamiento e = estacionamiento(id);
		em.remove(e);
		return e;
	}

}
