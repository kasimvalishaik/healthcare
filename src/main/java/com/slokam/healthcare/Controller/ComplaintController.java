package com.slokam.healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Complaint;
import com.slokam.healthcare.service.ComplaintService;

@RestController
@RequestMapping("complaint")
public class ComplaintController {
	@Autowired
	private ComplaintService complaintservice;
	@PostMapping
	public void saveComplaint(@RequestBody Complaint complaint){
		complaintservice.saveComplaint(complaint);
	}

}
