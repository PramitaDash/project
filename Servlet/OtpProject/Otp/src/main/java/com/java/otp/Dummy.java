package com.java.otp;




	import java.sql.SQLException;

	public class Dummy {

		public static void main(String[] args) {
			Customer customer = new Customer();
			customer.setCustomer_Firstname("Ananya");
			customer.setCustomer_LastName("Routry");
			customer.setCustomer_UserName("Khafia");
			customer.setCustomer_Password("Khafia");
			customer.setCustomer_Email("ananyaRoutry17122001@gmail.com");
			customer.setCustomer_PhoneNo("84848864");
			CustomerDAO dao = new CustomerDAOImpl();
			try {
				System.out.println(dao.addCustomerDao(customer));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}






