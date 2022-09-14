package com.covid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Hospital;

public interface IHospitalDAO extends JpaRepository<Hospital, Integer>{

}
