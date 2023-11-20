package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStockMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stock stock = new Stock();
		System.out.println("Enter Item Name: ");
		stock.setItemName(sc.next());
		System.out.println("Enter price: ");
		stock.setPrice(sc.nextDouble());
		System.out.println("enter QuantityAvail: ");
		stock.setQuantityAvail(sc.nextInt());
		StockDAO dao = new StockDAOImpl();
		
			try {
				System.out.println(dao.addStockDao(stock));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
