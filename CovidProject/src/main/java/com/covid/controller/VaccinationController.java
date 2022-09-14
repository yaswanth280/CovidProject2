package com.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.covid.entities.Vaccination;
import com.covid.service.IVaccinationService;

@RestController
@ResponseBody
@RequestMapping("/vaccination")
public class VaccinationController {

	@Autowired
	IVaccinationService vservice;
	
	@GetMapping("/allvaccinations")
	public List<Vaccination> getVaccination(){
		System.out.println("fetching vaccination records");
		return this.vservice.getVaccination();
	}
	
	@GetMapping("/{patientId}")
	public Vaccination getVaccinationById(@PathVariable int patientId) {
		return this.vservice.getVaccinationById(patientId);
	}
	
	@PostMapping("/addvaccination")
	public Vaccination addVaccination(@RequestBody Vaccination vaccination) {
		return this.vservice.addVaccination(vaccination);
	}
	
	@PutMapping("/updatevaccination")
	public Vaccination updateVaccination(@RequestBody Vaccination vaccination) {
		return this.vservice.updateVaccination(vaccination);
	}
	
	@DeleteMapping("/{patientId}")
	public void deleteVaccination(@PathVariable int patientId) {
			this.vservice.deleteVaccination(patientId);
	}
	
}
