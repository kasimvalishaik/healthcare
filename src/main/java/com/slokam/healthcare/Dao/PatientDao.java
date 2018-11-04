package com.slokam.healthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
	@Query("select d.name, di.name, p.name from Medication m join m.medicine me join m.complaint c join c.visiting v join v.apointment a join a.patient p join v.doctor d join c.disease di where me.name=?1")
	public List<Object[]> getpatientBymedicine(String medicinename );

}
		