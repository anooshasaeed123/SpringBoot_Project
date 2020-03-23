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
private int accountId;
private String email;
private String password;

@OneToOne(mappedBy = "account")
private Person person;


public Account(String accountStatus,String email, String password) {
	super();
	this.accountStatus = accountStatus;
	this.email = email;
	this.password = password;
	
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
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
