package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface DoctorDAO {
	
	List<DOCTOR_MASTER> showDoctorDao() throws ClassNotFoundException, SQLException;

}