package com.slokam.healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Dao.DoctorDao;
import com.slokam.healthcare.entity.Doctor;

@RestController
public class DoctorController {
	@Autowired
	private DoctorDao doctordao;
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody Doctor doctor){
		doctordao.save(doctor);
		
	}

}
