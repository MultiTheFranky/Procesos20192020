package es.unican.ps.ucpark.negocio;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.IDenunciasDAO;
import dominio.Denuncia;
import gestion.IGestionDenuncias;
@Stateless
public class GestionDenuncias implements IGestionDenuncias {
	
	@EJB
	IDenunciasDAO VDAO;
	
	public GestionDenuncias() {
		
	}

	public boolean anularDenuncia(Denuncia denuncia) {
		return VDAO.eliminarDenuncia(denuncia) != null;
	}

	public boolean denunciar(Denuncia denuncia) {
		return VDAO.crearDenuncia(denuncia) != null;
	}
}
