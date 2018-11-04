package com.slokam.healthcare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.entity.Appointment;
import com.slokam.healthcare.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentservice;
	@PostMapping
	public void saveAppointment(@RequestBody Appointment appointment){
		
		appointmentservice.saveAppointmennt(appointment);
	}

}
