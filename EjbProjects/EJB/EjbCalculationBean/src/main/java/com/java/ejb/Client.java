package com.java.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
	
	public static void main(String[] args) {
		CalculationBeanRemote service;
		
		try {
			service = (CalculationBeanRemote) new InitialContext().lookup("CalculationBean/remote");
			System.out.println();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
