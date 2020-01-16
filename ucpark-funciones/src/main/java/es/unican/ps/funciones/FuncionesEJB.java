package es.unican.ps.funciones;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import es.unican.ps.calculadora.utils.CalculatorEJBRemote;

@Stateless
public class FuncionesEJB implements FuncionesRemote {
	
	@EJB
	public CalculatorEJBRemote calculadora;

	@Override
	public long cuadrado(long x) {
		return calculadora.multiply(x, x);
	}

	@Override
	public long cuadradoSuma(long a, long b) {
		long suma = calculadora.add(a,b);
		return calculadora.multiply(suma, suma);
	}
	

}
