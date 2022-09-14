package com.covid.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.covid.dto.PatientDto;
import com.covid.entities.Patient;


public interface IPatientService {
	
	public List<Patient> getPatient();
	public Patient getPatientById(int patientId);
	public Patient addPatient(PatientDto patient);
	public Patient updatePatient(PatientDto patient);
	public void deletePatient(int patientId);
	
}
