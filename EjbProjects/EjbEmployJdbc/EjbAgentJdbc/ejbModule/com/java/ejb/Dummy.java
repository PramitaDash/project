package com.java.ejb;

import java.sql.SQLException;

public class Dummy {
	
	public static void main(String[] args) {
		try {
			System.out.println(new AgentEjbBean().showAgent());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
