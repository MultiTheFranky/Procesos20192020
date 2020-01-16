package gestion;

import javax.ejb.Remote;

import dominio.Denuncia;

@Remote
public interface IGestionDenuncias {
	boolean anularDenuncia(Denuncia denuncia);
	boolean denunciar(Denuncia denuncia);
}
