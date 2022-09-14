package com.covid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Vaccination;

public interface IVaccinationDAO extends JpaRepository<Vaccination, Integer>{

}
