package com.slokam.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.AppointmentDao;
import com.slokam.healthcare.entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao appointmentdao;
	public void saveAppointmennt(Appointment appointment){
		appointmentdao.save(appointment);
		
	}

}
