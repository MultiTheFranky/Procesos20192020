package dominio;

import java.util.Date;

public class Denuncia {
	private Date fecha;
	private double importe;
	private String causa;
	private Vehiculo vehiculoDenunciado;

	public Denuncia(Date fecha, double importe, String causa, Vehiculo vehiculoDenunciado) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.causa = causa;
		this.vehiculoDenunciado = vehiculoDenunciado;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public Vehiculo getVehiculoDenunciado() {
		return vehiculoDenunciado;
	}
	public void setVehiculoDenunciado(Vehiculo vehiculoDenunciado) {
		this.vehiculoDenunciado = vehiculoDenunciado;
	}
	
}
