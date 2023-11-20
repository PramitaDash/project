package com.java.ejb;

import java.io.Serializable;

public class Patient_master implements Serializable {
	
	private String pid;
	private String name;
	private int age;
	private int weight;
	private String gender;
	private String address;
	private String phoneno;
	private String disease;
	private String doctor_id;
	public Patient_master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient_master(String pid, String name, int age, int weight, String gender, String address, String phoneno,
			String disease, String doctor_id) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.address = address;
		this.phoneno = phoneno;
		this.disease = disease;
		this.doctor_id = doctor_id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	
	
}