package com.java.inventory;


import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
	
	List<Orders> showOrderDao() throws ClassNotFoundException, SQLException;
	Orders searchOrderDao(String OrderId) throws ClassNotFoundException, SQLException ;
	String addOrderDao(Orders order) throws ClassNotFoundException, SQLException;

}
