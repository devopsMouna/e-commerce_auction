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

import com.ecommerce.auction.security.Model.User;
import com.ecommerce.auction.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
    
	@GetMapping("/list_user")
	public List<User> getalllistUser() {
		return userService.getalllistUser();
	}

	@DeleteMapping("/user/{id}")
	public User getUserByid(@PathVariable Long id) {
		return userService.getUserByid(id);
	}

	@DeleteMapping("/delete_user")
	public void deleteUser(Long Userid) {
		userService.deleteUser(Userid);
	}

	
	
	
}
