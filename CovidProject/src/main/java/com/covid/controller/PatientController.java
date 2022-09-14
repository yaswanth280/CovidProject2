package com.covid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.covid.dto.PatientDto;
import com.covid.entities.Patient;
import com.covid.exception.PatientNotFoundException;
import com.covid.service.IPatientService;


@RestController
@ResponseBody
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	IPatientService pservice;
	
	@GetMapping("/allpatients")
	public List<Patient> getPatient(){
		System.out.println("fetching patient records");
		return this.pservice.getPatient();
	}
	
	@GetMapping("{patientId}")
	public ResponseEntity getPatientById(@PathVariable int patientId) throws PatientNotFoundException {
		return new ResponseEntity(this.pservice.getPatientById(patientId),HttpStatus.OK); 
	}
	
	@PostMapping("/addpatient")
	public Patient addPatient(@RequestBody PatientDto patient) {
		return this.pservice.addPatient(patient);
	}
	
	@PutMapping("/updatepatient")
	public Patient updatePatient(@RequestBody PatientDto patient) {
		return this.pservice.updatePatient(patient);
	}
	
	@DeleteMapping("/{patientId}")
	public void deletePatient(@PathVariable int patientId){
			this.pservice.deletePatient(patientId);
	}
	
}
