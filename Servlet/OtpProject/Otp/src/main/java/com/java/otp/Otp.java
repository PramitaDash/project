package com.java.otp;



	import java.sql.Date;

	public class Otp {
		
		private int Otp_ID;
		private int Cust_ID;
		private String OptCode;
		private Date GeneratedOnl;
		public int getOtp_ID() {
			return Otp_ID;
		}
		public void setOtp_ID(int otp_ID) {
			Otp_ID = otp_ID;
		}
		public int getCust_ID() {
			return Cust_ID;
		}
		public void setCust_ID(int cust_ID) {
			Cust_ID = cust_ID;
		}
		public String getOptCode() {
			return OptCode;
		}
		public void setOptCode(String optCode) {
			OptCode = optCode;
		}
		public Date getGeneratedOnl() {
			return GeneratedOnl;
		}
		public void setGeneratedOnl(Date generatedOnl) {
			GeneratedOnl = generatedOnl;
		}
		public Otp(int otp_ID, int cust_ID, String optCode, Date generatedOnl) {
			super();
			Otp_ID = otp_ID;
			Cust_ID = cust_ID;
			OptCode = optCode;
			GeneratedOnl = generatedOnl;
		}
		public Otp() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Otp [Otp_ID=" + Otp_ID + ", Cust_ID=" + Cust_ID + ", OptCode=" + OptCode + ", GeneratedOnl="
					+ GeneratedOnl + "]";
		}
		
		

	}


