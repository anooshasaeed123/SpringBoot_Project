package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.example.demo.model.Person;
@Entity
public class Account {

private String accountStatus;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private String accountId;
private String password;

@OneToOne(mappedBy = "account")
private Person person;


public Account(String accountStatus, String accountId, String password,Person person) {
	super();
	this.accountStatus = accountStatus;
	this.accountId = accountId;
	//this.person = person;
	this.password = password;
	
}
//public Person getPerson() {
//	return person;
//}
//public void setPerson(Person person) {
//	this.person = person;
//}
public String getAccountStatus() {
	return accountStatus;
}
public void setAccountStatus(String accountStatus) {
	this.accountStatus = accountStatus;
}
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Account [accountStatus=" + accountStatus + ", accountId=" + accountId + ", password=" + password + "]";
}

}
