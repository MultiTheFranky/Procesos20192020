package es.unican.ps.calculadora.negocio;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;

import org.junit.*;
import es.unican.ps.calculadora.utils.CalculatorEJBRemote;

public class CalculadoraIT {

	private static EJBContainer ec;
	private static CalculatorEJBRemote calcu;

    @BeforeClass
    public static void initContainer() throws Exception {
        /*Map properties = new HashMap();
    	File[] modules = { new File("/target/classes"), new File("../ucpark-common/target/classes")};
    	properties.put(EJBContainer.MODULES, modules);*/
    	
        //Creamos el contenedor embebido, por defecto, inicializa todos los EJB que est�n en el classpath del cliente
        ec = EJBContainer.createEJBContainer();
        
        // Buscamos el EJB a trav�s de JNDI
        
        // Desde Eclipse
        //  calcu = (CalculatorEJBRemote) ec.getContext().lookup("java:global/classes/CalculatorEJB!es.unican.ps.calculadora.utils.CalculatorEJBRemote");
      
        // Desde Maven
        calcu = (CalculatorEJBRemote) ec.getContext().lookup("java:global/ucpark-ejb-0.0.1-SNAPSHOT/CalculatorEJB!es.unican.ps.calculadora.utils.CalculadoraEJBRemote");
    
   
    }
 
    @AfterClass
    public static void closeContainer() throws Exception {
        //Cerramos el contenedor
        if (ec != null) {
            ec.close();
        }
    }
    
    @Test
    public void testAdd() {
         assertTrue(calcu.add(2, 3) == 3);
    }
}
