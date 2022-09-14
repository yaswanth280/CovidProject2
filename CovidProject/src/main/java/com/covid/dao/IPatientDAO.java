package com.covid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Patient;

public interface IPatientDAO extends JpaRepository<Patient, Integer>{

}
