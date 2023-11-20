package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface Calculation2Remote {
	int sum(int a, int b);	
	int sub(int a, int b);
	int mult(int a, int b);

}
