package com.java.inventory;

	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	public class StockDAOImpl implements StockDAO{
		
		Connection connection;
		PreparedStatement pst;
		
		public String generateStockid() throws ClassNotFoundException, SQLException {
 		connection = ConnectionHelper.getConnection();
 		String cmd = "select max(Stockid) sid from Stock";
    	pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
    		rs.next();
    	String sid = rs.getString("sid");
    	int id = Integer.parseInt(sid.substring(1));
    	id++;
    	sid = String.format("S%03d", id);
		return sid;
		}

		@Override
		public List<Stock> showStockDao() throws ClassNotFoundException, SQLException {
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from Stock";
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			Stock stock = null;
			List<Stock> stockList = new ArrayList<Stock>();
			while(rs.next()) {
				stock = new Stock();
				stock.setStockid(rs.getString("stockid"));
				stock.setItemName(rs.getString("ItemName"));
				stock.setPrice(rs.getDouble("Price"));
				stock.setQuantityAvail(rs.getInt("QuantityAvail"));
				stockList.add(stock);
			}
			return stockList;
		}

		@Override
		public Stock searchStockDao(String stockid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where stockid = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockid);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if (rs.next()) {
			stock = new Stock();
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
		}
		return stock;
		}

		

		@Override
		public String addStockDao(Stock stock) throws ClassNotFoundException, SQLException {
			String id = generateStockid();
			stock.setStockid(id);
			connection = ConnectionHelper.getConnection();
			String cmd = "Insert into Stock(Stockid, ItemName, Price, QuantityAvail)value(?,?,?,?)";
			pst= connection.prepareStatement(cmd);
			pst.setString(1, stock.getStockid());
			pst.setString(2, stock.getItemName());
			pst.setDouble(3, stock.getPrice());
			pst.setInt(4, stock.getQuantityAvail());
			pst.executeUpdate();
			System.out.println("***Stock updated****");
			return "Stock insert";
		}
		

	}

