package com.slokam.healthcare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaint")
public class Complaint {
	@Id
	@GeneratedValue
	private Long id;
	private String description;
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting visiting;
	@ManyToMany
	@JoinTable(name="complaint_disease",joinColumns={@JoinColumn(name="cid")},inverseJoinColumns={@JoinColumn(name="deid")})
	private List<Disease> disease;
	@OneToMany(mappedBy="complaint",cascade=CascadeType.ALL)
	private List<Medication> medicationlist;
	public List<Medication> getMedicationlist() {
		return medicationlist;
	}

	public void setMedicationlist(List<Medication> medicationlist) {
		this.medicationlist = medicationlist;
	}

	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}
	

}
