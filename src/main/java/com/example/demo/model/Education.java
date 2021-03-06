package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Education {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Eid;
private String School;
@ManyToOne
@JoinColumn(name="profile_id")
private profile profile;
private String Degree;
private String endDate;
private String startDate;
public Education(String school, String degree, String endDate, String startDate) {
	super();
	School = school;
	Degree = degree;
	this.endDate = endDate;
	this.startDate = startDate;
}

public String getSchool() {
	return School;
}
public void setSchool(String school) {
	School = school;
}
public String getDegree() {
	return Degree;
}
public void setDegree(String degree) {
	Degree = degree;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}


	
}
