package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
	
	Connection connection;
	PreparedStatement pst;

	@Override
	public String addPatientDao(Patient_master patient) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Patient(pid,name,age,weight,gender,address,phoneno,disease,doctor_id)"
				+ "values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = connection.prepareStatement(cmd);
        pst.setString(1,patient.getPid());
        pst.setString(2,patient.getName());
        pst.setInt(3,patient.getAge());
        pst.setInt(4,patient.getWeight());
        pst.setString(5, patient.getGender().toString());
        pst.setString(6, patient.getAddress());
        pst.setString(7, patient.getPhoneno());
        pst.setString(8, patient.getDisease());
        pst.setString(9, patient.getDoctor_id());

        pst.executeUpdate();
        return "Patient Record Inserted...";
	
	}

	@Override
	public List<Patient_master> showPatientDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Patient_master ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Patient_master> patientList = new ArrayList<Patient_master>();
		Patient_master patient = null;
		while(rs.next()){
			patient = new Patient_master();
			patient.setPid(rs.getString("pid"));
			patient.setName(rs.getString("name"));
			patient.setAge(rs.getInt("age"));
			patient.setWeight(rs.getInt("weight"));
			patient.setGender(rs.getString("gender"));
			patient.setAddress(rs.getString("address"));
			patient.setPhoneno(rs.getString("phoneno"));
			patient.setDisease(rs.getString("disease"));
			patient.setDoctor_id(rs.getString("doctor_id"));
			patientList.add(patient);
		
	}
		return patientList;

}
}
