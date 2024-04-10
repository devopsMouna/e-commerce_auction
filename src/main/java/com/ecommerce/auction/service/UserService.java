package com.ecommerce.auction.service;



import java.util.List;

import com.ecommerce.auction.security.Model.User;



public interface UserService {
	
	public User saveUser(User user);
	public List<User> getalllistUser();
    public User getUserByid(Long id);
    public void deleteUser(Long Userid);
	

}
