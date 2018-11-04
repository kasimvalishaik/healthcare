package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.PatientDao;

@Service
public class PatientService {
	@Autowired
	private PatientDao patientdao;
	public List<Object[]> getpatientBymedicine(String medicinename ){
		return patientdao.getpatientBymedicine(medicinename);
		
	}

}
