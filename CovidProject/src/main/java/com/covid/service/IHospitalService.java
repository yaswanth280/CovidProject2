package com.covid.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.covid.entities.Hospital;


public interface IHospitalService {
	
	public List<Hospital> getHospital();
	public Hospital getHospitalById(int hospitalId);
	public Hospital addHospital(Hospital hospital);
	public Hospital updateHospital(Hospital Hospital);
	public void deleteHospital(int hospitalId);
	
}
