package com.QoraanAcademy.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.QoraanAcademy.Repository.AdminRepository;
import com.QoraanAcademy.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin insert(Admin admin) {
		return adminRepository.insert(admin);
	}
	public Admin findAdminByEmail(String email) {
        return adminRepository.findByEmail(email);
    }
	
	public List<Admin> findAll(){
		return adminRepository.findAll();
	}
		
	public Admin update(Admin admin) {
		Admin new_adminInfo = findAdminByEmail(admin.getEmail());
		new_adminInfo.setFirstName(admin.getFirstName());
		new_adminInfo.setLastName(admin.getLastName());
		new_adminInfo.setAge(admin.getAge());
		new_adminInfo.setEmail(admin.getEmail());
		new_adminInfo.setGender(admin.getGender());
		
		return adminRepository.save(new_adminInfo);
	}
	
	public void deleteByEmail(String email) {
		adminRepository.deleteByEmail(email);
	}
}