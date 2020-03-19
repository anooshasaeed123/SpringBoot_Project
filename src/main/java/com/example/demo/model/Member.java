package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Member {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int memberid;
private String DateofMembership;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="Profile_fk", referencedColumnName = "pid")
private profile profile;

public Member(int memberid, String dateofMembership, com.example.demo.model.profile profile) {
	super();
	this.memberid = memberid;
	DateofMembership = dateofMembership;
	this.profile = profile;
}

public int getMemberid() {
	return memberid;
}

public void setMemberid(int memberid) {
	this.memberid = memberid;
}

public String getDateofMembership() {
	return DateofMembership;
}

public void setDateofMembership(String dateofMembership) {
	DateofMembership = dateofMembership;
}

public profile getProfile() {
	return profile;
}

public void setProfile(profile profile) {
	this.profile = profile;
}

}
