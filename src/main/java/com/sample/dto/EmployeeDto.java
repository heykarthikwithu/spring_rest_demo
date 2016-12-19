package com.sample.dto;

import java.io.Serializable;


public class EmployeeDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private long getId() {
		return id;
	}
	private void setId(long id) {
		this.id = id;
	}
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	

}
