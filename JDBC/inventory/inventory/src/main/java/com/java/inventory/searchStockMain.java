package com.java.inventory;


	import java.sql.SQLException;
	import java.util.Scanner;

	public class searchStockMain {
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			String stockid;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter StockID:   ");
			stockid = sc.next();
			StockDAO dao = new StockDAOImpl();
			
			try {
				System.out.println(dao.searchStockDao(stockid));		
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		}

	}


