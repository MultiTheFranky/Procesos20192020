package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.Denuncia;
import dominio.Usuario;
import dominio.Vehiculo;

public class UsuarioDAO implements IUsuariosDAO {
	
	@PersistenceContext(unitName="ucpark")
	private EntityManager em;

	public Usuario crearUsuario(Usuario usuario) {
		if(usuario(usuario.getEmail()) == null) { // comprobamos si ya existe un usuario
			em.persist(usuario);
			return usuario;
		}
		return null;
	}

	public Usuario usuario(String email) {
		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :emailUsuario");
		q.setParameter("emailUsuario", email);
		return (Usuario)q.getSingleResult();
	}

	public Usuario modificar(Usuario usuario) {
		em.merge(usuario);
		return usuario;
	}

	public boolean asignaVehiculo(Vehiculo vehiculo, Usuario usuario) {
		List<Vehiculo> lista = usuario.getVehiculos();
		lista.add(vehiculo);
		usuario.setVehiculos(lista);
		vehiculo.setPropietario(usuario);
		return true;
	}

	public boolean desasignarVehiculo(Vehiculo vehiculo, Usuario usuario) {
		usuario.getVehiculos().remove(vehiculo);
		vehiculo.setPropietario(null);
		return true;
	}
}
