package com.java.ejb;

import java.util.Properties;


import javax.faces.event.ActionEvent;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CalculationBAL {
	
	private int firstNo;
	private int secondNo;
	private int result;
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public CalculationBAL(int firstNo, int secondNo, int result) {
		
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.result = result;
	}
	public CalculationBAL() {
		
	}
	
	public void addition(ActionEvent evt) throws NamingException {
		Calculation2Remote statelessRemoteCalculator = null;
		
		statelessRemoteCalculator = lookupRemoteStatelessCalculator();
		System.out.println("Ejb bussiness logic Gwtting Started");
		this.result = statelessRemoteCalculator.sum(this.firstNo, this.secondNo);
		
		
	}
	
	private static Context createInitialContext() throws NamingException {
        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, 
          "org.jboss.naming.remote.client.InitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES, 
          "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL, 
           "http-remoting://localhost:8080");
        jndiProperties.put("jboss.naming.client.ejb.context", true);
        return new InitialContext(jndiProperties);
    }
	private Calculation2Remote lookupRemoteStatelessCalculator() throws NamingException {
		Context ctx = createInitialContext();
		final String distinctName="";
		final String beanName = "Calculation2";
		System.out.println(beanName);
		
	final String viewClassName = Calculation2Remote.class.getName();
	String appName = "";
	String moduleName = "Ejb2";
	
	return(Calculation2Remote) ctx.lookup("ejb:"
			+ appName + "/" + moduleName 
			+ "/" +distinctName + "/" + beanName + "!"+ viewClassName);
			
	}
	
	
	

}
