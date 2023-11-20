package com.java.otp;



	import java.sql.SQLException;

	public interface CustomerDAO {
		
		String addCustomerDao(Customer customer) throws ClassNotFoundException, SQLException;
		Customer searchByUserName(String userName) throws ClassNotFoundException, SQLException;
		String validateOtp(String user, int otpCode) throws ClassNotFoundException, SQLException;

	}



