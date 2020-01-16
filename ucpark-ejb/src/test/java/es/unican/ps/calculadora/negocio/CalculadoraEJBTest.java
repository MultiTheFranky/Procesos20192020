package es.unican.ps.calculadora.negocio;
import static org.junit.Assert.*;

import org.junit.Test;

import es.unican.ps.calculadora.negocio.CalculatorEJB;


public class CalculadoraEJBTest {
	
	private CalculatorEJB calcu = new CalculatorEJB();

    
    @Test
    public void testAdd() {

    	assertTrue(calcu.add(2, 3) == 5);
    }

}
