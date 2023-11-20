package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HMSEjbBean
 */
@Stateless
@Remote(HMSEjbBeanRemote.class)
public class HMSEjbBean implements HMSEjbBeanRemote {

    /**
     * Default constructor. 
     */
    public HMSEjbBean() {
        // TODO Auto-generated constructor stub
    }
    static DoctorDAO daoImpl;
    static PatientDAO daoImpl1;
    static {
    	daoImpl = new DoctorDAOImpl();
    	daoImpl1 = new PatientDAOImpl();
    }

	@Override
	public List<DOCTOR_MASTER> showDoctor() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.showDoctorDao();
	}

	@Override
	public List<Patient_master> showPatient() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl1.showPatientDao();
	}

}
