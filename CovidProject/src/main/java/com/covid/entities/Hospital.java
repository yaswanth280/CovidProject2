package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	@Column(name="hid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hospitalId;
	
	@Column(name="hname")
	private String hospitalName;
	
	@Column(name="hlocation")
	private String hospitalLocation;
	
	public Hospital() {
		super();
	}

	

	public Hospital(int hospitalId, String hospitalLocation, String hospitalName) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalLocation = hospitalLocation;
		this.hospitalName = hospitalName;
	}



	public int getHospitalId() {
		return hospitalId;
	}


	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}


	public String getHospitalLocation() {
		return hospitalLocation;
	}


	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}


	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}



	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalLocation=" + hospitalLocation + ", hospitalName="
				+ hospitalName + "]";
	}

	

	
	

}