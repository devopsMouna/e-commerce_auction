package com.ecommerce.auction.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.security.Model.User;



public interface UserRepos extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String username);
	
}
