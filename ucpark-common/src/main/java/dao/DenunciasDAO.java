package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.Denuncia;

public class DenunciasDAO implements IDenunciasDAO {

	@PersistenceContext(unitName="ucpark")
	private EntityManager em;

	public Denuncia crearDenuncia(Denuncia denuncia) {
		em.merge(denuncia);
		return denuncia;
	}
	
	public Denuncia denuncia(Long id) {
		Query q = em.createQuery("SELECT d FROM Denuncia d WHERE d.id = :idDenuncia");
		q.setParameter("idDenuncia", id);
		return (Denuncia)q.getSingleResult();
	}

	public Denuncia eliminarDenuncia(Denuncia denuncia) {
		em.remove(denuncia);
		return denuncia;
	}
}
