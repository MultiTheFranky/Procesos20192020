package es.unican.ps.calculadora.utils;

import javax.ejb.Remote;

@Remote
public interface CalculatorEJBRemote {
	 public long add(long i, long j);
	 public long subtract(long i, long j);
	 public long multiply(long i, long j);
	 public double divide(long i, long j);
}
