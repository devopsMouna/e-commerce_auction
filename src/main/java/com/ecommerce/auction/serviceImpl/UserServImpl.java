package com.ecommerce.auction.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.repository.UserRepos;
import com.ecommerce.auction.security.Model.User;
import com.ecommerce.auction.service.UserService;


@Service
public class UserServImpl implements UserService {
	
	@Autowired
	public UserRepos userRepos;

	@Override
	public User saveUser(User user) {
		
		return userRepos.save(user);
	}

	@Override
	public List<User> getalllistUser() {
		
		return userRepos.findAll();
	}

	@Override
	public User getUserByid(Long id) {
		
		return userRepos.getById(id);
	}

	@Override
	public void deleteUser(Long Userid) {
		
		
	}




}
