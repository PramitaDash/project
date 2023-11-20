package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO{
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<DOCTOR_MASTER> showDoctorDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from DOCTOR_MASTER";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<DOCTOR_MASTER> DoctorList = new ArrayList<DOCTOR_MASTER>();
		DOCTOR_MASTER doctor = null;
		while(rs.next()){
			doctor = new DOCTOR_MASTER();
			doctor.setDr_id(rs.getString("dr_id"));
			doctor.setDr_name(rs.getString("dr_name"));
			doctor.setDept(rs.getString("dept"));
			DoctorList.add(doctor);
			
		}

		// TODO Auto-generated method stub
		return DoctorList;
	}

}
