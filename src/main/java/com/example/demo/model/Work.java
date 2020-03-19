package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Work {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int workid;
private String title;
private String Company;
private String startDate;

@ManyToOne
@JoinColumn(name="profile_id")
private profile profile;
private String endDate;
public Work(int workid, String title, String company, String startDate, String endDate) {
	super();
	this.workid = workid;
	this.title = title;
	Company = company;
	this.startDate = startDate;
	this.endDate = endDate;
}
public int getWorkid() {
	return workid;
}
public void setWorkid(int workid) {
	this.workid = workid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}


}
