package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Admin;
import com.ecommerce.auction.service.AdminService;


@RestController
@RequestMapping("api/v1/Admin")

public class AdminController {
	
	@Autowired
	public AdminService adminService;
 


	@PostMapping("/save_admin")
	public Admin saveAdmin(Admin admin) {
		return adminService.saveAdmin(admin);
	}

	@GetMapping("/liste_admin")
	public List<Admin> getalllistAdmin() {
		return adminService.getalllistAdmin();
	}

	@GetMapping("/admin/{id}")
	public Admin getAdminByid(@PathVariable Long id) {
		return adminService.getAdminByid(id);
	}

	@DeleteMapping("/delete_admin")
	public void deleteAdmin(@PathVariable Long Adminid) {
		adminService.deleteAdmin(Adminid);
	}
	
	

}
