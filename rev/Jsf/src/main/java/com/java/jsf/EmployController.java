package com.java.jsf;

import java.util.List;

public class EmployController {
	
	private EmployDAO employDao;
	private Employ employ;
	
	public EmployDAO getEmployDao() {
		return employDao;
	}
	public void setEmployDao(EmployDAO employDao) {
		this.employDao = employDao;
	}
	public Employ getEmploy() {
		return employ;
	}
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
	
	
public List<Employ> showEmployDao(){
	return employDao.showEmploy();
}

public String searchemploy(int empno) {
	return employDao.searchEmploy(empno);
	
}
public String validate(Login login) {
	return employDao.validate(login);
}

}
