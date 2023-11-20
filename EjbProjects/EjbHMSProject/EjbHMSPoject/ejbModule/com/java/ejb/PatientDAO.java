package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
	
	String addPatientDao(Patient_master patient) throws ClassNotFoundException, SQLException;
	List<Patient_master> showPatientDao() throws ClassNotFoundException, SQLException;


}
