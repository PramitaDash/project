package com.java.rev;

public class Qize5 {

	    public int sum(int x) {
		return x+5;
	    }
	}

	 class Second extends Qize5 {
	    public int sum(int x) {
		System.out.println("Hello " +x);
		return x;
	    }
	}

	 class Main {
	    public static void main(String[] args) {
		new Second().sum(12);
	    }
	}


		

