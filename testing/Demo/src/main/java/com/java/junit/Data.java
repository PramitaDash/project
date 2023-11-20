package com.java.junit;

import java.util.Hashtable;
import java.util.Map;

public class Data {
	
	public boolean evenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	
	public Object mapEx(String Key) {
		Map data = new Hashtable();
		data.put("Pramita", "Dash");
		data.put("Ananya", "Routray");
		data.put("Khafia", "K");
		data.put("sai","sudha");
		data.put("sunu", "panda");
		return data.get(Key);
	}
	
	public int max3(int a, int b, int c) {
		int m= a;
		if(m<b) {
			m=b;
		}
		if(m<c) {
			m=b;
		}
		return m;
	}
	
	public String sayHello() {
		return "welcome to junit programming...";
	}
	
	public int sum(int a, int b) {
		return a+b;
	}

}
