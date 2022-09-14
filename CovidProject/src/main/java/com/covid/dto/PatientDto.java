package com.covid.dto;

public class PatientDto {
	private int patientId;
    private String patientName;
    private String patientMobile;
    private int patientAge;
    private String patientGender;
	private int vaccinationId;
	
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
	public int getVaccinationId() {
		return vaccinationId;
	}
	public void setVaccinationId(int vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
	
	
}
