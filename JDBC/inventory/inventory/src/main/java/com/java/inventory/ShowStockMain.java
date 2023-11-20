package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public class ShowStockMain {
	public static void main(String[] args) {
		StockDAO dao = new StockDAOImpl();
		
		
			try {
				List<Stock> stockList = dao.showStockDao();
				for(Stock stock : stockList) {
					System.out.println(stock);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

}
}


