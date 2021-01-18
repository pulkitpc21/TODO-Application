package com.kadyan.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private long id;
	
	@Column(name = "first_name")
private  String firstname;
	
	@Column(name = "last_name")
private String lastname;
	
	@Column(name="email")
private String email;
	
	@Column(name="phone")
private int phone;
	
	@Column(name="state")
	private String state;
	
	@Column(name="priority")
	private int priority;

public Employee() {
	super();
}

public Employee(String firstname, String lastname, String email, int phone , String state , int priority) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	this.state = state;
	this.priority = priority;
}
public long getId() {
	return id;
}
public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}

public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
}