package com.java.ejb;

public class DOCTOR_MASTER {
	
	private String dr_id;
	private String  dr_name;
	private String dept;
	public String getDr_id() {
		return dr_id;
	}
	public void setDr_id(String dr_id) {
		this.dr_id = dr_id;
	}
	public String getDr_name() {
		return dr_name;
	}
	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public DOCTOR_MASTER(String dr_id, String dr_name, String dept) {
		super();
		this.dr_id = dr_id;
		this.dr_name = dr_name;
		this.dept = dept;
	}
	public DOCTOR_MASTER() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DOCTOR_MASTER [dr_id=" + dr_id + ", dr_name=" + dr_name + ", dept=" + dept + "]";
	}
	
	
	

}
