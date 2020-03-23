package com.example.demo.model;

import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.example.demo.model.Account;
@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int pId;
private String name;

//@Access(AccessType.FIELD)
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="Account_fk", referencedColumnName = "accountId")
private Account account;
//private String email;


public Person(String name2) {
	super();
	this.name = name2;
	//this.email = email;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
//public String getEmail() {
//	return email;
//}
//public void setEmail(String email) {
//	this.email = email;
//}
}
