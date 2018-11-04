package com.slokam.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.DoctorDao;
import com.slokam.healthcare.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao doctordao;
	public void saveDoctor(Doctor doctor){
		doctordao.save(doctor);
		
	}

}
