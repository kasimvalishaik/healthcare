package com.slokam.healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Disease;
import com.slokam.healthcare.service.DiseaseService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("disease")
public class DiseaseController {
	@Autowired
	private DiseaseService diseaseservice;
	@PostMapping
	public void saveDisease(@RequestBody Disease disease){
		diseaseservice.saveDisease(disease);
	}

}
