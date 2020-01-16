package dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String email;
	private String contrasena;
	private List<Vehiculo> vehiculos;
	
	public Usuario(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		vehiculos = new ArrayList<Vehiculo>();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
}
