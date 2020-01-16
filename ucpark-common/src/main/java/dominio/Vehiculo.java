package dominio;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private Usuario propietario;
	private Estacionamiento estacionamientoEnVigor;
	private List<Denuncia> denunciasEnVigor;
	public Vehiculo(String matricula, String marca, String modelo, Usuario propietario) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
		estacionamientoEnVigor = null;
		denunciasEnVigor = new ArrayList<Denuncia>();
	}
	public Vehiculo() {	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Usuario getPropietario() {
		return propietario;
	}
	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}
	public Estacionamiento getEstacionamientoEnVigor() {
		return estacionamientoEnVigor;
	}
	public void setEstacionamientoEnVigor(Estacionamiento estacionamientoEnVigor) {
		this.estacionamientoEnVigor = estacionamientoEnVigor;
	}
	public List<Denuncia> getDenunciasEnVigor() {
		return denunciasEnVigor;
	}
	public void setDenunciasEnVigor(List<Denuncia> denunciasEnVigor) {
		this.denunciasEnVigor = denunciasEnVigor;
	}
}
