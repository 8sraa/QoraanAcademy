package com.QoraanAcademy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class Admin extends Person {
	
//private static final String GenerationType = null;
//	attributes 
	@Id
	private String id;
		
//	#Methods
	public String getId() {
		return id;
	}
	
	public void addStudent(){}
	public void addTeacher(){}
	public void deleteStudent(){}
	public void deleteTeacher(){}
	public String searchStudent(){
		return "Sting";
	}
	public String searchTeacher(){
		return "Sting";
	}
	public Admin orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
