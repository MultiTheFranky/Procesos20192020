package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dominio.Denuncia;

public class DenunciasDAO implements IDenunciasDAO {

	@PersistenceContext(unitName="ucpark")
	private EntityManager em;

	public Denuncia crearDenuncia(Denuncia denuncia) {
		// TODO Auto-generated method stub
		return null;
	}

	public Denuncia eliminarDenuncia(Denuncia denuncia) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
