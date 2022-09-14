package com.covid;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.covid.dao.IHospitalDAO;
import com.covid.entities.Hospital;

@SpringBootTest
class HospitalTest {
	@Autowired
	IHospitalDAO hospitaldao;

	@Test
	void testInjection() {
		assertThat(hospitaldao).isNotNull();
	}
	
	@Test
	void test() {
		Hospital h=new Hospital(1,"Hyderabad","Apollo");
		hospitaldao.save(h);
		assertEquals(hospitaldao.findById(1).get().toString(),h.toString());
	}

}