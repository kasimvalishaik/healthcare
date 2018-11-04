package com.slokam.healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Dao.PatientDao;
import com.slokam.healthcare.entity.Patient;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired
	private PatientDao patientdao;
	
	public void savePatient(@RequestBody Patient patient){
	patientdao.save(patient);
		
	}
	@GetMapping("/byMedicine/{name}")
	public List<Object[]> getpatientBymedicine(@PathVariable("name") String medicinename ){
		return patientdao.getpatientBymedicine(medicinename);
	}

	

}
