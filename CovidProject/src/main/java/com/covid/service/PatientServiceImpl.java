package com.covid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.dao.IPatientDAO;
import com.covid.dao.IVaccinationDAO;
import com.covid.dto.PatientDto;
import com.covid.entities.Patient;
import com.covid.entities.Vaccination;
import com.covid.exception.PatientNotFoundException;

@Service
public class PatientServiceImpl implements IPatientService{
	
	@Autowired
	private IPatientDAO patientDAO;
	
	@Autowired
	private IVaccinationDAO vaccinationDAO;
	
	@Override
	public List<Patient> getPatient(){
		return patientDAO.findAll();
	}
	@Override
	public Patient getPatientById(int patientId) {
		Patient patient;
		if(patientDAO.findById(patientId).get()!=null) {
			patient=patientDAO.findById(patientId).get();
		}
		else {
			throw new PatientNotFoundException();
		}
		return patient;
	
	}
	@Override
	public Patient addPatient(PatientDto patient) {
		Patient pat=new Patient();
		pat.setPatientId(patient.getPatientId());
		pat.setPatientName(patient.getPatientName());
		pat.setPatientAge(patient.getPatientAge());
		pat.setPatientGender(patient.getPatientGender());
		Optional<Vaccination> vacc=vaccinationDAO.findById(patient.getVaccinationId());
		Vaccination vac=vacc.get();
		pat.setVaccination(vac);
		patientDAO.save(pat);
        return pat;
	}
	@Override
	public Patient updatePatient(PatientDto patient) {
		Patient pat=new Patient();
		pat.setPatientId(patient.getPatientId());
		pat.setPatientName(patient.getPatientName());
		pat.setPatientAge(patient.getPatientAge());
		pat.setPatientGender(patient.getPatientGender());
		Optional<Vaccination> vacc=vaccinationDAO.findById(patient.getVaccinationId());
		Vaccination vac=vacc.get();
		pat.setVaccination(vac);
		patientDAO.save(pat);
        return pat;
	}
	@Override
	public void deletePatient(int patientId) {
		Patient pat=patientDAO.getOne(patientId);
        patientDAO.delete(pat);
	}
	
}