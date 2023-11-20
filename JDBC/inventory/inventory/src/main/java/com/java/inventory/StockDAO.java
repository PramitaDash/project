package com.java.inventory;

import java.sql.SQLException;
import java.util.List;

public interface StockDAO {
	
		List<Stock> showStockDao() throws ClassNotFoundException, SQLException;
		Stock searchStockDao(String stockid) throws ClassNotFoundException, SQLException;
		String addStockDao(Stock stock) throws ClassNotFoundException, SQLException;;
}
