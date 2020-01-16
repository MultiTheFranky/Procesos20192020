package gestion;

import javax.ejb.Remote;

@Remote
public interface IRegistrar {
	boolean registrar(String email, String contrasena);
}
