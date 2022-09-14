package com.covid.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.covid.entities.Vaccination;


public interface IVaccinationService {
	
	public List<Vaccination> getVaccination();
	public Vaccination getVaccinationById(int patientId);
	public Vaccination addVaccination(Vaccination vaccination);
	public Vaccination updateVaccination(Vaccination vaccination);
	public void deleteVaccination(int patientId);
	
}
