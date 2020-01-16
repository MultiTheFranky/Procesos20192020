package es.unican.ps.funciones;

import javax.ejb.Remote;

@Remote
public interface FuncionesRemote {
	
	public long cuadrado(long x);
	public long cuadradoSuma(long a, long b);

}
