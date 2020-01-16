package es.unican.ps.calculadora.negocio;


import javax.ejb.Stateless;

import es.unican.ps.calculadora.utils.CalculatorEJBRemote;



/**
 * Session Bean implementation class CalculatorEJB
 */
@Stateless
public class CalculatorEJB implements CalculatorEJBRemote {

	/**
	 * Default constructor.
	 */
	public CalculatorEJB() {

	}

	public long add(long i, long j) {
		return i + j;
	}

	public long subtract(long i, long j) {
		return i - j;
	}
	public long multiply(long i, long j) {
		return i * j;
	}

	public double divide(long i, long j) {
		return i / j;
	}

}
