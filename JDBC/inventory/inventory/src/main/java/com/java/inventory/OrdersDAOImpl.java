package com.java.inventory;


	
	import java.sql.Connection;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	public class OrdersDAOImpl implements OrderDAO{
		
		Connection connection;
		PreparedStatement pst;
		
		public String generateOrderId() throws ClassNotFoundException, SQLException {
 		connection = ConnectionHelper.getConnection();
 		String cmd = "select max(OrderId) sid from Orders";
    	pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
    		rs.next();
    	String sid = rs.getString("sid");
    	int id = Integer.parseInt(sid.substring(1));
    	id++;
    	sid = String.format("O%03d", id);
		return sid;
		}

		@Override
		public List<Orders> showOrderDao() throws ClassNotFoundException, SQLException {
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from Orders";
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			Orders order = null;
			List<Orders> orderList = new ArrayList<Orders>();
			while(rs.next()) {
				order = new Orders();
				order.setOrderId(rs.getString("OrderId"));
				order.setStockID(rs.getString("StockID"));
				order.setBillAmount(rs.getDouble("billAmount"));
				orderList.add(order);
			}
			return orderList;
		}


		@Override
		public Orders searchOrderDao(String OrderId) throws ClassNotFoundException, SQLException {
			connection = ConnectionHelper.getConnection();
			String cmd = "select * from Orders where OrderId = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, OrderId);
			ResultSet rs = pst.executeQuery();
			Orders order = null;
			if (rs.next()) {
				order = new Orders();
				order.setOrderId(rs.getString("OrderId"));
				order.setStockID(rs.getString("StockID"));
				order.setBillAmount(rs.getInt("BillAmount"));
			}
			return order;
			}

		@Override
		public String addOrderDao(Orders order) throws ClassNotFoundException, SQLException {
			String id = generateOrderId();
			order.setOrderId(id);
			connection = ConnectionHelper.getConnection();
			String cmd = "Insert into Orders(OrderId,Stockid, BillAmount)value(?,?,?)";
			pst= connection.prepareStatement(cmd);
			pst.setString(1, order.getOrderId());
			pst.setString(2, order.getStockID());
			pst.setDouble(3, order.getBillAmount());
			pst.executeUpdate();
			System.out.println("***Order updated****");
			return "Order insert";
		}
		

	}




