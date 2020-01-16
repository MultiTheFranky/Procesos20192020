package es.unican.ps.calculadora.web;

import javax.annotation.PostConstruct;

//import java.io.IOException;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import es.unican.ps.calculadora.utils.CalculatorEJBRemote;


@Named
@RequestScoped
public class CalculatorBean {
	
	@EJB
	private CalculatorEJBRemote myCalculator;
	
	private long op1;
	private long op2;
	private long result;
	
	

	public long getOp1() {
		return op1;
	}


	public void setOp1(long op1) {
		this.op1 = op1;
	}


	

	public long getOp2() {
		return op2;
	}


	public void setOp2(long op2) {
		this.op2 = op2;
	}


	public long getResult() {
		return result;
	}


	public void setResult(long result) {
		this.result = result;
	}


	public String add()  {
	
		
//		    	try {
//		        String cmd ="asadmin create-user-file --groups=PS1415 --passwordFile=C:\temp\nuevoUsuario.txt patri3";
//		        Runtime.getRuntime().exec(cmd);
//		        } catch (IOException ioe) {
//		        	System.out.println (ioe);
//		        }
//		
		
		result=  myCalculator.add(op1, op2);
		return "";
	}

}
