package dao;

import dominio.Denuncia;

public interface IDenunciasDAO {
	Denuncia crearDenuncia(Denuncia denuncia);
	Denuncia denuncia(Long id);
	Denuncia eliminarDenuncia(Denuncia denuncia);
}
