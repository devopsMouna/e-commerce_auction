package com.ecommerce.auction.service;



import java.util.List;

import com.ecommerce.auction.entities.Admin;




public interface AdminService {
	
	public Admin saveAdmin(Admin admin);
	public List<Admin> getalllistAdmin();
    public Admin getAdminByid(Long id);
    public void deleteAdmin(Long Adminid);
    
	

}
