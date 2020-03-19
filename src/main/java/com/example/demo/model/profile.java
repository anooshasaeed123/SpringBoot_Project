package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String gender;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="Work_id", referencedColumnName = "workid")
	@OneToMany(mappedBy="profile",cascade = CascadeType.ALL)
	private List<Work> work;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="Education_id", referencedColumnName = "Eid")
	
	@OneToMany(mappedBy="profile",cascade = CascadeType.ALL)
	private List<Education> education;
	@OneToOne(mappedBy = "profile")
	private Member member;

public profile(int id,String gender, Work work, Education education) {
		super();
		pid = id;
		this.gender = gender;

	}
public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Work> getWork() {
		return work;
	}
	public void setWork(Work work) {
		this.work.add(work);
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education.add(education);
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}


}
