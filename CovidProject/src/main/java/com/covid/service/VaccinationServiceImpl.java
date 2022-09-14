package com.covid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.dao.IVaccinationDAO;
import com.covid.entities.Vaccination;

@Service
public class VaccinationServiceImpl implements IVaccinationService{
	@Autowired
	private IVaccinationDAO vaccinationDAO;
	
	public List<Vaccination> getVaccination() {
		return vaccinationDAO.findAll();		
	}
	public Vaccination getVaccinationById(int patientId) {
		return vaccinationDAO.findById(patientId).get();		
	}
	public Vaccination addVaccination(Vaccination vaccination) {
		vaccinationDAO.save(vaccination);
        return vaccination;		
	}
	public Vaccination updateVaccination(Vaccination vaccination) {
		vaccinationDAO.save(vaccination);
        return vaccination;
	}
	public void deleteVaccination(int patientId) {
		Vaccination vac=vaccinationDAO.getOne(patientId);
        vaccinationDAO.delete(vac);
	}
	

}