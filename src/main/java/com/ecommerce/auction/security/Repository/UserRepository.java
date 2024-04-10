package com.ecommerce.auction.security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.security.Model.User;



public interface UserRepository extends JpaRepository<User, Long> {
		Optional<User>	findByEmail(String email);
		}


