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
		em.persist(usuario);
		return usuario;
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
		return true;
	}

	public boolean desasignarVehiculo(Vehiculo vehiculo, Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
}
