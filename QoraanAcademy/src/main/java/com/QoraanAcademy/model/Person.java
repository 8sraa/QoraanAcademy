package com.QoraanAcademy.model;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.validation.constraints.Email;


public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	@Email @Indexed(unique = true) 
	private String email;
	private String gender;
	
	public Person(String firstName, String lasttName, int age, String email, String gander) {
		super();
		this.firstName = firstName;
		this.lastName = lasttName;
		this.age = age;
		this.email = email;
		this.gender = gander;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
	//public void logout() {};
}
