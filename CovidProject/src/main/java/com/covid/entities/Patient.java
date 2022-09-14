package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	
	@Column(name="pname")
    private String patientName;
	
	@Column(name="pmobile")
	private String patientMobile;
	
	@Column(name="page")
	private int patientAge;
	
	@Column(name="pgender")
	private String patientGender;
	
	@ManyToOne(targetEntity = Vaccination.class)
	 @JoinColumn(name="vid", nullable = false)
	 private Vaccination vaccination;
	 

    
	public Patient() {
		super();
	}
	
	public Patient(int patientId, String patientName, String patientMobile, int patientAge, String patientGender,
			Vaccination vaccination) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientMobile = patientMobile;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.vaccination = vaccination;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientMobile() {
		return patientMobile;
	}

	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public Vaccination getVaccination() {
		return vaccination;
	}

	public void setVaccination(Vaccination vaccination) {
		this.vaccination = vaccination;
	}
	

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientMobile=" + patientMobile
				+ ", patientAge=" + patientAge + ", patientGender=" + patientGender + ", vaccination=" + vaccination
				+ "]";
	}

	
}
