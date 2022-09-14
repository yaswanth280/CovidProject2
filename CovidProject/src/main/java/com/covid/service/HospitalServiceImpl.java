package com.covid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.dao.IHospitalDAO;
import com.covid.entities.Hospital;
import com.covid.exception.HospitalNotFoundException;

@Service
public class HospitalServiceImpl implements IHospitalService{
	@Autowired
	private IHospitalDAO hospitalDAO;
	@Override
	public List<Hospital> getHospital() {
		return hospitalDAO.findAll();
	}
	@Override
	public Hospital getHospitalById(int hospitalId) {
		Hospital hospital;
		
		if(hospitalDAO.findById(hospitalId).get()!=null) {
			hospital=hospitalDAO.findById(hospitalId).get();
		}
		else {
			throw new HospitalNotFoundException();
		}
		
		return hospital;
	}
	@Override
	public Hospital addHospital(Hospital hospital) {
		hospitalDAO.save(hospital);
        return hospital;
	}
	@Override
	public Hospital updateHospital(Hospital hospital) {
		hospitalDAO.save(hospital);
        return hospital;
	}
	@Override
	public void deleteHospital(int hospitalId) {
		Hospital hop=hospitalDAO.getOne(hospitalId);
        hospitalDAO.delete(hop);
	}

}