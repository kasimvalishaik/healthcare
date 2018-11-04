package com.slokam.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.DiseaseDao;
import com.slokam.healthcare.entity.Disease;

@Service
public class DiseaseService {
	@Autowired
	private DiseaseDao diseasedao;
	public void saveDisease(Disease disease){
		diseasedao.save(disease);
	}

}
