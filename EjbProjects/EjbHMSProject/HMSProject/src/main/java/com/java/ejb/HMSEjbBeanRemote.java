package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface HMSEjbBeanRemote {
	
	List<DOCTOR_MASTER> showDoctor() throws ClassNotFoundException, SQLException;
	List<Patient_master> showPatient() throws ClassNotFoundException, SQLException;

}
