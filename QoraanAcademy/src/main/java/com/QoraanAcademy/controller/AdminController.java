package com.QoraanAcademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QoraanAcademy.Service.AdminService;
import com.QoraanAcademy.model.Admin;

import jakarta.validation.Valid;
@Validated
@RestController     
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	private AdminService adminService; 
	/*** Inject Service Layer ***/
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
    
	@PostMapping("")
    public ResponseEntity<?> insertAdmin(@RequestBody @Valid Admin entity) {
        return ResponseEntity.ok(adminService.insert(entity));
    }
	
	// search for an admin by email	
    @GetMapping("/{email}") 
    public ResponseEntity<?> getAdminByEmail(@PathVariable String email) {
    	return ResponseEntity.ok(adminService.findAdminByEmail(email));
    }
    
    @GetMapping("")
    public ResponseEntity<?> findAll(){
    	return ResponseEntity.ok(adminService.findAll());
    }
	
    @PutMapping("/{email}")
    public ResponseEntity<?> update(@RequestBody @Valid Admin entity){
    	return ResponseEntity.ok(adminService.update(entity));
    }
    
    // delete an admin from the database
	@DeleteMapping("/{email}")
    public ResponseEntity<?> deleteAdminByEmail(@PathVariable String email) {
		adminService.deleteByEmail(email);
        return ResponseEntity.ok(null);
	}

    
   
//    @GetMapping("/find-by-email/{email}")
//    public ResponseEntity<?> findAdminByEmail(String email) {
//        return ResponseEntity.ok(adminRepository.findByEmail(email));
//    }
}

  
