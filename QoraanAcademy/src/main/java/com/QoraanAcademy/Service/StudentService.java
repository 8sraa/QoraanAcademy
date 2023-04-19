//package com.QoraanAcademy.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Service;
//
//import com.QoraanAcademy.Repository.StudentRepository;
//import com.QoraanAcademy.model.Student;
//
//@Service
//public class StudentService {
//	
//	@Autowired
//	private StudentRepository studentRepository; 
//	
//	public Student findById(String id) {
//		
//		return studentRepository.findById(id).get();
//	}
//}	