package com.slokam.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.VisitingDao;
import com.slokam.healthcare.entity.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao visitingdao;
	public void saveVisiting(Visiting visiting){
		visitingdao.save(visiting);
	}

}
