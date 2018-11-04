package com.slokam.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.ComplaintDao;
import com.slokam.healthcare.entity.Complaint;
import com.slokam.healthcare.entity.Medication;

@Service
public class ComplaintService {
	@Autowired
	private ComplaintDao complaintdao;
	
	public void saveComplaint(Complaint complaint){
	List<Medication> medication=	complaint.getMedicationlist();
	for (Medication mec : medication) {
		mec.setComplaint(complaint);
	}
		complaintdao.save(complaint);
	}
}
