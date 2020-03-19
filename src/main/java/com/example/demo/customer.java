package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Creates a table automatically when this application runs. 
@Table(name ="customer")
public class customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cid;
private String cname;
private String email;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "customer [cid=" + cid + ", cname=" + cname + ", email=" + email + "]";
}


}
