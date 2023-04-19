package com.QoraanAcademy.Repository;

import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.QoraanAcademy.model.Admin;
public interface AdminRepository extends MongoRepository<Admin, String> {
	
	Optional<Admin> findById(String id);
	
	Admin deleteByEmail(String email);
	
	@Query("{email: '?0'}")
	Admin findByEmail(String email);
	
	Admin searchAdminByEmail(String email);
}
