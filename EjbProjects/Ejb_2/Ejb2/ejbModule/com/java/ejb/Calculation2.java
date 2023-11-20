package com.java.ejb;


import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculation2
 */
@Stateless
@Remote(Calculation2Remote.class)
public class Calculation2 implements Calculation2Remote {

    /**
     * Default constructor. 
     */
    public Calculation2() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
