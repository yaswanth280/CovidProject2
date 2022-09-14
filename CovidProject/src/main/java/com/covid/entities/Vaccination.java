package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccination")
public class Vaccination {
	
	@Id
	@Column(name="vid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccinationId;
	
//	@Column(name="pid")
//	private int patientId;
//	
//	@Column(name="hid")
//	private int hospitalId;
	
	@Column(name="vname")
	private String vaccinationName;
	
//	@Column(name="vdosage")
//	private int vaccinationDosage;
	
	
	
	public Vaccination() {
		super();
	}

public Vaccination(int vaccinationId, String vaccinationName) {
	super();
	this.vaccinationId = vaccinationId;
	this.vaccinationName = vaccinationName;
}

public int getVaccinationId() {
	return vaccinationId;
}

public void setVaccinationId(int vaccinationId) {
	this.vaccinationId = vaccinationId;
}

public String getVaccinationName() {
	return vaccinationName;
}

public void setVaccinationName(String vaccinationName) {
	this.vaccinationName = vaccinationName;
}

@Override
public String toString() {
	return "Vaccination [vaccinationId=" + vaccinationId + ", vaccinationName=" + vaccinationName + "]";
}
	
}
