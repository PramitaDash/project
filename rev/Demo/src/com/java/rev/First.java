package com.java.rev;

public class First {
	
	     int id;
	     String name;
	     First() {
		id=1;
	        name="Prasanna";
	     }
		public String toString() {
			return "Id " +id + " Name " + name;
		}
	

	public class Second extends First {
		Second() {
		}
	}
	System.out.println(new Second());


}
