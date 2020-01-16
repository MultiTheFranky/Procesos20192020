package dao;

import dominio.Denuncia;

public interface IDenunciasDAO {
	Denuncia crearDenuncia(Denuncia denuncia);
	Denuncia eliminarDenuncia(Denuncia denuncia);
}
