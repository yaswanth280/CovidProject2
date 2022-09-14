package com.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.covid.entities.Hospital;
import com.covid.service.IHospitalService;

@RestController
@ResponseBody
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	IHospitalService hservice;
	
	@GetMapping("/allhospitals")
	public List<Hospital> getHospital(){
		System.out.println("fetching hospital details");
		return this.hservice.getHospital();
	}
	
	@GetMapping("/{hospitalId}")
	public Hospital getHospitalById(@PathVariable int hospitalId) {
		return this.hservice.getHospitalById(hospitalId);
	}
	
	@PostMapping("/addhospital")
	public Hospital addHospital(@RequestBody Hospital hospital) {
		return this.hservice.addHospital(hospital);
	}
	
	@PutMapping("/updatehospital")
	public Hospital updateHospital(@RequestBody Hospital Hospital) {
		return this.hservice.updateHospital(Hospital);
	}
	
	@DeleteMapping("/{hospitalId}")
	public void deleteHospital(@PathVariable int hospitalId) {
			this.hservice.deleteHospital(hospitalId);
	}
	
}
