package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

public class PatientEjbImpl {
	
	public List<Patient_master> showPatientEjb() throws NamingException, ClassNotFoundException, SQLException{
		HMSEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showPatient();
	}

}
