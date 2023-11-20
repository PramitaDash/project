package com.java.ejb;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_details")
public class InsuranceDetails implements Serializable{
	
@Id
@GeneratedValue

@Column(name="insurance_id")
private String insurance_id;

@Column(name="insuranceName")
private String insuranceName;

@Column(name="insuranceType")
private String insuranceType;

@Column(name="premiumStart")
private String premiumStart;

@Column(name="premiumEnd")
private String premiumEnd;

@Column(name="minPeriod")
private String minPeriod;

@Column(name="maxPeriod")
private String maxPeriod;

@Column(name="launchDate")
private Date launchDate;

@Column(name="status")
private String status;

public String getInsuranceId() {
	return insuranceId;
}

public void setInsuranceId(String insuranceId) {
	this.insuranceId = insuranceId;
}

public String getInsuranceName() {
	return insuranceName;
}

public void setInsuranceName(String insuranceName) {
	this.insuranceName = insuranceName;
}

public String getInsuranceType() {
	return insuranceType;
}

public void setInsuranceType(String insuranceType) {
	this.insuranceType = insuranceType;
}

public String getPremiumStart() {
	return premiumStart;
}

public void setPremiumStart(String premiumStart) {
	this.premiumStart = premiumStart;
}

public String getPremiumEnd() {
	return premiumEnd;
}

public void setPremiumEnd(String premiumEnd) {
	this.premiumEnd = premiumEnd;
}

public String getMinPeriod() {
	return minPeriod;
}

public void setMinPeriod(String minPeriod) {
	this.minPeriod = minPeriod;
}

public String getMaxPeriod() {
	return maxPeriod;
}

public void setMaxPeriod(String maxPeriod) {
	this.maxPeriod = maxPeriod;
}

public Date getLaunchDate() {
	return launchDate;
}

public void setLaunchDate(Date launchDate) {
	this.launchDate = launchDate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}



}
